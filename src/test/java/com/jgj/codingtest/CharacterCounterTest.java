package com.jgj.codingtest;
import com.jgj.codingtest.CharacterCounter;

import static org.junit.Assert.assertEquals;

public class CharacterCounterTest {
    CharacterCounter cc;
    String sentence = "This is a very long sentence and I want to educate everyone in this whole crazy world….";

    @org.junit.Before
    public void setUp() throws Exception {
        cc = new CharacterCounter();
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void testGivenTest_findWordWithMostCharacters() {
        assertEquals("crazy", cc.findWordWithMostCharacters(sentence,'z') );
        assertEquals("sentence", cc.findWordWithMostCharacters(sentence,'e') );
        assertEquals("I", cc.findWordWithMostCharacters(sentence,'I') );
    }

    @org.junit.Test
    public void testNotFound_findWordWithMostCharacters() {
        assertEquals("", cc.findWordWithMostCharacters("This",'D') );
    }

    @org.junit.Test
    public void testSamelength_findWordWithMostCharacters() {
        assertEquals("one", cc.findWordWithMostCharacters("one man ",'n') );
    }

    @org.junit.Test
    public void testlength_findWordWithMostCharacters() {
        assertEquals("Orange", cc.findWordWithMostCharacters("Apple Orange",'e') );
    }

    @org.junit.Test
    public void testlengthfirst_findWordWithMostCharacters() {
        assertEquals("TastyApple", cc.findWordWithMostCharacters("TastyApple Orange ",'e') );
    }

    @org.junit.Test
    public void testEmptySenetence_findWordWithMostCharacters() {
        assertEquals("", cc.findWordWithMostCharacters("",'a' ));
    }

    @org.junit.Test
    public void testEmptyChar_findWordWithMostCharacters() {
        assertEquals("", cc.findWordWithMostCharacters("Test Sentence",' ' ));
    }


    @org.junit.Test
    public void testLongSentence_findWordWithMostCharacters() {
        assertEquals("characters", cc.findWordWithMostCharacters("Given a long statement and a input letter, find the word which contains the most number of the given character .\n" +
                "    If more than one word has the exact same number of the given letter, it should return the word with the most number of total letters,\n" +
                "            if more than one words have equal number of given character and total number of characters return the word that appeared first\n" +
                "    in the given statement.",'r' ));
    }

    @org.junit.Test
    public void testGivenTests_getStartingPos() {
        assertEquals(4, cc.getStartingPos(156));
        assertEquals(3, cc.getStartingPos(88));
    }

    @org.junit.Test
    public void testAll_1_getStartingPos() {
        assertEquals(1, cc.getStartingPos(15));
    }

    @org.junit.Test
    public void testZero_getStartingPos() {
        assertEquals(0, cc.getStartingPos(0));
    }

    @org.junit.Test
    public void testOne_getStartingPos() {
        assertEquals(1, cc.getStartingPos(1));
    }

    @org.junit.Test
    public void testAlternate_getStartingPos() {
        assertEquals(1, cc.getStartingPos(10));
    }

    @org.junit.Test
    public void testadditional_getStartingPos() {
        assertEquals(1, cc.getStartingPos(18));
        assertEquals(4, cc.getStartingPos(19));
        assertEquals(1, cc.getStartingPos(24));
        assertEquals(3, cc.getStartingPos(45));
        assertEquals(1, cc.getStartingPos(1000000000));
    }
}
