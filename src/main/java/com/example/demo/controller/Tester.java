/**
 * 
 */
package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 *
 */
@RestController
public class Tester {
	
	@RequestMapping(value = "/test")
	public String test() {
		return "hello world!!11111111";
	}

}
