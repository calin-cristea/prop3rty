package com.cristeanet.prop3rty.forms;

/**
 * Model that holds the contact formular data.
 * @author George Toba (george.toba@gmail.com)
 *
 */
public class ContactForm {
	private String name;
	private String email;
	private String message;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
