package com.abc.healthcare.exceptions;

public class ResourceAlreadyExistException extends RuntimeException{
	public ResourceAlreadyExistException(String msg) {
		super(msg);
	}
}
