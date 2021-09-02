package ChapterTwenty;

public class GenericIsEqualTo <T>{
    public static <T extends Comparable<T>> boolean isEqualTo(T firstArgurment, T secondArgurment){

        return firstArgurment.equals(secondArgurment);
    }

    public static void main(String[] args) {
        System.out.println(isEqualTo("Olu","Bolu"));
    }

}
