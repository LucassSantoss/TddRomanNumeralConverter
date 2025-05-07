package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralConverterTest {
    @Test
    @DisplayName("Should convert I to 1")
    void shouldConvertITo1(){
        RomanNumeralConverter sut = new RomanNumeralConverter();
        int number = sut.convert("I");
        assertThat(number).isEqualTo(1);
    }
}