package com.company.views;

public class KennistoetsView extends View {
    private static KennistoetsView instance;

    public static KennistoetsView getInstance() {
        if (instance == null) {
            instance = new KennistoetsView();
        }

        return instance;
    }

    public String ontvangAntwoord(String vraag) {
        super.maakSchermLeeg();

        System.out.println(vraag);
        System.out.print("Jouw antwoord (type het hele antwoord uit): ");
        String antwoord = super.scanner.nextLine();

        return antwoord;
    }

    public void toonEindBericht() {
        super.maakSchermLeeg();

        System.out.println("\nEINDE TOETS!");
        System.out.println("Je hebt alle vragen beantwoord.");
    }
}
