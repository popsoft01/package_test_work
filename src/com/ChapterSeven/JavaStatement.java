package com.ChapterSeven;

public class JavaStatement {

    public int createArray(int[] arrayCount) {
        arrayCount = new int[10];
        int i =0;
        for ( ;i <arrayCount.length -1; i++){
            arrayCount[i] = 0;
        }
        return arrayCount[i];
//        return Arrays.toString(arrayCount);
    }

    public int canCreateNewArray(int arrayBonuss) {
        int[] arrayBonus =new int[15];
        int i = 0;
        for (;i<arrayBonus.length - 1; i++){
            ++arrayBonus[i];
        }
        return arrayBonus[i];
//        return (Arrays.toString(arrayBonus));
    }
}
