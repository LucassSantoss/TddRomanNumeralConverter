package org.example;

import java.util.Map;

public class RomanNumeralConverter {
    private static final Map<String, Integer> table = Map.of(
            "I", 1,
            "V", 5
    );


    public int convert(String numberInRoman){
        return table.get(numberInRoman);
    }
}
