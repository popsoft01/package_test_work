package com.chapterSixteen;

import java.util.HashMap;
import java.util.Map;

public class CountingLetters {
    public static void countChar(String input){
        Map<Character, Integer> lettersKey = new HashMap<>();
//        String[] newString = input.split("");
        for (int i =0; i < input.length();i++){
            if (lettersKey.containsKey(input.charAt(i))){
                lettersKey.put(input.charAt(i),lettersKey.get(input.charAt(i))+1);
            }else {
                lettersKey.put(input.charAt(i),1);
            }

                System.out.printf("%-10s%10s%n", lettersKey.keySet(), lettersKey.values());
                System.out.printf("%nsize: %d%nisEmpty: %b%n", lettersKey.size() , lettersKey.isEmpty());
            }
        }

    public static void main(String[] args) {
        countChar("Hello word");
    }

    }

