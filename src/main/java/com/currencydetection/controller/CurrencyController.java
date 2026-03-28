package com.currencydetection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.currencydetection.service.DetectionService;

@RestController
@CrossOrigin(origins = {
	    "http://localhost:5173",
	    "https://fake-currency-frontend.vercel.app"
	})
@RequestMapping("/currency")
public class CurrencyController {

    @Autowired
    private DetectionService detectionService;

    @PostMapping("/detect")
    public String detect(@RequestParam("file") MultipartFile file) {

        String fileName = file.getOriginalFilename();

        // Call your service
        String result = detectionService.detectFake(fileName);

        return result; // should return "REAL" or "FAKE"
    }
}