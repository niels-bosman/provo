package com.company.factories;

import java.util.ArrayList;
import java.util.List;

import com.company.models.Antwoord;
import com.company.models.vraag.KortAntwoordVraag;

public class KortAntwoordVraagFactory {
    public static KortAntwoordVraag maak(String vraag, String... antwoorden) {
        List<Antwoord> antwoordenLijst = new ArrayList<Antwoord>();

        for (String antwoord : antwoorden) {
            antwoordenLijst.add(new Antwoord(antwoord));
        }

        return new KortAntwoordVraag(vraag, antwoordenLijst);
    }
}