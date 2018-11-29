package com.kikermint;

class RomanNumerals {

    String convert(int number) {
        StringBuilder result = new StringBuilder();

        for (RomanNumber romanNumber : RomanNumber.values()) {
            while (number >= romanNumber.getNumber()) {
                result.append(romanNumber.getRoman());
                number -= romanNumber.getNumber();
            }
        }
        return result.toString();
    }
}
