package com.myhpc365.dns.model;

public class DnsPutParam {
	private String zone;
	private int ttl;
	private String type;
	private String host;
	private String data;

	public DnsPutParam() {
		super();
	}

	public DnsPutParam(String zone, int ttl, String type, String host, String data) {
		super();
		this.zone = zone;
		this.ttl = ttl;
		this.type = type;
		this.host = host;
		this.data = data;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public int getTtl() {
		return ttl;
	}

	public void setTtl(int ttl) {
		this.ttl = ttl;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "DnsPutParam [zone=" + zone + ", ttl=" + ttl + ", type=" + type + ", host=" + host + ", data=" + data
				+ "]";
	}

}
