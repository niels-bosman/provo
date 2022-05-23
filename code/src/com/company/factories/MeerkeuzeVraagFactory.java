package com.company.factories;

import java.util.ArrayList;
import java.util.List;

import com.company.models.Antwoord;
import com.company.models.vraag.MeerkeuzeVraag;

public class MeerkeuzeVraagFactory {
    public static MeerkeuzeVraag maak(String vraag, String correctAntwoord, String... antwoorden) {
        List<Antwoord> antwoordenLijst = new ArrayList<Antwoord>();

        for (String antwoord : antwoorden) {
            antwoordenLijst.add(new Antwoord(antwoord));
        }

        return new MeerkeuzeVraag(vraag, new Antwoord(correctAntwoord), antwoordenLijst);
    }
}