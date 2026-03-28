package com.currencydetection.model;

import jakarta.persistence.*;

@Entity
public class DetectionHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String noteName;
    private String result;

    public DetectionHistory(){}

    public Long getId() { return id; }
    public String getNoteName() { return noteName; }
    public String getResult() { return result; }

    public void setId(Long id) { this.id = id; }
    public void setNoteName(String noteName) { this.noteName = noteName; }
    public void setResult(String result) { this.result = result; }
}