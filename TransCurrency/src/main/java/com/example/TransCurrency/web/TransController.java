package com.example.TransCurrency.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TransController {
	
	@RequestMapping("/main")
	public String main(Model model) {
		return "main";
	  }

}
