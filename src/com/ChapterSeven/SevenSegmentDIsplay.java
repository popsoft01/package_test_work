package com.ChapterSeven;

public class SevenSegmentDIsplay {
  static int[][] sevenSegment = new int[5][4];
//          {{1,1,1,1},{1,0,0,1},{1,1,1,1},{1,0,0,1},{1,1,1,1}};

    public static void writeOnA(){
        for(int i = 0; i< sevenSegment.length; i++){
            for (int j = 0; j<sevenSegment[1].length; j++){
                sevenSegment[0][j] = 1;
            }

        }
    }
    public static void  writeOnB(){
        for (int i = 0; i<sevenSegment.length-2; i++){
            for (int j = 0; j<sevenSegment[1].length; j++){
                sevenSegment[i][3] =1;
            }
        }
    }
    public static void writeOnC(){
        for(int i = 2; i< sevenSegment.length; i++){
            for (int j = 0; j<sevenSegment[2].length; j++){
                sevenSegment[i][3] = 1;
            }
        }
    }
    public static void writeOnD(){
        for(int i = 0; i< sevenSegment.length-3; i++){
            for (int j = 0; j<sevenSegment[3].length; j++){
                sevenSegment[4][j] = 1;
            }
        }
    }
    public static void writeOnE(){
        for(int i = 2; i< sevenSegment.length; i++){
            for (int j = 0; j<sevenSegment.length; j++){
                sevenSegment[i][0] = 1;
            }
        }
    }
    public static void writeOnF(){
        for(int i = 0; i< sevenSegment.length-2; i++){
            for (int j = 0; j<sevenSegment.length; j++){
                sevenSegment[i][0] = 1;
            }
        }
    }
    public static void writeOnG(){
        for(int i = 2; i< sevenSegment.length; i++){
            for (int j = 0; j<sevenSegment.length-1; j++){
                sevenSegment[2][j] = 1;
            }

        }
    }
    public static void collect(String string){
        string = validation(string);
        for (int i = 0; i<string.length(); i++){
            if (string.charAt(i) == '1'){
                if (string.charAt(i) > '1'){
                    throw  new IllegalArgumentException("valae can be either zero and one");
                }else {
                    switch (i) {
                        case 0 -> writeOnA();
                        case 1 -> writeOnB();
                        case 2 -> writeOnC();
                        case 3 -> writeOnD();
                        case 4 -> writeOnE();
                        case 5 -> writeOnF();
                        case 6 -> writeOnG();
                    }


                }
            }

        }
    }

    private static String validation(String string) {
//        String newString =" ";
        if (string.length() > 8){
            throw new IllegalArgumentException("String must be eighth or less");
        }
//        while (string.length() < 8){
//
//        }
        StringBuilder stringBuilder = new StringBuilder(string);
        for (int i = 0; i < 8; i++){
            if (stringBuilder.length() < 8){
              stringBuilder.insert(0, '0');
            }

        }
        string = stringBuilder.toString();
        System.out.println(string);
        return string;
    }

    public static void sevenDislay(){
        for (int i = 0; i<sevenSegment.length; i++){
            for (int j = 0; j <sevenSegment[i].length; j++){
                if (sevenSegment[i][j] == 1){
//                    sevenSegment[i][j] = "#";
                    System.out.print("#" + " ");
                } else if(sevenSegment[i][j] == 0)
//                    sevenSegment[i][j] = " ";
                    System.out.print(" " + " ");
//                System.out.print(sevenSegment[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        writeOnA();
//        writeOnB();
//        writeOnC();
//        writeOnD();
//        writeOnE();
//        writeOnF();
//        writeOnG();
        collect("11");
//        writeOnF();
        sevenDislay();

    }
}
