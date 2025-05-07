package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralConverterTest {
    private RomanNumeralConverter sut;

    @BeforeEach
    public void setUp() {
        sut = new RomanNumeralConverter();
    }

    @ParameterizedTest(name = "Should convert {0} in Roman to {1} in Arabic")
    @CsvSource({"I,1", "V,5", "X,10","L,50", "C, 100", "D, 500", "M, 1000"})
    void shouldConvertRomanToArabic(String roman, int arabic){
        int number = sut.convert(roman);
        assertThat(number).isEqualTo(arabic);
    }
}