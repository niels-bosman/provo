package com.company.models;

import java.util.List;

import com.company.models.vraag.Vraag;
import com.company.views.KennistoetsView;

public class Kennistoets {
    private List<Vraag> vragen;

    public Kennistoets(List<Vraag> vragen) {
        this.vragen = vragen;
    }


    public int uitvoeren() {
        int aantalVragenCorrect = 0;

        for (int i = 0; i < this.vragen.toArray().length; i++) {
            // 2. Toon vraag en ontvang antwoord.
            String formattedVraag = String.format("\nVraag %d. \n%s", i + 1, vragen.get(i).toString());
            String antwoord = KennistoetsView.getInstance().ontvangAntwoord(formattedVraag);

            // 3. Check of antwoord goed is
            if (vragen.get(i).isAntwoordCorrect(antwoord)) {
                aantalVragenCorrect++;
            }
        }

        KennistoetsView.getInstance().toonEindBericht();

        return aantalVragenCorrect;
    }
}
