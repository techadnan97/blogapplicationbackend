package com.blog.serviceimpl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import com.blog.entity.Category;
import com.blog.exceptions.ResourceNotFoundException;
import com.blog.payloads.CategoryDto;
import com.blog.repository.CategoryRepository;
import com.blog.service.CategoryService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

	private final CategoryRepository categoryRepository;
	private final ModelMapper modelMapper;

	@Override
	public CategoryDto createCategories(CategoryDto categoryDto) {
		Category category = this.modelMapper.map(categoryDto, Category.class);
		return this.modelMapper.map(this.categoryRepository.save(category), CategoryDto.class);
	}

	@Override
	public CategoryDto updateCategories(CategoryDto categoryDto, Long id) {
		Category category = this.categoryRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Category", "Id", id));
		category.setTitle(categoryDto.getTitle());
		category.setDescription(categoryDto.getDescription());

		return this.modelMapper.map(this.categoryRepository.save(category), CategoryDto.class);
	}

	@Override
	public CategoryDto getCategory(Long id) {
		Category category = this.categoryRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Category", "Id", id));
		return this.modelMapper.map(category, CategoryDto.class);
	}

	@Override
	public List<CategoryDto> getCategories() {
		return this.modelMapper.map(this.categoryRepository.findAll(), new TypeToken<List<CategoryDto>>() {
		}.getType());
	}

	@Override
	public void deleteCategories(Long id) {
		Category category = this.categoryRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Category", "Id", id));

		this.categoryRepository.delete(category);

	}

}
