package twentyOne;

public class QueueComposition<T> {
    private List<T> queueList;

    public QueueComposition() {
        queueList = new List<>("queue");
    }

    public void enqueue(T object) {
        queueList.insertAtBack(object);
    }

    public T removeQueue() throws EmptyListException {

        return queueList.removeFromFront();
    }

    public boolean isEmpty() {
        return queueList.isEmpty();
    }

    public void print() throws EmptyListException {
        queueList.print();
    }

}
