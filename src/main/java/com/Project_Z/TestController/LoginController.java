package com.Project_Z.TestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LoginController {
	@GetMapping("/login")
	public  @ResponseBody String login(){
		return "welcome";
	}
	

}
