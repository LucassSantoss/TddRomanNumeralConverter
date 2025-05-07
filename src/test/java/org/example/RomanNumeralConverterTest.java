package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralConverterTest {
    private RomanNumeralConverter sut;

    @BeforeEach
    public void setUp() {
        sut = new RomanNumeralConverter();
    }


    @Test
    @DisplayName("Should convert I to 1")
    void shouldConvertITo1(){
        int number = sut.convert("I");
        assertThat(number).isEqualTo(1);
    }
    
    @Test
    @DisplayName("Should convert V to 5")
    void shouldConvertVTo5(){
        int number = sut.convert("V");
        assertThat(number).isEqualTo(5);
    }
}