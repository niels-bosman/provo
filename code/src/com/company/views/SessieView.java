package com.company.views;

public class SessieView extends View {
    private static SessieView instance;

    public static SessieView getInstance() {
        if (instance == null) {
            instance = new SessieView();
        }

        return instance;
    }

    public String ontvangStudentNaam() {
        super.maakSchermLeeg();

        System.out.print("Geef uw naam op: ");
//        String naam = System.console().readLine();
        String naam = super.scanner.nextLine();

        return naam;
    }

    public void toonEindBericht(String naam, int aantalCorrecteAntwoorden, int verstrekenTijdSeconden) {
        super.maakSchermLeeg();

        System.out.println("\nKennistoets ingeleverd!");
        System.out.println(String.format("Je hebt %d vragen correct beantwoord en je hebt er %d seconden over gedaan.", aantalCorrecteAntwoorden, verstrekenTijdSeconden));
        System.out.println(String.format("Bedankt %s!", naam));
    }
}