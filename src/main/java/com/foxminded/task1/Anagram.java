package com.foxminded.task1;

import java.util.function.Function;

public class Anagram implements Function<String, String> {

    public static final String whitespace = " ";

    @Override
    public String apply(String s) {
        String[] words = s.split(whitespace);
        StringBuilder result = new StringBuilder();

        for (String word : words) {

            result
                    .append(reverse(word))
                    .append(whitespace);
        }

        return result.toString();
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
