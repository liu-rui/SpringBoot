package com.myhpc365.dns.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myhpc365.dns.service.DnsService;

@RestController
@RequestMapping("/dns")
@EnableAutoConfiguration
public class DnsController {
	@Autowired
	private DnsService dnsService;

	/*
	 * @RequestMapping(method = RequestMethod.POST) public Ret post(@RequestBody
	 * DnsPostParam param) { Ret ret = dnsService.add(param);
	 * 
	 * return ret; }
	 * 
	 * @RequestMapping(value = "/{id}", method = RequestMethod.PUT) public Ret
	 * put(@PathVariable String id, @RequestBody DnsPutParam param) { Ret ret =
	 * dnsService.update(id, param);
	 * 
	 * return ret; }
	 * 
	 * @RequestMapping(value = "/{id}", method = RequestMethod.DELETE) public
	 * Ret put(@PathVariable String id) { Ret ret = dnsService.delete(id);
	 * 
	 * return ret; }
	 */
}
