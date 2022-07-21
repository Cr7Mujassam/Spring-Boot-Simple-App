package com.in28minutes.springboot.web.springbootfirstwebapplication.loginController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// </login =>> "Welcome to login Page"
// It will pick the class by springboot
@Controller
public class loginController {
	
	//It will map the code to url
	@RequestMapping("/login")
	//It will print the data of the method
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
