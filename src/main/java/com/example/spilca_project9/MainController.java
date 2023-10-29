package com.example.spilca_project9;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/home")
	public String home() {  // this is an ACTION
		return "Home.html";
	}
}
