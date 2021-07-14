package com;

import java.security.SecureRandom;
import java.util.Scanner;

public class Sentence {
    private static SecureRandom rand;
    public static String generateFirstArticle(String[] article){
        rand = new SecureRandom();
        return article[rand.nextInt(article.length)];
    }
    public static String generateNoun(String[] noun){
        rand = new SecureRandom();
        return noun[rand.nextInt(noun.length)];
    }
}
