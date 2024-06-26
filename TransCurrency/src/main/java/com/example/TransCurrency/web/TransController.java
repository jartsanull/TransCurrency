package com.example.TransCurrency.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@ResponseBody
public class TransController {

	@RequestMapping("/main")                  //main page
	public String main(Model model) {
		return "main";
	  }
	
	@RequestMapping("/convert")                //converter
	public String convert(Model model) {
		return "redirect:/main";
	  }
	
	@RequestMapping("/value")                  //displays values of currencies in real time
	public String value(Model model) {
		return "value";
	  }
}
