package com.blog.service;

import com.blog.payloads.CommentDto;

public interface CommentService {
	CommentDto createComment(CommentDto commentDto, Long userId, Long postId);

	void delateComment(Long id);

}
