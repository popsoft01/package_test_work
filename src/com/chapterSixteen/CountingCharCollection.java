package com.chapterSixteen;

import java.util.HashMap;
import java.util.Map;

public class CountingCharCollection {
   public static void count( String input, char search){

       Map<Character,Integer> hash = new HashMap<Character,Integer>();

       for(int i=0;i<input.length();i++)
       {
           if(hash.containsKey(input.charAt(i)))
               hash.put(input.charAt(i), hash.get(input.charAt(i))+1);

           else
               hash.put(input.charAt(i), 1);
       }

       int result = hash.get(search);

       System.out.println("The Character '"+search+"' appears "+result+" times.");
   }

    public static void main(String[] args) {
       count("aaaabbAAAAcccddd",'a');
//        String input = "aaaabbAAAAcccddd";
//        char search = 'a';
    }
}

