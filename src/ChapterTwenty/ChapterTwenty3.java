package ChapterTwenty;

public class ChapterTwenty3<T> {
    public static void main(String[] args) {
        Integer[] integerArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};
        printArray(integerArray, 2, 5);
        printArray(doubleArray, 1, 4);
        printArray(characterArray, 3, 5);
    }

    private static <T> void printArray(T[] array, int start, int stop) {
        if (start < 0 || stop > array.length) {
            throw new IllegalArgumentException("number out of range");
        } else {
            for (int i = start; i < array.length; i++) {
                System.out.print(array[i] + " ");
                System.out.print("");
            }
        }

    }
}
