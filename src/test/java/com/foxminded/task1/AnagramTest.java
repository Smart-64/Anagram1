package com.foxminded.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnagramTest {

    Anagram anagram = new Anagram();

    @Test
    public void testApplyOnNull_giveMessage_whenPutNull() {

        IllegalArgumentException exception = Assertions
                .assertThrows(IllegalArgumentException.class, () -> anagram.apply(null));
        assertEquals("Text cannot be Null", exception.getMessage());
    }

    @Test
    public void testApplyOnEmptyString_giveMessage_whenStringIsEmpty() {

        IllegalArgumentException exception = Assertions
                .assertThrows(IllegalArgumentException.class, () -> anagram.apply(""));
        assertEquals("Text cannot be empty", exception.getMessage());
    }

    @Test
    public void testApplyOnSingleSpace_giveMessageAboutSingleSpace_whenInputSingleSpace() {
        IllegalArgumentException exception = Assertions
                .assertThrows(IllegalArgumentException.class, () -> anagram.apply(" "));
        assertEquals("The text cannot consist of a single space", exception.getMessage());
    }

    @Test
    public void testApplyOnSeveralSpaces_giveMessage_whenInputSeveralSpaces() {
        IllegalArgumentException exception = Assertions
                .assertThrows(IllegalArgumentException.class, () -> anagram.apply("    "));
        assertEquals("The text cannot consist only of spaces", exception.getMessage());
    }

    @Test
    public void testApplyOnSingleCharacter_giveMessage_whenInputSingleCharacter() {
        IllegalArgumentException exception = Assertions
                .assertThrows(IllegalArgumentException.class, () -> anagram.apply("A"));
        assertEquals("The text cannot consist of a single character", exception.getMessage());
    }

    @Test
    public void testApplyOnMultipleSameLetter_giveMessage_whenInputSameLetter() {
        IllegalArgumentException exception = Assertions
                .assertThrows(IllegalArgumentException.class, () -> anagram.apply("aaa"));
        assertEquals("The text cannot consist only of same letters", exception.getMessage());
    }

    @Test
    public void testApplyOnTheSameCharacterInLowerAndUpperCasesMixedTheInput_giveMessage_whenInputSameCharacter() {
        IllegalArgumentException exception = Assertions
                .assertThrows(IllegalArgumentException.class, () -> anagram.apply("BbBbb bBb"));
        assertEquals("The text cannot consist only of same character in lower and upper cases", exception.getMessage());
    }

    @Test
    public void testApplyOnWordWithDifferentLetters_giveReverseWord_whenInputWordWithDifferentLetters() {
        assertEquals("dr5ow", anagram.apply("wo5rd").trim());
    }

    @Test
    public void testApplyOnOnlySymbols_giveMessage_whenInputOnlySymbols() {
        IllegalArgumentException exception = Assertions
                .assertThrows(IllegalArgumentException.class, () -> anagram.apply("!@#$%^ !@#*"));
        assertEquals("The text cannot consist only of symbols", exception.getMessage());
    }

    @Test
    public void testApplyOnSeveralWords_giveReverseWords_wheninputSeveralWords() {
        assertEquals("lareves sdrow", anagram.apply("several words").trim());
    }
}