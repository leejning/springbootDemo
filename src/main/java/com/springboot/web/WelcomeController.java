package com.springboot.web;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@Autowired
	private DataSource dataSource;
	
	@GetMapping("/hello")
    public String hello(){
        return "hello, spring boot!";
    }
}
