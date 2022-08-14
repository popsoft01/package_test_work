package algorithmTask;

public class BinarySearch {
    public static int search(int[] array, int number) {
        int begin = 0;
        int end = array.length - 1;
        int middle = (begin + end + 1) / 2;
        int location = -1;

        do {
            for (int i = 0; i < middle; i++) {
                System.out.print(" ");

                if (number == middle) {
                    location = middle;
                } else if (number < array[middle]) {
                    end = middle - 1;
                } else {
                    end = middle + 1;
                }
            }
            middle = (begin + end + 1) / 2;
        }


        while ((begin <= end) && (location == -1));
        return location;
    }
}
