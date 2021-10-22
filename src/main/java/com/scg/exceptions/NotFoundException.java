package com.scg.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotFoundException extends RuntimeException {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private final BaseCode errorCode;
	private final String errorCodeString;
	private final Exception exception;

	public NotFoundException(final BaseCode errorCode) {
		super(errorCode.getMessage());
		this.exception = new RuntimeException(errorCode.getMessage());
		this.errorCode = errorCode;
		this.errorCodeString = errorCode.toString();
	}

	public NotFoundException(final BaseCode errorCode, final Exception exception) {
		super(String.join("_", errorCode.getMessage(), exception.getMessage()), exception);
		this.exception = exception;
		this.errorCode = errorCode;
		this.errorCodeString = errorCode.toString();

	}

	public NotFoundException(final BaseCode errorCodeString, final String message) {
		super(message);

		this.errorCode = errorCodeString;
		this.exception = new RuntimeException(errorCodeString.getMessage());
		this.errorCodeString = errorCodeString.toString();

	}
}
