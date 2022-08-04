package com.blog.service;

import java.util.List;

import com.blog.payloads.CategoryDto;

public interface CategoryService {
	CategoryDto createCategories(CategoryDto categoryDto);

	CategoryDto updateCategories(CategoryDto categoryDto, Long id);

	CategoryDto getCategory(Long id);

	List<CategoryDto> getCategories();

	void deleteCategories(Long id);

}
