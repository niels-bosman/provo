package com.company;

import com.company.factories.JuistOnjuistVraagFactory;
import com.company.factories.KennistoetsFactory;
import com.company.factories.KortAntwoordVraagFactory;
import com.company.factories.MeerkeuzeVraagFactory;
import com.company.models.Kennistoets;
import com.company.models.Lokaal;
import com.company.models.Sessie;

import java.util.ArrayList;
import java.util.List;

public class MockDatabase {
    public static List<Kennistoets> verkrijgKennistoetsen() {
        List<Kennistoets> kennistoetsen = new ArrayList<Kennistoets>();

        Kennistoets kennistoets = KennistoetsFactory.maak(
                MeerkeuzeVraagFactory.maak(
                        "Welke van de begrippen needs, features and requirements horen bij het solution domain?",
                        "features and requirements",
                        "needs, features and requirements",
                        "needs and requirements",
                        "alleen requirements"
                ),
                MeerkeuzeVraagFactory.maak(
                        "Wat wordt bedoeld met elicit needs from stakeholders?",
                        "Het boven tafel krijgen van de needs van belanghebbenden",
                        "Het valideren van de needs van belanghebbenden",
                        "Het vertalen van de needs van belanghebbenden naar software features"
                ),
                MeerkeuzeVraagFactory.maak(
                        "Wat leg je vast m.b.v. use cases?",
                        "functional requirements",
                        "needs",
                        "features",
                        "non-functional requirements"
                ),
                KortAntwoordVraagFactory.maak(
                        "Welke term wordt gebruikt voor 'the ability to describe and follow the life of a requirement, in both forwards and backwards direction'?",
                        "traceability",
                        "tracebility",
                        "traceabillity",
                        "tracebillity"
                ),
                MeerkeuzeVraagFactory.maak(
                        "In een project wordt gewerkt volgens een iteratieve en incrementele aanpak. Aan het begin van het project heb je de requirements opgesteld. Op welke momenten in het project kunnen de requirements gewijzigd worden?",
                        "Na elke iteratie",
                        "Op elk gewenst moment",
                        "Niet meer, de requirements ligggen vast"
                ),
                JuistOnjuistVraagFactory.maak(
                        "De onderstaande eis R1 valt in de categorie Usability. \n\n R1: Het systeem moet 75% van de webpagina's binnen 2 seconden tonen. Voor de overige pagina's mag het nooit langer dan 5 seconden duren.",
                        "Onjuist"
                )
        );

        kennistoetsen.add(kennistoets);

        return kennistoetsen;
    }

    public static Lokaal verkrijgBeschikbaarLokaal(int lokaalnummer) {
        return new Lokaal(lokaalnummer);
    }

    public static Sessie verkrijgSessie(int lokaalnummer) {
        Kennistoets kennistoets = MockDatabase.verkrijgKennistoetsen().get(0);
        Lokaal lokaal = MockDatabase.verkrijgBeschikbaarLokaal(lokaalnummer);

        return new Sessie(kennistoets, lokaal);
    }
}
