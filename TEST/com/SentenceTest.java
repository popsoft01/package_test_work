package com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SentenceTest {
    @Test
    void canGenerateSentence(){
//      assertEquals( Sentence.generateSentence());
       String[] article = new String[]{"the", "a", "one", "some", "any"};
        System.out.println(Sentence.generateFirstArticle(article));
        String[] noun = {"boy" , "girl" , "dog" , "town","car"};
        System.out.println(Sentence.generateNoun(noun));
    }
}
