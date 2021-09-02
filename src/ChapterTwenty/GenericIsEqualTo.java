package ChapterTwenty;

public class GenericIsEqualTo <T>{
    public static <T extends Comparable<T>> boolean isEqualTo(T firstArgurment, T secondArgurment){

        return firstArgurment.equals(secondArgurment);
    }

}
