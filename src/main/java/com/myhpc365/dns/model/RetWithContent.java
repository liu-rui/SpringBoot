package com.myhpc365.dns.model;

public class RetWithContent<T> extends Ret {
	private T content;

	public RetWithContent() {
		super();
	}

	public RetWithContent(Integer state, String messsage, T content) {
		super(state, messsage);
		this.content = content;
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Retd [content=" + content + ", getState()=" + getState() + ", getMesssage()=" + getMesssage() + "]";
	}
}
