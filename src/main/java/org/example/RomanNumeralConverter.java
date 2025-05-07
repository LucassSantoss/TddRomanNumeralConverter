package org.example;

import java.util.Map;

public class RomanNumeralConverter {
    private static final Map<Character, Integer> table = Map.of(
        'I', 1,'V', 5, 'X', 10,'L', 50,
        'C', 100,'D', 500, 'M', 1000
    );


    public int convert(String numberInRoman){
        int finalNumber = 0;
        for(int i = 0; i < numberInRoman.length(); i++) {
            finalNumber += table.get(numberInRoman.charAt(i));
        }
        return finalNumber;
    }
}
