package com.blog.service;

import java.util.List;

import com.blog.payloads.UserDto;

public interface UserService {

	UserDto createUser(UserDto userDto);

	UserDto updateUser(UserDto userDto, Long id);

	void deleteUser(Long id);

	List<UserDto> getUserList();

	UserDto getUserById(Long id);

}
