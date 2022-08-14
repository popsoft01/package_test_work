package algorithmTask;

public class StringToken {
    public static void stringSplit(String input) {
        String symbol = "[!,?._'@\\s]+";
        if (input.trim().length() == 0 || input.trim().length() > 400000) {
            System.out.println(0);
        } else {
            String[] newString = input.trim().split(symbol);
            System.out.println(newString.length);
            for (String word : newString) {
                System.out.println(word);
            }
        }
    }


    public static void main(String[] args) {
        stringSplit(" He is a very very good boy, isn't he?");
    }
}
