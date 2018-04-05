package com.hw.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller()
@RequestMapping("/user")
public class UserControl {
	@RequestMapping(method = { RequestMethod.POST })
	public String getUser() {
		System.out.println("Dick Hello");
		return "index";
	}

}
