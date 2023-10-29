package com.example.spilca_project9;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/home")
	public String home(Model page) {  // this is an ACTION
		page.addAttribute("username", "Katy");
		page.addAttribute("color", "red");
		return "Home2.html";
	}
}
