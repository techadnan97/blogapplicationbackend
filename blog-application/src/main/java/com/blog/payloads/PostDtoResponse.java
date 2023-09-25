package com.blog.payloads;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class PostDtoResponse {
	private Long id;
	private String title;
	private String content;
	private String imageName;
	private CategoryDto category;
	private UserDto user;
	private List<CommentDto> comment;

}
