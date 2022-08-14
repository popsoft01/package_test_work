package ChapterTwenty;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort<T> {
    public static <T extends Comparable<T>> T[] sort(T[] array) {

        for (int j = 0; j < array.length; j++) {


            for (int i = 0; i < array.length; i++) {

                if (array[j].compareTo(array[i]) < 0) {
                    T temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;


                }

            }
        }
        return array;
    }


    public static void main(String[] args) {
        Integer[] array = {4, 10, 20, 5, 7};
        String[] nem = {"boy", "girl", "dog", "love", "he"};
        String[] newNew = sort(nem);
        Integer[] newArray = sort(array);
        System.out.println(Arrays.toString(newArray));
        System.out.println(Arrays.toString(newNew));
    }
}

