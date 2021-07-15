package com.chapterFourteen;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PigLatin {

    public void sentenceToken(String sentence) {
       String[] word = sentence.split(" ");
        System.out.println(Arrays.toString(word));
        stringToChar(word);
    }

    private void stringToChar(String[] word) {
        for (int i = 0; i < word.length; i++){
            char[] letter = word[i].toCharArray();


        }
    }
}
