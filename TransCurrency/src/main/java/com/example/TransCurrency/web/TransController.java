package com.example.TransCurrency.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@ResponseBody
public class TransController {

	@RequestMapping("/main")                  //main page
	public String main(Model model) {
		return "main";
	  }
	
	@RequestMapping("/convert")                //converter
	public String convert(Model model, @RequestParam double amount,
            						   @RequestParam String fromCurrency,
            						   @RequestParam String toCurrency) {
		return "redirect:/main";
	  }
	
	@RequestMapping("/value")                  //displays values of currencies in real time
	public String value(Model model) {
		return "value";
	  }
	
	@RequestMapping("/old-currencies")          //displays values of old currencies based on final value during last usage
	public String oldCurrencies(Model model) {
		return "oldvs";
	  }
}
