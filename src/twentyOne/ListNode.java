package twentyOne;

public class ListNode<T> {
    T data;
    ListNode<T> nextNode;

    public ListNode(T data) {
        this(data, null);
    }

    public ListNode(T object, ListNode<T> nextNode) {
        data = object;
        this.nextNode = nextNode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ListNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(ListNode<T> nextNode) {
        this.nextNode = nextNode;
    }
}
