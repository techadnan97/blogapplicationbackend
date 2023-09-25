package com.blog.serviceimpl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.blog.entity.Comment;
import com.blog.entity.Post;
import com.blog.entity.User;
import com.blog.exceptions.ResourceNotFoundException;
import com.blog.payloads.CommentDto;
import com.blog.repository.CommentRepository;
import com.blog.service.CommentService;
import com.blog.utils.CommonUtils;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {
	private final CommentRepository commentRepository;
	private final ModelMapper modelMapper;
	private final CommonUtils commonUtils;

	@Override
	public CommentDto createComment(CommentDto commentDto, Long userId, Long postId) {
		User user = commonUtils.getUser(userId);
		Post post = commonUtils.getPost(postId);
		Comment comment = this.modelMapper.map(commentDto, Comment.class);
		comment.setPost(post);
		comment.setUser(user);
		return this.modelMapper.map(this.commentRepository.save(comment), CommentDto.class);
	}

	@Override
	public void delateComment(Long id) {
		Comment comment = this.commentRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("comment", "id", id));
		this.commentRepository.delete(comment);
	}

}
