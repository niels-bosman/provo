package com.company.views;

import java.io.BufferedReader;
import java.util.Scanner;

public abstract  class View {
    protected Scanner scanner;

    public View () {
        scanner = new Scanner(System.in);
    }

    protected void maakSchermLeeg() {
        System.out.println(System.lineSeparator().repeat(100)); // Fallback voor IDE console's
        System.out.print("\033[H\033[2J"); // Dit werkt alleen wanneer je de app via console draait.
        System.out.flush();
    }
}
