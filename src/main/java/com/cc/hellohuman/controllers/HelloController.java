package com.cc.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/")
	public String index(@RequestParam(value="first_name") String first_name, @RequestParam(value="last_name") String last_name){
    	return "Hello " + first_name + " " + last_name + "!";
	}
}
