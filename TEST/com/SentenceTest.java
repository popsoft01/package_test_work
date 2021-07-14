package com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SentenceTest {
    @Test
    void canGenerateSentence(){
//      assertEquals( Sentence.generateSentence());
       String[] article = {"the ", "a ", "one ", "some ", "any"};
//        System.out.println(Sentence.generateFirstArticle(article));
        String[] noun = {"boy " , "girl " , "dog " , "town ","car "};
//        System.out.println(Sentence.generateNoun(noun));
        String[] verb = {"drove " , "jumped " , "ran " , "walked ","skipped "};
//        System.out.println(Sentence.generateVerb(verb));
        String[] prep = {"to" , "from" , "over" , "under","on"};
//        System.out.println(Sentence.generatePreposition(prep));
        String firsttwoSentence = Sentence.generateFirstArticle(article).concat(Sentence.generateNoun(noun));
        String lastTwoWord = Sentence.generateVerb(verb).concat(Sentence.generatePreposition(prep));
        String fullSentence = firsttwoSentence.concat(lastTwoWord);
        char[] newSentence = fullSentence.toCharArray();
        System.out.println(newSentence);
    }
}
