package algorithmTask;
interface Hello {
    String sayHello(String greet);
public class LambdaAlgorithm {


    public static void main(String[] args) {
        Hello hello = (message) -> {
            String str1 = "Welcome ";
            return str1 + message;
        };
        System.out.println(hello.sayHello("Lambda Tutorial"));
    }

}
}


