package com.crimsonlogic.exception;

/**
 * Manejo de execptiones del modulo.
 * 
 * @author Willian Lopera
 */
public class CertificatePhytosanitaryException extends Exception {

	private static final long serialVersionUID = 6166566900550267920L;

	public CertificatePhytosanitaryException(String message) {
		super(message);
	}

	public CertificatePhytosanitaryException(String message, Throwable t) {
		super(message, t);
	}
	
}
