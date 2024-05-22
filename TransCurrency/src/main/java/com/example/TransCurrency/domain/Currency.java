package com.example.TransCurrency.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Currency {


	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;

	    private double currency;
	   // private String currencyTxt;

	    public Currency() {
	    }

	    public Currency(double currency/*, String currencyTxt*/) {
	        this.currency = currency;
	        //this.currencyTxt = currencyTxt;
	    }

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public double getCurrency() {
	        return currency;
	    }

	    public void setCurrency(double currency) {
	        this.currency = currency;
	    }
	    
	    /*   public String getCurrencyTxt() {
        return currencyTxt;
    }

    public void setCurrencyTxt(String currencyTxt) {
        this.currencyTxt = currencyTxt;
    }*/


		@Override
		public String toString() {
			return "Currency [id=" + id + ", currency=" + currency + "]"; //", currencyTxt=" + currencyTxt + "]";
		}


    

	    

	 

}



