package algorithmTask;

public class Stringtoken {
    public static void stringSplit(String input){
        String symbol = "[!,?._'@\\s]+";
        String[] newString = input.split(symbol);
        for(String word : newString){
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        stringSplit("He is a very very good boy, isn't he?");
    }
}
