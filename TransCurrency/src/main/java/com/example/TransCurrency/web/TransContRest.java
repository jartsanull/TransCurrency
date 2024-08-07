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
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

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
		 Currency toCur = currencyRepo.findByCurrency(request.getTo());
		 
		 if(fromi != null && toCur != null) {
			 double conversionRate = toCur.getcurrencyValue() / fromi.getcurrencyValue();
			 return request.getAmount() * conversionRate;
		 }
		 else {
			 throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid currency");
		 }
	
	}
	
	@PostMapping("/updateRates")
	public void updateRates() {
		Map<String, Double> latestRates = currencyService.getLatestRates();
		latestRates.forEach((currency, rate) -> {
			Currency existingCurrency = currencyRepo.findByCurrency(currency);
			if (existingCurrency != null) {
				existingCurrency.setcurrencyValue(rate);
				currencyRepo.save(existingCurrency);
			}
			else {
				currencyRepo.save(new Currency(currency,rate));
			}
		});
	}
	
	}

class ConversionRequest{
	private String from;
	private String to;
	private double amount;
	
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

	
	
}
	
	

