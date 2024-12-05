package com.example.Demo.FrontEndWork.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class FrontEndWorkController {

	@GetMapping("/")
	public String getWorkForm() {
		return "FrontPage.html";
	}
	
}
