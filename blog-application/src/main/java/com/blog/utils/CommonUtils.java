package com.blog.utils;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.blog.entity.Category;
import com.blog.entity.Post;
import com.blog.entity.User;
import com.blog.exceptions.ResourceNotFoundException;
import com.blog.payloads.PostDtoResponse;
import com.blog.repository.CategoryRepository;
import com.blog.repository.PostRepository;
import com.blog.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class CommonUtils {

	private final UserRepository userRepository;
	private final CategoryRepository categoryRepository;
	private final PostRepository postRepository;
	private final ModelMapper modelMapper = new ModelMapper();

	public List<PostDtoResponse> postToPostDtoResponses(List<Post> postList) {
		return postList.stream().map(p -> this.modelMapper.map(p, PostDtoResponse.class)).collect(Collectors.toList());
	}

	public User getUser(Long id) {
		return this.userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User", "Id", id));

	}

	public Post getPost(Long id) {
		return this.postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("post", "Id", id));
	}

	public Category getCategory(Long id) {
		return this.categoryRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Category", "Id", id));
	}
}
