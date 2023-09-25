package com.blog.payloads;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PostDto {
	@NotBlank(message = "Title can not be empty")
	private String title;
	@NotBlank(message = "Content can not be empty")
	private String content;

	private Long categoryId;

	private Long userId;

}
