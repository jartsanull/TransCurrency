package com.example.TransCurrency.web;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;
import java.util.Map;

import com.example.TransCurrency.domain.Currency;
import com.example.TransCurrency.domain.CurrencyRepo;
import com.example.TransCurrency.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TransContRest {
	
	@Autowired
	private CurrencyRepo currencyRepo;
	
	@Autowired
	private CurrencyService currencyService;
	
	
	@GetMapping("/currencies")
	public List<Currency> getCurrencies(){
		return (List<Currency>) currencyRepo.findAll();
	}
	
	@PostMapping("/convert")
	public double convert(@RequestBody ConversionRequest request) {
		 Currency fromi = currencyRepo.findByCurrency(request.getFrom());
		 Currency to = currencyRepo.findByCurrency(request.getTo());
		 
		 
	
	}
	}
	
	
}
