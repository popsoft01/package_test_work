package twentyOne;

public class List<T> {
    private ListNode<T> firstNode;
    private ListNode<T> lastNode;
    private String name;

    public List() {
        this("list");

    }

    public List(String listName) {
       name = listName;
        firstNode = lastNode = null;
    }
    public void insertAtFront(T insertItem){
        if (isEmpty()){
            firstNode=lastNode= new ListNode<>(insertItem);
        } else{
            firstNode = new ListNode<>(insertItem, firstNode);
            }
            
        }
    public void insertAtBack(T insertItem){
        if (isEmpty()){
            firstNode = lastNode = new ListNode<>(insertItem);
        }else {
            lastNode = lastNode.nextNode = new ListNode<>(insertItem);
        }
    }
    public T removeFromFront() throws EmptyListException{
        if (isEmpty()){
            throw new EmptyListException(name);
        }
        T removeItem = firstNode.getData();
        if (firstNode == lastNode){
            firstNode = lastNode = null;
        }else{
           firstNode= firstNode.nextNode;
        }

        return removeItem;
    }
    public T removeFromBack() throws EmptyListException{
        if (isEmpty()){
            throw new EmptyListException(name);
        }
        T removeItem = firstNode.getData();
        if (firstNode == lastNode){
            firstNode = lastNode = null;
        }else{
           ListNode<T> current = firstNode;
           while (current.getNextNode() != lastNode){
               current.nextNode = null;
           }
           lastNode = current;
           current.nextNode = null;
        }

        return removeItem;
    }


    boolean isEmpty() {
        return firstNode == null;
    }
    public void print() throws EmptyListException {
        if (isEmpty()){
            System.out.printf("Empty %s%n", name);
            return;
        }
        System.out.printf("This %s is: ", name);
        ListNode<T> current = firstNode;

        while(current != null){
            System.out.printf("%s ", current.getData());
            current = current.nextNode;
        }
        System.out.println();
    }

}
