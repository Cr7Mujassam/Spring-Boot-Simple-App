package com.in28minutes.springboot.web.springbootfirstwebapplication.loginController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// </login =>> "Welcome to login Page"

@Controller
public class loginController {
	
	@RequestMapping("/login")
	@ResponseBody
	public String login(){
		return "Welcome to login Page" + " " + "Browser!!!";
	}
	
	@RequestMapping("/login/even")
	@ResponseBody
	public int even() {
		return 0;
	}

}
