package com.blog.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@ResponseStatus
public class ResourceNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String resourceName;
	private String reourceField;
	private Long resourceValue;

	public ResourceNotFoundException(String resourceName, String reourceField, Long resourceValue) {
		super(String.format("%s not found with %s :%s",resourceName,reourceField ,resourceValue));
		
		this.resourceName = resourceName;
		this.reourceField = reourceField;
		this.resourceValue = resourceValue;
	}

}
