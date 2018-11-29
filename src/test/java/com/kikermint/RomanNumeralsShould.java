package com.kikermint;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumeralsShould {

    private RomanNumerals romanNumerals = new RomanNumerals();

    @Test
    public void convert_number_1() {
        assertThat(romanNumerals.convert(1)).isEqualTo("I");
    }

    @Test
    public void convert_number_2() {
        assertThat(romanNumerals.convert(2)).isEqualTo("II");
    }

    @Test
    public void convert_number_3() {
        assertThat(romanNumerals.convert(3)).isEqualTo("III");
    }

    @Test
    public void convert_number_4() {
        assertThat(romanNumerals.convert(4)).isEqualTo("IV");
    }

    @Test
    public void convert_number_5() {
        assertThat(romanNumerals.convert(5)).isEqualTo("V");
    }

    @Test
    public void convert_number_9() {
        assertThat(romanNumerals.convert(9)).isEqualTo("IX");
    }

    @Test
    public void convert_number_21() {
        assertThat(romanNumerals.convert(21)).isEqualTo("XXI");
    }

    @Test
    public void convert_number_50() {
        assertThat(romanNumerals.convert(50)).isEqualTo("L");
    }

    @Test
    public void convert_number_100() {
        assertThat(romanNumerals.convert(100)).isEqualTo("C");
    }

    @Test
    public void convert_number_500() {
        assertThat(romanNumerals.convert(500)).isEqualTo("D");
    }

    @Test
    public void convert_number_1000() {
        assertThat(romanNumerals.convert(1000)).isEqualTo("M");
    }
}
