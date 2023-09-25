package com.blog.exceptions;

public class BadCredential extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2428473004221951646L;

	public BadCredential(String msg) {
		super(msg);
	}
}
