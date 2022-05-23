package com.company.models;

public class Antwoord {
    private String antwoord;

    public Antwoord(String antwoord) {
        this.antwoord = antwoord;
    }

    public String getAntwoord() {
        return antwoord;
    }

    @Override
    public String toString() {
        return antwoord;
    }
}
