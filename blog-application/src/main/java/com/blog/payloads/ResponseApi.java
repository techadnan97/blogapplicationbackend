package com.blog.payloads;

import java.sql.Timestamp;

import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@AllArgsConstructor
@Setter
@Getter
@ResponseStatus
public class ResponseApi {
	
	private String message;
	private Integer httpCode;
	private Timestamp timestamp;

}
