package com.g2rw.server.main;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class Group2 {
	//@RequestMapping (method=RequestMethod.GET,path="hello-world")
	//the above method can be modified using GetMapping
	@GetMapping (path="hello-world")
	public String message () {
		String response = "Welcome to Group2 RESTFul webservices using Spring boot!\n"
				+ "This is Spring boot service\n" 
				+ "Multiline message is possible";
		return response;
	}
	
	

}
