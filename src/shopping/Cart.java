package shopping;



import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    private static BigInteger totalPrice;
    private static List<Item> itemNumber = new ArrayList<>();
    private static Item item;

    public Cart(BigInteger totalPrice, List<Item> itemNumber, Item item) {
        Cart.totalPrice = totalPrice;
        Cart.itemNumber = itemNumber;
        Cart.item = item;
    }

    public static void addItem(Item item){
        itemNumber.add(item);
    }
    public static void removeItem(Item item){
        itemNumber.remove(item);
    }

    public static void clearItem(){
        itemNumber.clear();
    }

    public static int getTotalItem(){
      return itemNumber.size();
    }

    public static BigInteger getTotalPrice() {
       if (itemNumber.size() == 1){
           totalPrice = item.getPrice();
       }
       else if (itemNumber.size() > 1){
           for (int i = 0; i< itemNumber.size(); i++){
             totalPrice = totalPrice.add(item.getPrice()) ;
           }

       }
       return totalPrice;
    }
}
