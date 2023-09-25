package com.blog.controllers;

import java.io.IOException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.blog.config.AppConstant;
import com.blog.payloads.ApiSuccessResponse;
import com.blog.payloads.PostDto;
import com.blog.payloads.PostDtoResponse;
import com.blog.service.PostService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/post")
@RequiredArgsConstructor
public class PostController {

	private final PostService postService;

	@PostMapping("/")
	private ResponseEntity<?> createPost(@Valid @RequestBody PostDto postDto) {
		return new ResponseEntity<PostDto>(this.postService.createPost(postDto), HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	private ResponseEntity<?> postUpdate(@Valid @RequestBody PostDto postDto, @PathVariable Long id) {
		return new ResponseEntity<PostDto>(this.postService.updatePost(postDto, id), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	private ResponseEntity<?> getPost(@PathVariable Long id) {
		return new ResponseEntity<PostDtoResponse>(this.postService.getPost(id), HttpStatus.OK);
	}

	@GetMapping()
	private ResponseEntity<?> getPosts(
			@RequestParam(defaultValue = AppConstant.PAGE_NUMBER, required = false) Integer pageNumber,
			@RequestParam(defaultValue = AppConstant.PAGE_SIZE, required = false) Integer pageSize) {
		return new ResponseEntity<>(this.postService.getPost(pageNumber, pageSize), HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	private ResponseEntity<?> deletePost(@PathVariable Long id) {
		this.postService.deletePost(id);
		return new ResponseEntity<ApiSuccessResponse>(new ApiSuccessResponse("Post Sucessfully Deleted", true),
				HttpStatus.OK);
	}

	@GetMapping("user/{id}")
	private ResponseEntity<?> getPostByUser(@PathVariable Long id) {
		return new ResponseEntity<List<PostDtoResponse>>(this.postService.getPostsByUser(id), HttpStatus.OK);
	}

	@GetMapping("user/{userId}/category/{cateId}")
	private ResponseEntity<?> getPostByUserByCategory(@PathVariable Long userId, @PathVariable Long cateId) {
		return new ResponseEntity<List<PostDtoResponse>>(this.postService.getPostByUserAndCategory(userId, cateId),
				HttpStatus.OK);
	}

	@GetMapping("category/{id}")
	private ResponseEntity<?> getPostByCategory(@PathVariable Long id) {
		return new ResponseEntity<List<PostDtoResponse>>(this.postService.getPostByCategory(id), HttpStatus.OK);
	}

	@GetMapping("/posts/search/{title}")
	private ResponseEntity<?> getPostBySearchTitle(@PathVariable String title) {
		return new ResponseEntity<List<PostDtoResponse>>(this.postService.getPostBySearchTitle(title), HttpStatus.OK);
	}

	@PostMapping("/upload/image/{id}")
	private ResponseEntity<?> uploadImage(@RequestParam MultipartFile image, @PathVariable Long id) throws IOException {
		return new ResponseEntity<>(this.postService.uploadImage(image, id), HttpStatus.OK);
	}

	@GetMapping("/image/{id}")
	public ResponseEntity<Resource> getFile(@PathVariable Long id) throws IOException {
		Resource file = this.postService.loadImage(id);
		return ResponseEntity.ok()
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getFilename() + "\"")
				.body(file);
	}

}
