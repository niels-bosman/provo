package com.company.models.vraag;

import com.company.models.Antwoord;

import java.util.List;

public class JuistOnjuistVraag extends Vraag {


    public JuistOnjuistVraag(String vraag, Antwoord antwoord) {
        super(vraag, (List.of(antwoord)));
    }

    @Override
    public String toString() {
        return vraag + " Juist of Onjuist?";
    }
}
