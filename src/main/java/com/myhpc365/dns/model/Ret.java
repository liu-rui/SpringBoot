package com.myhpc365.dns.model;

public class Ret {
	private Integer state;
	private String messsage;

	public Ret() {
		super();
	}
	
	public Ret(Integer state){
		super();
		this.state = state;
	}

	public Ret(Integer state, String messsage) {
		super();
		this.state = state;
		this.messsage = messsage;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getMesssage() {
		return messsage;
	}

	public void setMesssage(String messsage) {
		this.messsage = messsage;
	}

	@Override
	public String toString() {
		return "Ret [state=" + state + ", messsage=" + messsage + "]";
	}
}
