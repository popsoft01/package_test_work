package shopping;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {
    private List<Item> itemNumber;
    Item bread = new Item("12", BigInteger.valueOf(200), "bread");
    Item soap = new Item("32", BigInteger.valueOf(500), "soap");
    Item sandin = new Item("132", BigInteger.valueOf(350), "breadsa");
    Item butter = new Item("121", BigInteger.valueOf(200), "butter");

    @BeforeEach
    void setup() {
        itemNumber = new ArrayList<>();
//        itemNumber.add(bread);
//        itemNumber.add(sandin);
//        itemNumber.add(soap);
//        itemNumber.add(bread);
//        itemNumber.add(butter);
    }

    @AfterEach
    void tearDown() {
        itemNumber = null;
    }

    @Test
    void addItem() {
        Cart.addItem(bread);
        assertEquals(1, Cart.getTotalItem());
    }

    @Test
    void canAddMoreThanOneItem() {
        Cart.addItem(bread);
        Cart.addItem(sandin);
        Cart.addItem(soap);
        Cart.printItem();
        assertEquals(3, Cart.getTotalItem());
    }

    @Test
    void removeItem() {
        Cart.addItem(bread);
        Cart.addItem(sandin);
        Cart.addItem(soap);
        Cart.removeItem(bread);
        assertEquals(2, Cart.getTotalItem());
    }

    @Test
    void clearItem() {
        Cart.addItem(bread);
        Cart.addItem(sandin);
        Cart.addItem(soap);
        Cart.clearItem();
        assertEquals(0, Cart.getTotalItem());

    }

    @Test
    void getTotalItem() {
        Cart.addItem(bread);
        Cart.addItem(sandin);
        Cart.addItem(soap);
//        itemNumber.stream()
//                .reduce(0,(a,b) ->(a + b));
//        Cart.clearItem();
        assertEquals(3, Cart.getTotalItem());
    }

    @Test
    void getTotalPrice() {
        Cart.addItem(bread);
//        Cart.addItem(sandin);
//        Cart.addItem(soap);
//        Cart.addItem(bread);
////        Cart.clearItem();
//        assertEquals(3,Cart.getTotalItem() );
        System.out.println(itemNumber.size());
//        itemNumber.add(bread);
        System.out.println(Cart.getTotalItem());
        assertEquals(BigInteger.valueOf(200), Cart.getTotalPrice());
    }
}