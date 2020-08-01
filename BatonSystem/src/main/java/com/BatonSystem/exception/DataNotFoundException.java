package com.BatonSystem.exception;

public class DataNotFoundException extends RuntimeException {

	private static final long serialVersionUID= 344565575L;
	public DataNotFoundException(String message) {
		super(message);
	}
}
