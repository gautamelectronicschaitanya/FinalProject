package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repository.FmsRespository;

@Service
public class EmiProcessors {

	@Autowired
	FmsRespository fmsrepository;
	
	public double emiGenerator(String emioption)
	{
		if(emioption=="THREE")
		{
			
			
		}
		return 0.0;
	}
}
