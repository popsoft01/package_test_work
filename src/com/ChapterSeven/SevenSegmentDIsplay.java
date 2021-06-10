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
        for (int i = 0; i<string.length(); i++){
            if (string.charAt(i) == '1'){
                switch (i){
                    case 0:
                        writeOnA();
                        break;
                    case 1:
                        writeOnB();
                        break;
                    case 2:
                        writeOnC();
                        break;
                    case 3:
                        writeOnD();
                        break;
                    case 4:
                        writeOnE();
                        break;
                    case 5:
                        writeOnF();
                        break;
                    case 6:
                        writeOnG();
                        break;
                }


            }

        }
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
        collect("11111111");
//        writeOnF();
        sevenDislay();

    }
}
