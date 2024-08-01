package com.example.TransCurrency.service;

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
	
	@Autowired
    private final RestTemplate restTemplate;

}
