package com.blog.payloads;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDto {

	private Long id;
	@Size(min = 4, max = 30, message = "name should be 4 to 30")
	private String name;
	@NotBlank(message = "email can not be blank")
	@Email(message = "email should be correct format")
	private String email;
	@Size(min = 4, max = 10, message = "password should be 4 to 10")
	private String password;
	@NotBlank(message = "about can not be blank")
	private String about;

}
