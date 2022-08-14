package shopping;

import java.math.BigInteger;

public class Item {
    //    private static BigInteger price;
    private String id;
    private BigInteger price;
    private String description;

    public Item() {
    }

    public Item(String id, BigInteger price, String description) {
        this.id = id;
        this.price = price;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
