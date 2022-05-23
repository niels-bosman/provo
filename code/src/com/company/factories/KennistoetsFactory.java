package com.company.factories;

import java.util.Arrays;

import com.company.models.Kennistoets;
import com.company.models.vraag.Vraag;

public class KennistoetsFactory {
    public static Kennistoets maak(Vraag... vragen) {
        return new Kennistoets(Arrays.asList(vragen));
    }
}