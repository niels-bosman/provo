package com.company;

import com.company.models.Kennistoets;
import com.company.models.Sessie;

public class ProvoApp {
    // Wij gaan ervan uit dat we alleen de logica voor het beantwoorden van de
    // vragen moeten uitwerken, zoals expliciet vermeld staat in de casus.
    // Het aanmelden bij een lokaal en het opgeven van een naam valt hier dus buiten.

    public static void main(String[] args) {
        // De use cases "Aanmaken kennistoets' en 'Start Kennistoets' is in de context van deze implementatie gemockt. We hebben een MockDatabase waaruit een kennistoets sessie opgehaald kan worden.
        // Normaliter voert een Docent deze operatie handmatig uit, maar volgens de opdracht in de casus hoeven we deze operatie niet te implementeren.

        // Use case 'Uitvoeren kennistoets':
        int lokaalnummer = 123;

        Sessie sessie = aanmeldenLokaal(lokaalnummer);
        Kennistoets kennistoets = sessie.verkrijgKennistoets();

        int aantalVragenCorrect = beantwoordVragen(kennistoets);

        resultaatInleveren(sessie, aantalVragenCorrect);
    }

    private static Sessie aanmeldenLokaal(int lokaalnummer) {
        return Sessie.aanmelden(lokaalnummer);
    }

    private static int beantwoordVragen(Kennistoets kennistoets) {
        return kennistoets.uitvoeren();
    }

    private static void resultaatInleveren(Sessie sessie, int aantalVragenCorrect) {
        sessie.resultatenInleveren(aantalVragenCorrect);
    }

}
