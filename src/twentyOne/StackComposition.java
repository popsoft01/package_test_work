package twentyOne;

public class StackComposition<T> {
    private List<T> stackLst;

    public StackComposition() {
        stackLst = new List<>("stack");
    }

    public void push(T object) {
        stackLst.insertAtFront(object);
    }

    public T pop() throws EmptyListException {
        return stackLst.removeFromFront();
    }

    public boolean isEmpty() {
        return stackLst.isEmpty();
    }

    public void print() {
        try {
            stackLst.print();
        } catch (EmptyListException e) {
            e.printStackTrace();
        }
    }
}
