package com.g2rw.server.main;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Configuration 

//controller
@RestController  

public class HelloWorldController {
	//using get method and hello-world URI  
	@GetMapping(path="/hello-world-bini") 
	public String helloWorld()  
	{  
	return "Hello World";  
	}  
	
	@GetMapping(path="/hello-world-bean")  
	//method- which returns "Hello World"  
	public HelloWorldBean helloWorldBean()  
	{  
	return new HelloWorldBean("Hello World"); //constructor of HelloWorldBean  
	}  
	//passing a path variable 
	@GetMapping(path="/hello-world-bini/path-variable/{name}")  
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name)  
	{  
	return new HelloWorldBean(String.format("Hello, %s", name)); //%s replace the name  
	}  
}
