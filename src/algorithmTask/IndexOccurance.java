package algorithmTask;

import java.util.Arrays;

public class IndexOccurance {
    public static void startAndEndElementOccurence(int[] array, int value) {
        int[] output = new int[2];
        int firstNumber = -1;
        int lastNumber = -1;
        for (int counter = 0; counter < array.length; counter++) {
            if (array[counter] == value && firstNumber == -1) {
                firstNumber = counter;
            }
            if (array[counter] == value && firstNumber != -1) {
                lastNumber = counter;
            }
        }
        output[0] = firstNumber;
        output[1] = lastNumber;
        System.out.println(Arrays.toString(output));
        System.out.println("first Index " + firstNumber);
        System.out.println("last Number " + lastNumber);
    }

    public static void startAndEndElementOccurenceWithTwoLoop(int[] array, int value) {
        int firstNumber = -1;
        int lastNumber = -1;
        for (int counter = 0; counter < array.length; counter++) {
            for (int fromBack = array.length; fromBack > 0; fromBack--) {
                if (array[counter] == value && array[fromBack - 1] == value) {
                    firstNumber = counter;
                    lastNumber = fromBack;
                }
            }
        }
        System.out.println("first Index " + firstNumber);
        System.out.print("last Number " + lastNumber);
    }

    public static void intersect(String[] array) {
//        for (int i = 0; i < array.length; i++){
//
//        }
        String[] firstIndex = array[0].split(",");
        String[] secondIndex = array[1].split(",");
        for (String index : firstIndex) {
            for (String s : secondIndex) {
                if (index.equals(s)) {
                    System.out.print(index + " ");
                }
            }
        }

    }

    public static void manipulationArray(int[] array) {
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int product = 1;
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    continue;
                } else {
                    product *= array[i];
                }
            }
            newArray[i] = product;
        }
        System.out.println(Arrays.toString(newArray));
    }

    public static void main(String[] args) {
//        int[] array ={0,0,1,1,1,1,1,1,4,6,7,4};
        int[] number = {2, 4, 6, 8};
        String[] num = {"0,2,3,4,6,11", "0,1,4,9,10,11"};
//        startAndEndElementOccurence(array,8);
//        startAndEndElementOccurenceWithTwoLoop(array,1);
//        intersect(num);
        manipulationArray(number);

    }
}
