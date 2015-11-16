package com.tutorialspoint;

public class HelloWorld {
	private String message;

	public void getMessage() {
		System.out.println("Your message : " + message);
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
}
