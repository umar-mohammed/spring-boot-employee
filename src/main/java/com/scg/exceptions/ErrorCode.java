package com.scg.exceptions;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ErrorCode implements BaseCode {
	EMPLOYEE_NOT_FOUND("Employee not Found with this ID"),;

	private String message;

	@Override
	public String getCode() {

		return name();
	}

	@Override
	public int getHttpStatusCode() {
		return 400;
	}

	@Override
	public String getMessage() {
		return this.message;
	}
}
