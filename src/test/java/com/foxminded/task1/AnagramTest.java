package com.foxminded.task1;

import org.junit.jupiter.api.Test;

public class AnagramTest  {
    @Test
    public void testApplyOnNull_GiveMessage_whenPutNull(){
        Anagram anagram = new Anagram();
        anagram.apply(null);
    }
}