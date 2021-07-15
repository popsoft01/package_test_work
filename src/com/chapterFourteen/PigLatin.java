package com.chapterFourteen;

import java.util.Arrays;

public class PigLatin {

    public String[] sentenceToken(String sentence) {
       String[] word = sentence.split(" ");
        System.out.println(Arrays.toString(word));

        return word;
    }

    private char[] stringToChar(String[] word) {
        char[] letter = new char[word.length];
        for (String s : word) {
            letter = s.toCharArray();
            moveChatToLast(letter);
//            swap(letter,0,letter.length-1);
//            System.out.println(Arrays.toString(letter));
        }
        return letter;
    }

    public void moveChatToLast(char[] word){
        StringBuilder newString = new StringBuilder(" ");
//        char indexChar = word[0];
        for (int i = 1; i< word.length; i++){
//            System.out.print(word[i] + " ");
            newString.append(word[i]);
            newString.append(word[0]);

        }
        System.out.print(newString + "ay" + " ");

//        swap(newChar, 0, word.length-1);
//        int i = word.length - 1;
//        while(i > 1) {
//            swap(newChar, i, i-1);
//            i--;
//        }
        }
//    private void swap(char[] arr, int indexToSwap, int expectedIndex) {
//        char character = arr[indexToSwap];
//        arr[indexToSwap] = arr[expectedIndex];
//        arr[expectedIndex] = character;
//    }

    public static void main(String[] args) {
        PigLatin pigLatin = new PigLatin();
        String[] start = pigLatin.sentenceToken("AM Indexing completed in 28 sec. Shared indexes were applied to 36% of files");
        char[] newd = pigLatin.stringToChar(start);
        System.out.println(newd);
    }
}
