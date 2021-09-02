package twentyOne;

public class QueueTest {
    public static void main(String[] args) throws EmptyListException {
        QueueComposition<Integer> queue = new QueueComposition<>();

            queue.enqueue(-1);
            queue.print();
            queue.enqueue(0);
            queue.print();
            queue.enqueue(1);
            queue.print();
            queue.enqueue(5);
            queue.print();
        try{
            int removedItem;
            while (true)
            {
                removedItem = queue.removeQueue(); // use dequeue method
                System.out.printf("%n%d dequeued%n", removedItem);
                queue.print();
            }

        }catch (EmptyListException e){
            e.printStackTrace();
        }
    }
}
