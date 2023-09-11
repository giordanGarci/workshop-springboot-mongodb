package com.course.workshopmongo.services.exeptions;

public class ObjectNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ObjectNotFoundException(String msg) {
		super("Id not found: " + msg);
	}
}
