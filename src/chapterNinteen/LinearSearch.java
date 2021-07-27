package chapterNinteen;

public class LinearSearch {
    public static int linearSearch(int[] data, int searchIndex){
        for (int index = 0; index < data.length; index++){
            if (data[index] == searchIndex)
                return index;

        }
        return -1;
    }
}
