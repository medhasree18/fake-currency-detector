package com.currencydetection.util;

public class FakeCurrencyDetector {

    public static String analyze(String noteName) {

        if(noteName.toLowerCase().contains("fake")) {
            return "Fake";
        }

        return "Real";
    }
}