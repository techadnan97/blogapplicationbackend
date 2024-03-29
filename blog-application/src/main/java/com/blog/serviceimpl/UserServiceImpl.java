package com.blog.serviceimpl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.blog.config.AppConstant;
import com.blog.entity.Role;
import com.blog.entity.User;
import com.blog.exceptions.ResourceNotFoundException;
import com.blog.payloads.UserDto;
import com.blog.repository.RoleRepository;
import com.blog.repository.UserRepository;
import com.blog.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;
	private final RoleRepository roleRepository;
	private final PasswordEncoder passwordEncoder;
	private final ModelMapper mapper;

	@Override
	public UserDto createUser(UserDto userDto) {
		Set<Role> roles = new HashSet<>();
		User user = this.mapper.map(userDto, User.class);
		Long id = "ADMIN".equalsIgnoreCase(userDto.getRole()) ? AppConstant.ADMIN_USER : AppConstant.NORMAL_USER;
		Role role = roleRepository.findById(id).get();
		roles.add(role);
		user.setPassword(passwordEncoder.encode(userDto.getPassword()));
		user.setRole(roles);
		return this.mapper.map(this.userRepository.save(user), UserDto.class);
	}

	@Override
	public UserDto updateUser(UserDto userDto, Long id) {
		User user = this.userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User", "ID", id));
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		user.setAbout(userDto.getAbout());

		return this.mapper.map(this.userRepository.save(user), UserDto.class);
	}

	@Override
	public void deleteUser(Long id) {
		User user = this.userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User", "ID", id));
		this.userRepository.delete(user);

	}

	@Override
	public List<UserDto> getUserList() {
		return this.mapper.map(this.userRepository.findAll(), new TypeToken<List<UserDto>>() {
		}.getType());
	}

	@Override
	public UserDto getUserById(Long id) {
		User user = this.userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User", "ID", id));
		return this.mapper.map(user, UserDto.class);
	}

}
