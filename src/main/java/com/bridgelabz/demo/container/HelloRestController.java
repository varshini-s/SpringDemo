package com.bridgelabz.demo.container;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController 
{
	@RequestMapping(value = {"","/","/home"})
	public String sayHello()
	{
		return "Hello from bridgelabz";
	}

}
