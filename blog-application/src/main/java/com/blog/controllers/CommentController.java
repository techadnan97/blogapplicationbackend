package com.blog.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.blog.payloads.ApiSuccessResponse;
import com.blog.payloads.CommentDto;
import com.blog.service.CommentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/comment/")
public class CommentController {
	private final CommentService commentService;

	@PostMapping("user/{userId}/post/{postId}/create-comment")
	@ResponseStatus(value = HttpStatus.CREATED)
	private CommentDto createComment(@RequestBody CommentDto commentDto, @PathVariable Long userId,
			@PathVariable Long postId) {
		return this.commentService.createComment(commentDto, userId, postId);
	}

	@DeleteMapping("{id}")
	@ResponseStatus(value = HttpStatus.OK)
	private ApiSuccessResponse deleteComment(@PathVariable Long id) {
		this.commentService.delateComment(id);
		return ApiSuccessResponse.builder().message("comment is deleted").success(true).build();
	}
}
