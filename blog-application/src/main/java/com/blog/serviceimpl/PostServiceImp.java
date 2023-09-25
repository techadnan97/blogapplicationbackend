package com.blog.serviceimpl;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.blog.entity.Category;
import com.blog.entity.Post;
import com.blog.entity.User;
import com.blog.payloads.PostDto;
import com.blog.payloads.PostDtoResponse;
import com.blog.payloads.PostResponse;
import com.blog.repository.PostRepository;
import com.blog.service.FileService;
import com.blog.service.PostService;
import com.blog.utils.CommonUtils;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PostServiceImp implements PostService {

	private final PostRepository postRepository;
	private final ModelMapper modelMapper;
	private final FileService fileService;
	private final CommonUtils commonUtils;

	@Value("${project.image}")
	private String path;

	@Override
	public PostDto createPost(PostDto postDto) {
		User user = commonUtils.getUser(postDto.getUserId());
		Category category = commonUtils.getCategory(postDto.getCategoryId());
		Post post = Post.builder().title(postDto.getTitle()).content(postDto.getContent()).category(category).user(user)
				.addedDate(new Date()).imageName("demo.png").build();
		return this.modelMapper.map(this.postRepository.save(post), PostDto.class);
	}

	@Override
	public PostDto updatePost(PostDto postDto, Long id) {
		Post post = commonUtils.getPost(id);
		User user = commonUtils.getUser(postDto.getUserId());
		Category category = commonUtils.getCategory(postDto.getCategoryId());
		post.setTitle(postDto.getTitle());
		post.setUser(user);
		post.setCategory(category);
		post.setContent(postDto.getContent());
		post.setImageName("demo.png");
		post.setAddedDate(new Date());

		return this.modelMapper.map(this.postRepository.save(post), PostDto.class);
	}

	@Override
	public PostDtoResponse getPost(Long id) {
		Post post = commonUtils.getPost(id);
		return this.modelMapper.map(post, PostDtoResponse.class);
	}

	@Override
	public PostResponse getPost(Integer pageNumber, Integer pageSize) {

		PageRequest pageRequest = PageRequest.of(pageNumber, pageSize);
		Page<Post> page = this.postRepository.findAll(pageRequest);
		List<PostDtoResponse> postToPostDtoResponses = commonUtils.postToPostDtoResponses(page.getContent());

		return PostResponse.builder().content(postToPostDtoResponses).pageNumber(page.getNumber())
				.pageSize(page.getSize()).totalElements(page.getNumberOfElements()).totatPages(page.getTotalPages())
				.lastPage(page.isLast()).build();
	}

	@Override
	public void deletePost(Long id) {
		Post post = commonUtils.getPost(id);
		this.postRepository.delete(post);
	}

	@Override
	public List<PostDtoResponse> getPostsByUser(Long id) {
		User user = commonUtils.getUser(id);
		List<Post> post = this.postRepository.findByUser(user);
		return commonUtils.postToPostDtoResponses(post);
	}

	@Override
	public List<PostDtoResponse> getPostByUserAndCategory(Long userId, Long catId) {
		Category category = commonUtils.getCategory(catId);
		User user = commonUtils.getUser(userId);
		return commonUtils.postToPostDtoResponses(this.postRepository.findByUserAndCategory(user, category));
	}

	@Override
	public List<PostDtoResponse> getPostByCategory(Long id) {
		Category category = commonUtils.getCategory(id);
		return commonUtils.postToPostDtoResponses(this.postRepository.findByCategory(category));

	}

	@Override
	public List<PostDtoResponse> getPostBySearchTitle(String title) {
		List<Post> post = this.postRepository.findByTitleContaining(title);
		return commonUtils.postToPostDtoResponses(post);
	}

	@Override
	public PostDtoResponse uploadImage(MultipartFile multipartFile, Long id) throws IOException {
		Post post = commonUtils.getPost(id);
		String fileName = this.fileService.fileUpload(multipartFile, path);
		post.setImageName(fileName);
		return this.modelMapper.map(this.postRepository.save(post), PostDtoResponse.class);
	}

	@Override
	public Resource loadImage(Long id) throws IOException {
		Post post = commonUtils.getPost(id);
		return this.fileService.loadImage(path, post.getImageName());
	}

}
