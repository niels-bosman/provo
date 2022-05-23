package com.company.models.vraag;

import com.company.models.Antwoord;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MeerkeuzeVraag extends Vraag {
    private List<Antwoord> antwoorden;

    public MeerkeuzeVraag(String vraag, Antwoord correctAntwoord, List<Antwoord> antwoorden) {
        super(vraag, List.of(correctAntwoord));
        this.antwoorden = antwoorden;
        antwoorden.add(correctAntwoord);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(vraag + "\n");

        Collections.shuffle(antwoorden);

        for (int i = 0; i < antwoorden.toArray().length; i++) {
            sb.append("\t" + ((char) (i+65)) + ". "); // Convert int to char: https://www.asciitable.com/
            sb.append(antwoorden.get(i) + "\n");
        }

        return sb.toString();
    }
}
