package com.company.models.vraag;

import com.company.models.Antwoord;

import java.util.List;

public class KortAntwoordVraag extends Vraag {
    public KortAntwoordVraag(String vraag, List<Antwoord> correcteAntwoorden) {
        super(vraag, correcteAntwoorden);
    }

    @Override
    public String toString() {
        return super.vraag;
    }
}
