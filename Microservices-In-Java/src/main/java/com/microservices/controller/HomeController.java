package com.microservices.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.model.Items;

@RestController
public class HomeController 
{
	@RequestMapping("/home")
	public String greet()
	{
		return "Hello World";
	}
	
	@RequestMapping("/getItems")
	public List<Items> getItems()
	{
		List list = new ArrayList<>();
		
			list.add(101);
			list.add("iphone");
			list.add(50000);
			
			return list;
	}
	
	
	

}
