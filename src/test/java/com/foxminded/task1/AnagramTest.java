package com.foxminded.task1;

import org.junit.Test;

public class AnagramTest extends Anagram {
    @Test
    public void testApplyOnNull_GiveMessage_whenPutNull(){
        Anagram anagram = new Anagram();
        anagram.apply(null);
    }
}