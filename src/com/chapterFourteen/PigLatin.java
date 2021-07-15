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
        for (int i = 0; i < word.length; i++){
            letter = word[i].toCharArray();
            System.out.println(Arrays.toString(letter));
        }
        return letter;
    }

    public String moveChatToLast(String[] word){
        char[] newChar = stringToChar(word);
        swap(newChar, 0, word.length-1);
        int i = word.length - 1;
        while(i > 1) {
            swap(newChar, i, i-1);
            i--;
        }
        return new String(newChar);
        }
    private void swap(char[] arr, int x, int y) {
        char  c = arr[x];
        arr[x] = arr[y];
        arr[y] = c;
    }

    public static void main(String[] args) {
        PigLatin pigLatin = new PigLatin();
        String[] start = pigLatin.sentenceToken("Olu is a Boy");
        String newd = pigLatin.moveChatToLast(start);
        System.out.println(newd);
    }
}
