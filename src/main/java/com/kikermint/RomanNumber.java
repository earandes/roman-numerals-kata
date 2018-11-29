package com.kikermint;

enum RomanNumber {
    THOUSAND(1000, "M"),
    NINE_HUNDRED(900, "CM"),
    FIVE_HUNDRED(500, "D"),
    FOUR_HUNDRED(400, "CD"),
    HUNDRED(100, "C"),
    NINETY(90, "XC"),
    FIFTY(50, "L"),
    FORTY(40, "XL"),
    TEN(10, "X"),
    NINE(9, "IX"),
    FIVE(5, "V"),
    FOUR(4, "IV"),
    ONE(1, "I"),
    ;

    private final int number;
    private final String roman;

    RomanNumber(int number, String roman) {
        this.number = number;
        this.roman = roman;
    }

    public int getNumber() {
        return number;
    }

    public String getRoman() {
        return roman;
    }
}