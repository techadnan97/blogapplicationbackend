package com.blog.serviceimpl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import com.blog.entity.User;
import com.blog.exceptions.ResourceNotFoundException;
import com.blog.payloads.UserDto;
import com.blog.repository.UserRepository;
import com.blog.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;
	private ModelMapper mapper;

	public UserServiceImpl(UserRepository userRepository, ModelMapper mapper) {
		super();
		this.userRepository = userRepository;
		this.mapper = mapper;
	}

	@Override
	public UserDto createUser(UserDto userDto) {
		User user = this.mapper.map(userDto, User.class);

		return this.mapper.map(this.userRepository.save(user), UserDto.class);
	}

	@Override
	public UserDto updateUser(UserDto userDto, Long id) {
		User user = this.userRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("User", "ID", id));
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		user.setAbout(userDto.getAbout());

		return this.mapper.map(this.userRepository.save(user), UserDto.class);
	}

	@Override
	public void deleteUser(Long id) {
		User user = this.userRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("User", "ID", id));
		this.userRepository.delete(user);

	}

	@Override
	public List<UserDto> getUserList() {
		return this.mapper.map(this.userRepository.findAll(), new TypeToken<List<UserDto>>() {
		}.getType());
	}

	@Override
	public UserDto getUserById(Long id) {
		User user = this.userRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("User", "ID", id));
		return this.mapper.map(user, UserDto.class);
	}

}
