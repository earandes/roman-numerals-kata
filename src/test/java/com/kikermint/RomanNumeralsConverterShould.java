package com.kikermint;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumeralsConverterShould {

    private RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

    @Test
    public void convert_number_1() {
        assertThat(romanNumeralsConverter.convert(1)).isEqualTo("I");
    }

    @Test
    public void convert_number_2() {
        assertThat(romanNumeralsConverter.convert(2)).isEqualTo("II");
    }

    @Test
    public void convert_number_3() {
        assertThat(romanNumeralsConverter.convert(3)).isEqualTo("III");
    }

    @Test
    public void convert_number_4() {
        assertThat(romanNumeralsConverter.convert(4)).isEqualTo("IV");
    }

    @Test
    public void convert_number_5() {
        assertThat(romanNumeralsConverter.convert(5)).isEqualTo("V");
    }

    @Test
    public void convert_number_9() {
        assertThat(romanNumeralsConverter.convert(9)).isEqualTo("IX");
    }

    @Test
    public void convert_number_21() {
        assertThat(romanNumeralsConverter.convert(21)).isEqualTo("XXI");
    }

    @Test
    public void convert_number_50() {
        assertThat(romanNumeralsConverter.convert(50)).isEqualTo("L");
    }

    @Test
    public void convert_number_100() {
        assertThat(romanNumeralsConverter.convert(100)).isEqualTo("C");
    }

    @Test
    public void convert_number_500() {
        assertThat(romanNumeralsConverter.convert(500)).isEqualTo("D");
    }

    @Test
    public void convert_number_1000() {
        assertThat(romanNumeralsConverter.convert(1000)).isEqualTo("M");
    }
}
