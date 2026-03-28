package com.currencydetection.service;

import org.springframework.stereotype.Service;

@Service
public class DetectionService {

    public String detectFake(String imageName) {

        // Check if filename contains "fake"
        if (imageName != null && imageName.toLowerCase().contains("fake")) {
            return "FAKE";
        } else {
            return "REAL";
        }
    }
}