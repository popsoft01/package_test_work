package com.chapterFourteen;

import java.util.HashMap;
import java.util.Map;

public class TextAnalysis {

    private static Map<Character,Integer> storage = new HashMap<>();

    public static void getChar(String text){
//        int counter = 0;
        System.out.printf("%s%10s","char","count");
        for (int i = 0; i < text.length();i++){
           if (storage.containsKey(text.toLowerCase().charAt(i))){
               storage.put(text.charAt(i),storage.get(text.charAt(i))+1);
           }else {
               storage.put(text.toLowerCase().charAt(i),1);
           }

        }
        System.out.printf("%s%n%10s%n",storage.keySet() ,storage.values());
//


    }
//    public static  void characterOccurrence(String text){
//        int counter = 0;
//        String[] splitText = text.split("");
//        for (int i =0; i<splitText.length;i++){
//                if (splitText[i].toLowerCase().equals(splitText[i].toLowerCase()))
//                    counter++;
//            System.out.printf("%s%7S%n", character, counter);
//                }

//            }




    public static void main(String[] args) {
        getChar("To be, or not to be:");
//        characterOccurrence("To be, or not to be:");
    }


}
