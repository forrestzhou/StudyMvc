package com.springmvc.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.pojo.User;
import com.springmvc.service.UserService;

@Controller
@RequestMapping(value="/userinfo")
public class UserController {
	
	@Resource
	private UserService studentService;
	
	@RequestMapping(value="/add1.do")
	public String add(HttpServletRequest request){
		String userNumber = request.getParameter("userNumber");
		String passWord = request.getParameter("passWord");
		System.out.println("userNumber:"+userNumber+" passWord:"+passWord);
		return "user_add1";
	}
	
	
	@RequestMapping(value="/insert.do")
	public String insert(HttpServletRequest request){
		String userNumber = request.getParameter("userNumber");
		String passWord = request.getParameter("passWord");
		System.out.println("insert: userNumber "+userNumber+"  passWord "+passWord);

		User user=new User();
		user.setName(userNumber);
		user.setPassword(passWord);
		studentService.save(user);
		return "success";
	}
	
	@RequestMapping(value="/test.do")
	public String test(){
		
		System.out.println("----test-----");
		
		return "userinfo/operate_test";
	}

}
