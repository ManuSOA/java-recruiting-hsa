package com.accenture.pruebamanuel.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.Getter;

/**
 * Customizable Class for a Service Unavailable exception.
 * 
 * @author Manuel Jimenez.
 *
 */
@Getter
@ResponseStatus(code = HttpStatus.SERVICE_UNAVAILABLE)
public class ServiceUnavailableException extends RuntimeException {

	/**
	 * Serial.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Solution.
	 */
	private final String solution;

	/**
	 * Code.
	 */
	private final String code;

	/**
	 * date
	 */
	private final Date time = new Date();

	/**
	 * Constructor vacio.
	 */
	public ServiceUnavailableException() {

		super();
		code = "";
		solution = "";
	}

	/**
	 * Constructor for a custom exception.
	 * 
	 * @param message  Message of the error.
	 * @param solution Solution given to the user.
	 * @param code     Code that identifies the service of the error.
	 */
	public ServiceUnavailableException(String message, String solution, String code) {

		super(message);
		this.solution = solution;
		this.code = code;
	}
}
