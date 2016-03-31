package com.myhpc365.dns.model;

public class DnsPostParam extends DnsPutParam {
	private String id;

	public DnsPostParam() {
		super();
	}

	public DnsPostParam(String id, String zone, int ttl, String type, String host, String data) {
		super(zone, ttl, type, host, data);
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "DnsPostParam [id=" + id + ", toString()=" + super.toString() + "]";
	}
}
