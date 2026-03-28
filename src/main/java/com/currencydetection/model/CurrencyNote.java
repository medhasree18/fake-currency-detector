package com.currencydetection.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class CurrencyNote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String imageName;
    private String result;
    private LocalDate date;

    public CurrencyNote() {}

    public Long getId() { return id; }
    public String getImageName() { return imageName; }
    public String getResult() { return result; }
    public LocalDate getDate() { return date; }

    public void setId(Long id) { this.id = id; }
    public void setImageName(String imageName) { this.imageName = imageName; }
    public void setResult(String result) { this.result = result; }
    public void setDate(LocalDate date) { this.date = date; }
}