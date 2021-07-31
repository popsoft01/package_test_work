package ChapterTwenty;

public class GenericMain {

    public static void main(String[] args) throws EmptyStackException {
        GenericMain gen = new GenericMain();
        double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
        int[] integerElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Stack stack = new Stack();
        Stack stack1 = new Stack<>(5);


        gen.pushDouble(stack,doubleElements);
        double toPop = gen.popDouble(stack);
        int num = stack.getSize();
        System.out.println(toPop + " "+ num);

        gen.pushInt(stack1,integerElements);
        int topTo = gen.popInt(stack1);
        int num2 = stack1.getSize();
        System.out.println(topTo + " "+ num2);

    }

    public void pushDouble(Stack<Double> stacks,double[] array){
        for (double element: array){
            stacks.push(element);
        }
    }

    public Double popDouble(Stack<Double> stack) throws EmptyStackException {
        return stack.pop();
    }

    public void pushInt(Stack<Object> stacks, int[] array){
        for (int element: array){
            stacks.push(element);
        }
    }

    public int popInt(Stack<Integer> stack) throws EmptyStackException {
        return stack.pop();
    }

//    public int getStackSize(Stack<Double> stack){
//        return stack.getSize();
//    }
//    public int getStackSize(Stack<Integer> stack){
//        return stack.getSize();
//    }

}
