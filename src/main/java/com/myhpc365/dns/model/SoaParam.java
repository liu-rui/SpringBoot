package com.myhpc365.dns.model;


/**
 * 区域注册SOA方法输入参数 
 * 
 * @author LiuRui
 *
 */
public class SoaParam {
	private String zone;
	private int ttl;
	private String dns;
	private String contact;

	public SoaParam() {
		super();
	}

	public SoaParam(String zone, int ttl, String dns, String contact) {
		super();
		this.zone = zone;
		this.ttl = ttl;
		this.dns = dns;
		this.contact = contact;
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

	public String getDns() {
		return dns;
	}

	public void setDns(String dns) {
		this.dns = dns;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "SoaParam [zone=" + zone + ", ttl=" + ttl + ", dns=" + dns + ", contact=" + contact + "]";
	}

}
