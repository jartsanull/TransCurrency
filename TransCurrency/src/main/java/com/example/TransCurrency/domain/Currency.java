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

	    private String currency;
	    private double value;
	   // private String valueTxt;

	    public Currency() {
	    }

	    public Currency(String currency, double value/*, String valueTxt*/) {
	    	this.currency = currency;
	    	this.value = value;
	        //this.valueTxt = valueTxt;
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

	    public double getValue() {
	        return value;
	    }

	    public void setValue(double value) {
	        this.value = value;
	    }


	    
	    /*   public String getValueTxt() {
        return valueTxt;
    }

    public void setValueTxt(String valueTxt) {
        this.valueTxt = valueTxt;
    }*/


		
		@Override
		public String toString() {
			return "Currency [id=" + id + ", currency=" + currency + ", value=" + value + "]"; //", valueTxt=" + valueTxt + "]";
		}

    

	    

	 

}


