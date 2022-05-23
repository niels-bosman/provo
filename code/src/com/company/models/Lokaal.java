package com.company.models;

public class Lokaal {
    private int lokaalnummer;

    public Lokaal(int lokaalnummer) {
        this.lokaalnummer = lokaalnummer;
    }

    public int verkrijgLokaalnummer() {
        return this.lokaalnummer;
    }
}
