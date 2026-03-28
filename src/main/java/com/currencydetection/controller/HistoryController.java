package com.currencydetection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.currencydetection.repository.HistoryRepository;

@RestController
@RequestMapping("/history")
public class HistoryController {

    @Autowired
    private HistoryRepository historyRepository;

    @GetMapping
    public Object getAllHistory(){
        return historyRepository.findAll();
    }
}