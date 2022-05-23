package com.company.models;

import java.util.Date;

public class Student {
    private String naam;
    private int punten;
    private int aantalVragenCorrect;
    private int verstrekenTijdSeconden;

    public Student(String naam) {
        this.naam = naam;
        this.punten = 0;
        this.aantalVragenCorrect = 0;
    }

    public String getNaam() {
        return naam;
    }

    public void setKennistoetsResultaten(int aantalVragenCorrect, int verstrekenTijdSeconden) {
        this.aantalVragenCorrect = aantalVragenCorrect;
        this.verstrekenTijdSeconden = verstrekenTijdSeconden;

    }
}
