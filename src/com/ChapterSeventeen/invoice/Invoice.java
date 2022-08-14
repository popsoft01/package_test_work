package com.ChapterSeventeen.invoice;

public class Invoice {
    private int partNumber;
    private String partDescription;
    private int quantityPurchase;
    private double pricePerItem;

    public Invoice() {
    }

    public Invoice(int partNumber) {
        setPartNumber(partNumber);
        ;
    }

    public Invoice(int partNumber, double pricePerItem) {
        this(partNumber);
        setPricePerItem(pricePerItem);
    }

    public Invoice(int partNumber, int quantityPurchase, double pricePerItem) {
        this(partNumber, quantityPurchase);
        setPricePerItem(pricePerItem);

//        this.pricePerItem = pricePerItem;
    }


    public Invoice(int partNumber, int quantityPurchase, double pricePerItem, String partDescription) {
        this(partNumber, quantityPurchase, pricePerItem);
        setPartDescription(partDescription);
    }

    public int getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(int partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantityPurchase() {
        return quantityPurchase;
    }

    public void setQuantityPurchase(int quantityPurchase) {
        this.quantityPurchase = quantityPurchase;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "partNumber=" + partNumber +
                ", partDescription='" + partDescription + '\'' +
                ", quantityPurchase=" + quantityPurchase +
                ", pricePerItem=" + pricePerItem +
                '}';
    }
}
