package com.scg.exceptions;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ErrorResponse {
	private HttpStatus status = HttpStatus.OK;
	private int errorCode;
	private String message;
	private String exception;

}
