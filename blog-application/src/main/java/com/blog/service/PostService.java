package com.blog.service;

import java.io.IOException;
import java.util.List;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import com.blog.payloads.PostDto;
import com.blog.payloads.PostDtoResponse;
import com.blog.payloads.PostResponse;

public interface PostService {
	PostDto createPost(PostDto psoDto);

	PostDto updatePost(PostDto psoDto, Long id);

	PostDtoResponse getPost(Long id);

	PostResponse getPost(Integer pageNumber, Integer pageSize);

	void deletePost(Long id);

	List<PostDtoResponse> getPostsByUser(Long id);

	List<PostDtoResponse> getPostByUserAndCategory(Long userId, Long catId);

	List<PostDtoResponse> getPostByCategory(Long id);

	List<PostDtoResponse> getPostBySearchTitle(String title);

	PostDtoResponse uploadImage(MultipartFile multipartFile, Long id) throws IOException;

	Resource loadImage(Long id) throws IOException;

}
