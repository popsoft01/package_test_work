package algorithmTask;

@FunctionalInterface
interface MyFunctionalInterface {
    String sayHello();
}

public class Lambda {
    public static void main(String args[]) {
        // lambda expression
        MyFunctionalInterface msg = () -> "Hello";
        System.out.println(msg.sayHello());
    }
}


