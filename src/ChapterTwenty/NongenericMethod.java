package ChapterTwenty;

public class NongenericMethod {
    public static void main(String[] args) {
        Integer[] integerArray = {1, 2, 3, 4, 5, 6, 7};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};
        printArray(integerArray, 2, 5);
        printArray(doubleArray, 1, 4);
        printArray(characterArray, 3, 5);
    }

    public static <T> void printArray(T[] array, int starti, int stop) {
        if (starti < 0 || stop > array.length) {
            throw new IllegalArgumentException("number out of range");
        } else {
            for (int i = starti; i < array.length; i++) {
                if (i == 3) {
                    System.out.println("\n");
                } else {
                    System.out.print(array[i] + " ");
                    System.out.print("");
                }
            }
        }

    }

    public static void printArray(String[] array, int starti, int stop) {
        if (starti < 0 || stop > array.length) {
            throw new IllegalArgumentException("number out of range");
        } else {
            for (int i = starti; i < array.length; i++) {
                System.out.print(array[i] + " ");
                System.out.print("");
            }
        }
    }

//    public  static <T> void printArray(T[] array,){
//
//    }
}
