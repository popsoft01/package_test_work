package twentyOne;

public class GenericMain {
    public static void main(String[] args) throws EmptyListException {
        List<Integer> list = new List<>();

        list.insertAtFront(-2);
        list.print();
        list.insertAtFront(0);
        list.print();
        list.insertAtBack(1);
        list.print();
        list.insertAtBack(5);
        list.print();

        try{
            int removeditem = list.removeFromFront();
            System.out.printf("%n%d removed%n", removeditem);
            list.print();

            removeditem = list.removeFromFront();
            System.out.printf("%n%d removed%n",removeditem);
            list.print();

            removeditem = list.removeFromBack();
            System.out.printf("%n%d removed%n", removeditem);
            list.print();

            removeditem = list.removeFromBack();
            System.out.printf("%n%d removed%n", removeditem);
            list.print();
        } catch (EmptyListException e) {
            e.printStackTrace();
        }

    }
}
