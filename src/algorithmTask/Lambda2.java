package algorithmTask;

@FunctionalInterface
interface MyFunctionalInterface2 {

    //A method with single parameter
    int incrementByFive(int a);
}

public class Lambda2 {


    public static void main(String args[]) {
        // lambda expression with single parameter num
        MyFunctionalInterface2 f = (num) -> num + 5;
        System.out.println(f.incrementByFive(22));
    }

}
