package com.blog.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.payloads.ApiSuccessResponse;
import com.blog.payloads.UserDto;
import com.blog.serviceimpl.UserServiceImpl;

@RestController
@RequestMapping("/api/user")
public class UserController {
	private UserServiceImpl userServiceImpl;

	public UserController(UserServiceImpl userServiceImpl) {
		super();
		this.userServiceImpl = userServiceImpl;
	}

	@PostMapping("/")
	private ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto userDto) {
		return new ResponseEntity<UserDto>(this.userServiceImpl.createUser(userDto), HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	private ResponseEntity<UserDto> userUpdate(@Valid @RequestBody UserDto userDto, @PathVariable Long id) {
		return new ResponseEntity<UserDto>(this.userServiceImpl.updateUser(userDto, id), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	private ResponseEntity<UserDto> getUserById(@PathVariable Long id) {
		return new ResponseEntity<UserDto>(this.userServiceImpl.getUserById(id), HttpStatus.OK);
	}

	@GetMapping("/")
	private ResponseEntity<List<UserDto>> getAllUser() {
		return new ResponseEntity<List<UserDto>>(this.userServiceImpl.getUserList(), HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	private ResponseEntity<ApiSuccessResponse> deleteUser(@PathVariable Long id) {
		this.userServiceImpl.deleteUser(id);
		return new ResponseEntity<ApiSuccessResponse>(new ApiSuccessResponse("User Sucessfully Deleted", true),
				HttpStatus.OK);
	}

}
