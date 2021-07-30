package ChapterTwenty;

public class NewGeneric {
    public static <T> void printArray2(T[] inputArray){
        for (T element:inputArray)
            System.out.print(element + " ");
        System.out.println();

    }

    public static void main(String[] args) {
        Integer[] integerArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};
        printArray2(integerArray);
        printArray2(doubleArray);
        printArray2(characterArray);
    }
}
