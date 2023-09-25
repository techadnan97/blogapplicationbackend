package com.blog.payloads;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class PostResponse {
	private List<?> content;
	private Integer pageNumber;
	private Integer pageSize;
	private Integer totalElements;
	private Integer totatPages;
	private Boolean lastPage;
	
	
	

}
