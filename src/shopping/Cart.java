package shopping;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cart {
    private static BigInteger totalPrice = BigInteger.ZERO;
    private static final List<Item> itemNumber = new ArrayList<>();
    private static Item item;

    public Cart(BigInteger totalPrice, Item item) {
        Cart.totalPrice = totalPrice;
//        Cart.itemNumber = itemNumber;
        Cart.item = item;
    }

    public static void addItem(Item item) {
        itemNumber.add(item);
        System.out.println(item.getPrice());
    }

    public static void removeItem(Item item) {
        itemNumber.remove(item);
    }

    public static void clearItem() {
        itemNumber.clear();
    }

    public static int getTotalItem() {
        return itemNumber.size();
    }

    public static BigInteger getTotalPrice() {
        if (itemNumber.size() == 1) {
            totalPrice = itemNumber.get(0).getPrice();
        } else if (itemNumber.size() > 1) {
            for (Item value : itemNumber) {
                totalPrice = totalPrice.add(value.getPrice());

            }

        }
        return totalPrice;
    }

    public static void printItem() {
        System.out.println(Arrays.toString(itemNumber.toArray()));
    }
}
