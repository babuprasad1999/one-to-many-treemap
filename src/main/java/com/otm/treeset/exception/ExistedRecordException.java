package com.otm.treeset.exception;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.EXPECTATION_FAILED)
public class ExistedRecordException extends RuntimeException {

	public ExistedRecordException(String message) {
		super(message);
	}
}
