package com.blog.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.payloads.ApiSuccessResponse;
import com.blog.payloads.CategoryDto;
import com.blog.service.CategoryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/category")
@RequiredArgsConstructor
public class CategoryController {

	private final CategoryService categoryService;

	

	@PostMapping("/")
	private ResponseEntity<?> createCategory(@Valid @RequestBody CategoryDto categoryDto) {
		return new ResponseEntity<CategoryDto>(this.categoryService.createCategories(categoryDto), HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	private ResponseEntity<?> categoryUpdate(@Valid @RequestBody CategoryDto categoryDto,
			@PathVariable Long id) {
		return new ResponseEntity<CategoryDto>(this.categoryService.updateCategories(categoryDto, id), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	private ResponseEntity<?> getCategory(@PathVariable Long id) {
		return new ResponseEntity<CategoryDto>(this.categoryService.getCategory(id), HttpStatus.OK);
	}

	@GetMapping("/")
	private ResponseEntity<?> getCategories() {
		return new ResponseEntity<List<CategoryDto>>(this.categoryService.getCategories(), HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	private ResponseEntity<?> deleteCategory(@PathVariable Long id) {
		this.categoryService.deleteCategories(id);
		return new ResponseEntity<ApiSuccessResponse>(new ApiSuccessResponse("User Sucessfully Deleted", true),
				HttpStatus.OK);
	}

}
