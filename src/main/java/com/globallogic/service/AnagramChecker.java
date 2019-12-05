package com.globallogic.service;

import java.util.ArrayList;
import java.util.List;

public class AnagramChecker implements AnagramInterface {

    public Object check(String a1, String a2) throws IllegalArgumentException {
        if (a1.length() == a2.length()) {
            Object result;
            List<Character> anagramFirstChars = new ArrayList<>();
            for (char a1Char : a1.toCharArray()) {
                anagramFirstChars.add(a1Char);
            }
            for (final char a2Char : a2.toCharArray()) {
                anagramFirstChars.removeIf(a1Char -> a1Char == a2Char);
            }
            if (anagramFirstChars.isEmpty()) {
                result = "Strings are anagrams";
                System.out.println(result);
            } else {
                result = anagramFirstChars;
                System.out.println(anagramFirstChars);
            }
            return result;
        } else {
            throw new IllegalArgumentException("The length of words must be equal!");
        }
    }
}
