package com.myhpc365.dns.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myhpc365.dns.repository.RecordRespository;
import com.myhpc365.dns.service.DnsService;

@Service
public class DnsServiceImpl implements DnsService { 

	@Autowired
	private RecordRespository recordRespository; 
}
