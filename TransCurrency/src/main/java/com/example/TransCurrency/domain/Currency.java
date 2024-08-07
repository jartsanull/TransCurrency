package com.example.TransCurrency.domain;

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


@Entity
public class Currency {

	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;

	    private String currency;
	    private double currencyValue;
	   // private String currencyValueTxt;

	    public Currency() {
	    }

	    public Currency(String currency, double currencyValue/*, String currencyValueTxt*/) {
	    	this.currency = currency;
	    	this.currencyValue = currencyValue;
	        //this.currencyValueTxt = currencyValueTxt;
	    }

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }
	    
	    public String getCurrency() {
	        return currency;
	    }

	    public void setCurrency(String currency) {
	        this.currency = currency;
	    }

	    public double getcurrencyValue() {
	        return currencyValue;
	    }

	    public void setcurrencyValue(double currencyValue) {
	        this.currencyValue = currencyValue;
	    }


	    
	    /*   public String getcurrencyValueTxt() {
        return currencyValueTxt;
    }

    public void setcurrencyValueTxt(String currencyValueTxt) {
        this.currencyValueTxt = currencyValueTxt;
    }*/


		
		@Override
		public String toString() {
			return "Currency [id=" + id + ", currency=" + currency + ", currencyValue=" + currencyValue + "]"; //", currencyValueTxt=" + currencyValueTxt + "]";
		}

    

	    

	 

}


