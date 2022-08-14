package com.chapterSixteen;

public class RepeatWord {

    public static void main(String[] args) {
        String sen = "hi hello hi good morning hello";
        count(sen);

    }

    private static void count(String sen) {
        String[] word = sen.split(" ");
        int count = 0;
        for (int i = 0; i < word.length; i++) {
            for (int j = i + 1; j < word.length; j++) {
                if (word[i].equals(word[j])) {
                    count++;
                }
                if (count > 1)
                    System.out.println("the word " + word[i] + " occured " + count + " time");
            }

        }
    }


}
