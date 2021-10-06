package Main;

import java.util.Scanner;
import java.util.function.Function;

public class Anagram {

    private String inputStr;
    public static final String WHITESPACE_DELIMITER = " ";

    public String ReverseWords(String inputStr)
    {
        StringBuilder reversedFinalOutput = new StringBuilder();

        String[] splittingWords = inputStr.split(WHITESPACE_DELIMITER); //разделение вх. строки на слова через пробел

        for (String word: splittingWords) {

            char[] arrayCharOfWord = word.toCharArray();

            int i = 0;
            int j = word.length() - 1;
            while (i < j)
            {   // меняем местами буквы с индексами i and j
                if (!Character.isLetter(arrayCharOfWord[i])) {
                    j++;
                }
                else if(!Character.isLetter(arrayCharOfWord[j])){
                    i--;
                }
                else
                {
                    char temporaryChar = arrayCharOfWord[i];
                    arrayCharOfWord[i] = arrayCharOfWord[j];
                    arrayCharOfWord[j] = temporaryChar;
                }
                i++;
                j--;
            }
            reversedFinalOutput.append(arrayCharOfWord).append(WHITESPACE_DELIMITER);
        }

        String outputStr = reversedFinalOutput.toString();

        return outputStr;
    }
}
