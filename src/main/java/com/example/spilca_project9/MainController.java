package com.example.spilca_project9;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

	@RequestMapping("/home/{color}")
	public String home(
			//@RequestParam(required=false) String color, // using request parameters
			//@RequestParam(required=false) String user,
			@PathVariable String color,
			Model page) {  // this is an ACTION
		page.addAttribute("username", "Peter");
		page.addAttribute("color", color);
		return "Home2.html";
	}
}
