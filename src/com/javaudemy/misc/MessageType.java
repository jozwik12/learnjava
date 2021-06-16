package com.javaudemy.misc;

public enum MessageType {
	A(Priority.HIGH), B(Priority.MEDIUM), C(Priority.LOW), D(Priority.LOW);
	
	private Priority priorytet;
	
	private MessageType(Priority priorytet) {
		this.priorytet = priorytet;
	}
	
	public Priority getPriority() {
		return this.priorytet;
	}
}
