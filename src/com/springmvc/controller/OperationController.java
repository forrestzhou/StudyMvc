package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value="/operate") 
public class OperationController {

	
	@RequestMapping(value="/test.do")
	public String test(){
		
		System.out.println("----test-----");
		
		return "view/userinfo/operate_test";
	}
	
	
	
}
