package com.chapterFourteen;

import java.io.Serializable;

public class CompareTos {
    public Serializable compareString(String firstString, String secondString){
    int num = firstString.compareTo(secondString);
    int n2 = secondString.compareTo(firstString);
    if (n2 > num){
        return "first string is greater than second string";
    }else

        return num;
    }
}
