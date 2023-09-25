package com.blog.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.blog.exceptions.BadCredential;
import com.blog.payloads.JwtResponse;
import com.blog.payloads.LoginDto;
import com.blog.utils.JwtTokenUtil;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/api/")
public class LoginController {

	private final UserDetailsService userDetailsService;
	private final JwtTokenUtil jwtTokenUtil;
	private final AuthenticationManager authenticationManager;

	@PostMapping("login")
	@ResponseStatus(value = HttpStatus.OK)
	private JwtResponse loginUser(@RequestBody LoginDto loginDto) {
		authnicate(loginDto.getUsername(), loginDto.getPassword());
		UserDetails userDetails = userDetailsService.loadUserByUsername(loginDto.getUsername());
		String generateToken = jwtTokenUtil.generateToken(userDetails);
		return new JwtResponse(generateToken);
	}

	private void authnicate(String username, String password) {

		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));

		} catch (Exception e) {
			throw new BadCredential("Bad Crienditial!!");
		}
	}

}
