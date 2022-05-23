package com.company.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.company.MockDatabase;
import com.company.views.SessieView;

public class Sessie {
    private String studentNaam;
    private final Kennistoets kennistoets;
    private Lokaal lokaal;
    private final List<Student> studenten = new ArrayList<Student>();
    private final Date startTijd;

    public Sessie(Kennistoets kennistoets, Lokaal lokaal) {
        this.kennistoets = kennistoets;
        this.lokaal = lokaal;
        this.startTijd = new Date();
    }

    public static Sessie aanmelden(int lokaalnummer) {
        String naam = SessieView.getInstance().ontvangStudentNaam();

        Sessie sessie = MockDatabase.verkrijgSessie(lokaalnummer);
        sessie.studenten.add(new Student(naam));
        sessie.studentNaam = naam;

        return sessie;
    }

    public Kennistoets verkrijgKennistoets() {
        return this.kennistoets;
    }

    public void resultatenInleveren(int aantalVragenCorrect) {
        long verstrekenTijdMs = new Date().getTime() - startTijd.getTime();
        int verstrekenTijdSeconden = (int) (verstrekenTijdMs / 1000);

        for(Student _student : studenten) {
            if (_student.getNaam().equals(studentNaam)) {
                _student.setKennistoetsResultaten(aantalVragenCorrect, verstrekenTijdSeconden);
                SessieView.getInstance().toonEindBericht(studentNaam, aantalVragenCorrect, verstrekenTijdSeconden);
                return;
            }
        }
    }

}
