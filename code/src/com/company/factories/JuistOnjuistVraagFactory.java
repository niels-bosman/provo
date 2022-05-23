package com.company.factories;

import com.company.models.Antwoord;
import com.company.models.vraag.JuistOnjuistVraag;

public class JuistOnjuistVraagFactory {
    public static JuistOnjuistVraag maak(String vraag, String antwoord) {
        return new JuistOnjuistVraag(vraag, new Antwoord(antwoord));
    }
}