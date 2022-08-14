package algorithmTask;

import java.util.Arrays;

public class InsertionSortTest {
    public static int[] insertSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int currentNumber = array[i];
            int k;
            for (k = i - 1; k >= 0 && array[k] > currentNumber; k--) {
//            array[i] < currentNumber)
                array[k + 1] = array[k];

            }
            array[k + 1] = currentNumber;
//            System.out.println(currentNumber);
        }
        return array;
    }

    public static int[] bubbleSort(int[] list) {
        for (int k = 1; k < list.length; k++) {
// Perform the kth pass
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i + 1];
                    list[i + 1] = list[i];
                    list[i] = temp;
                }
            }

        }
        return list;
    }

    public static void main(String[] args) {
        int[] list = {1, 9, 4, 6, 5, -4};
        System.out.println(Arrays.toString(bubbleSort(list)));
        System.out.println(Arrays.toString(insertSort(list)));
    }

}

