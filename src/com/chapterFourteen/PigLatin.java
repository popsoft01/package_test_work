package com.chapterFourteen;

import java.util.Arrays;

public class PigLatin {

    public void sentenceToken(String sentence) {
       String[] word = sentence.split(" ");
        System.out.println(Arrays.toString(word));
        char[] newChar = stringToChar(word);
    }

    private char[] stringToChar(String[] word) {
        char[] letter = new char[word.length];
        for (int i = 0; i < word.length; i++){
            letter = word[i].toCharArray();
            System.out.println(Arrays.toString(letter));
        }
        return letter;
    }
}
