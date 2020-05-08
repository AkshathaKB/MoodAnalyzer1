package com.moodanalyser;

public class Moodanalyser {
    public String analyseMood(String message) {
        if (message.contains("Sad")) {
            return "SAD";
        } else
            return "HAPPY";
    }
}
