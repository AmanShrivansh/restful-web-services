package com.in28minutes.rest.webservices.restful_web_services.hello;

public class HelloWorldBean {
    
	
	private String string;
	
	public HelloWorldBean(String string) {
		this.string = string;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [string=" + string + "]";
	}
	
}
