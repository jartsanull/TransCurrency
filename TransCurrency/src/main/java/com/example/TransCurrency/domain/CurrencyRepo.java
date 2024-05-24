package com.example.TransCurrency.domain;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.TransCurrency.domain.*;

public interface CurrencyRepo extends CrudRepository<Currency, Long> {
    List<Currency> findByCurrency(String currency);
}
