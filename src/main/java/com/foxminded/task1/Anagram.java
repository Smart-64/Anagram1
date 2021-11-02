package com.foxminded.task1;

import java.util.function.Function;

public class Anagram implements Function<String, String> {

    public static final String whitespace = " ";

    @Override
    public String apply(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Text cannot be Null");
        }
        if (s.equals("")) {
            throw new IllegalArgumentException("Text cannot be empty");
        }
        if (s.equals(" ")) {
            throw new IllegalArgumentException("The text cannot consist of a single space");
        }
        if (s.trim().isEmpty()) {
            throw new IllegalArgumentException("The text cannot consist only of spaces");
        }
        if (s.length() == 1) {
            throw new IllegalArgumentException("The text cannot consist of a single character");
        }

        if (isBoolCheckOnSameLetters(s)) {
            throw new IllegalArgumentException("The text cannot consist only of same letters");
        }

        if (isBoolCheckOnSameUpperAndLowerLetters(s)) {
            throw new IllegalArgumentException("The text cannot consist only of same character in lower and upper cases");
        }

        if (isBoolCheckOnOnlySymbols(s)) {
            throw new IllegalArgumentException("The text cannot consist only of symbols");
        }

        String[] words = s.split(whitespace);
        StringBuilder result = new StringBuilder();

        for (String word : words) {

            result
                    .append(reverse(word))
                    .append(whitespace);
        }

        return result.toString();
    }

    private boolean isBoolCheckOnOnlySymbols(String s) {
        char[] arrayOfOnlySymbols = s.toCharArray();
        boolean boolCheckOnOnlySymbols = false;
        for (int i = 0; i < arrayOfOnlySymbols.length; i++) {
            if (!Character.isDigit(arrayOfOnlySymbols[i]) && !Character.isLetter(arrayOfOnlySymbols[i])) {
                if (arrayOfOnlySymbols[i] == s.charAt(s.length() - 1)) {
                    boolCheckOnOnlySymbols = true;
                }
            } else break;
        }
        return boolCheckOnOnlySymbols;
    }

    private boolean isBoolCheckOnSameLetters(String s) {
        char[] arrayOfSameLetters = s.toCharArray();
        boolean boolCheckOnSameLetters = false;
        for (int i = 0; i < arrayOfSameLetters.length - 1; i++) {
            if (arrayOfSameLetters[i] == arrayOfSameLetters[i + 1]) {
                if (arrayOfSameLetters[i + 1] == s.charAt(s.length() - 1)) {
                    boolCheckOnSameLetters = true;
                }
            } else break;
        }
        return boolCheckOnSameLetters;
    }

    private boolean isBoolCheckOnSameUpperAndLowerLetters(String s) {
        char[] arrayOfSameUpperAndLowerLetters = s.toCharArray();
        boolean boolCheckOnSameUpperAndLowerLetters = false;
        int countOfLowerCase = 0;
        int countOfUpperCase = 0;
        for (int i = 0; i < arrayOfSameUpperAndLowerLetters.length - 1; i++) {
            if (Character.toLowerCase(arrayOfSameUpperAndLowerLetters[i]) == Character.toLowerCase(arrayOfSameUpperAndLowerLetters[i + 1])) {
                if (Character.isLowerCase(arrayOfSameUpperAndLowerLetters[i])) {
                    countOfLowerCase = countOfLowerCase + 1;
                }
                if (Character.isUpperCase(arrayOfSameUpperAndLowerLetters[i])) {
                    countOfUpperCase = countOfUpperCase + 1;
                }
                if (arrayOfSameUpperAndLowerLetters[i + 1] == s.charAt(s.length() - 1) && (countOfLowerCase != 0 && countOfUpperCase != 0)) {
                    boolCheckOnSameUpperAndLowerLetters = true;
                }
            } else break;
        }
        return boolCheckOnSameUpperAndLowerLetters;
    }

    private char[] reverse(String word) {
        char[] chars = word.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            if (!Character.isLetter(chars[i])) {
                j++;
            } else if (!Character.isLetter(chars[j])) {
                i--;
            } else {
                char temporaryChar = chars[i];
                chars[i] = chars[j];
                chars[j] = temporaryChar;
            }
            i++;
            j--;
        }
        return chars;

    }

}
