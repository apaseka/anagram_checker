package com.globallogic.service;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class AnagramCheckerTest {


    @Test
    public void checkSuccess() {
        AnagramChecker anagramChecker = new AnagramChecker();
        Object check = anagramChecker.check("abcdef", "bcdaef");
        assertEquals("Strings are anagrams", check);
    }

    @Test
    public void checkPartSuccess() {
        AnagramChecker anagramChecker = new AnagramChecker();
        Object check = anagramChecker.check("abcdef", "aacdfg");
        assertEquals(new ArrayList<>(Arrays.asList('b', 'e')), check);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkFail() {
        AnagramChecker anagramChecker = new AnagramChecker();
        anagramChecker.check("long", "a");
    }
}
