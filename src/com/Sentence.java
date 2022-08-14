package com;

import java.security.SecureRandom;
import java.util.Scanner;

public class Sentence {
    private static SecureRandom rand;

    public static String generateFirstArticle(String[] article) {
        rand = new SecureRandom();
        return article[rand.nextInt(article.length)];
    }

    public static String generateNoun(String[] noun) {
        rand = new SecureRandom();
        return noun[rand.nextInt(noun.length)];
    }

    public static String generateVerb(String[] verb) {
        rand = new SecureRandom();
        return verb[rand.nextInt(verb.length)];
    }

    public static String generatePreposition(String[] preposition) {
        rand = new SecureRandom();
        return preposition[rand.nextInt(preposition.length)];
    }
}
