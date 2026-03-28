package com.currencydetection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.currencydetection.model.CurrencyNote;

public interface CurrencyRepository extends JpaRepository<CurrencyNote, Long> {

}