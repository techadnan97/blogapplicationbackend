package com.blog.payloads;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class CategoryDto {
	private String id;
	@NotBlank
	@Size(min = 5 ,message = "min 5 char in Title")
	private String title;
	@NotBlank
	@Size(min = 10 ,message = "min 10 char in description")
	private String description;
}
