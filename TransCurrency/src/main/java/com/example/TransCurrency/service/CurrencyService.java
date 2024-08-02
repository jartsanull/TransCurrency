package com.example.TransCurrency.service;

import com.example.TransCurrency.config.AppConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class CurrencyService {
	
	@Value("${exchange.api.url}")
	private String apiUrl;

	@Value("${exchange.api.key}")
	private String apiKey;
	
    private final RestTemplate restTemplate;
    

    @Autowired
    public CurrencyService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    
    
    


}
