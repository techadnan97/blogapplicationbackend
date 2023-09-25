package com.blog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.entity.Category;
import com.blog.entity.Post;
import com.blog.entity.User;

public interface PostRepository extends JpaRepository<Post, Long> {
	List<Post> findByUser(User user);

	List<Post> findByCategory(Category category);

	List<Post> findByUserAndCategory(User user, Category category);
	
	List<Post> findByTitleContaining(String title);
	
	

}
