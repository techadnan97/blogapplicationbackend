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
import com.blog.service.UserService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/user")
public class UserController {
	private final UserService userService;

	@PostMapping("/")
	private ResponseEntity<?> createUser(@Valid @RequestBody UserDto userDto) {
		return new ResponseEntity<UserDto>(this.userService.createUser(userDto), HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	private ResponseEntity<?> userUpdate(@Valid @RequestBody UserDto userDto, @PathVariable Long id) {
		return new ResponseEntity<UserDto>(this.userService.updateUser(userDto, id), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	private ResponseEntity<?> getUserById(@PathVariable Long id) {
		return new ResponseEntity<UserDto>(this.userService.getUserById(id), HttpStatus.OK);
	}

	@GetMapping("/")
	private ResponseEntity<?> getAllUser() {
		return new ResponseEntity<List<UserDto>>(this.userService.getUserList(), HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	private ResponseEntity<?> deleteUser(@PathVariable Long id) {
		this.userService.deleteUser(id);
		return new ResponseEntity<ApiSuccessResponse>(new ApiSuccessResponse("User Sucessfully Deleted", true),
				HttpStatus.OK);
	}

}
