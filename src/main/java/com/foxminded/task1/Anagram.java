package com.foxminded.task1;

public class Anagram {

    public static final String whitespace = " ";

    public String[] splitStr(String inputStr)
    {
        return inputStr.split(whitespace);
    }

    public String ReverseWords(String[] words)
    {
        StringBuilder reversedFinalOutput = new StringBuilder();

        for (String word: words) {

            char[] chars = word.toCharArray();

            int i = 0;
            int j = word.length() - 1;
            while (i < j){
                if (!Character.isLetter(chars[i])) {
                    j++;
                }
                else if(!Character.isLetter(chars[j])){
                    i--;
                }
                else
                {
                    char temporaryChar = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temporaryChar;
                }
                i++;
                j--;
            }
            reversedFinalOutput.append(chars).append(whitespace);
        }

        String outputStr = reversedFinalOutput.toString();

        return outputStr;
    }
}
