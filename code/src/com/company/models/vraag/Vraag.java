package com.company.models.vraag;

import com.company.models.Antwoord;

import java.util.List;

public abstract class Vraag {
    protected String vraag;
    protected List<Antwoord> correcteAntwoorden;


    public Vraag(String vraag, List<Antwoord> correcteAntwoorden) {
        this.vraag = vraag;
        this.correcteAntwoorden = correcteAntwoorden;
    }

    public boolean isAntwoordCorrect(String antwoord) {
        return correcteAntwoorden.stream().anyMatch(correctAntwoord -> correctAntwoord.getAntwoord().equalsIgnoreCase(antwoord));
    }
}
