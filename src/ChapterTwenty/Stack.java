package ChapterTwenty;

import java.util.ArrayList;

public class Stack<T> {
    private final ArrayList<T> element;

    public Stack(){
        this(10);
    }

    public Stack(int newElement) {
        int newCapacity = newElement > 0 ? newElement :10;
        element = new ArrayList<>(newCapacity);
    }
    public static void push(T item){
        element.add(item);
    }
    public T pop() throws EmptyStackException {
        if (element.isEmpty()) // if stack is empty
            throw new EmptyStackException("Stack is empty, cannot pop");
// remove and return top element of Stack
        return element.remove(element.size() - 1);
    }
}
