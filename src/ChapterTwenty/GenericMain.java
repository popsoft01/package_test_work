package ChapterTwenty;

public class GenericMain {

    public static void main(String[] args) {

    }
    public void pushDouble(Stack<Double> stacks,double[] array){
        for (double element: array){
            stacks.push(element);
        }
    }
    public Double popDouble(Stack<Double> stack) throws EmptyStackException {
        return stack.pop();
    }
    public void pushInt(Stack<Integer> stacks,int[] array){
        for (int element: array){
            stacks.push(element);
        }
    }
    public int popInt(Stack<Integer> stack) throws EmptyStackException {
        return stack.pop();
    }

}
