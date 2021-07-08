package com.ChapterTen.payable;

public class Invoice implements Payable {
    private final String partNumber;
    private final String productDescription;
    private double pricePerItem;
    private int quantity;


    public Invoice(String partNumber, String productDescription, int quantity, double pricePerItem) {
        if (quantity > 0){
            this.quantity =quantity;
        }else {throw new IllegalArgumentException("Quantity cannot be less than 0");}
        if (pricePerItem > 0.0){
            this.pricePerItem = pricePerItem;
        }else {
            throw new IllegalThreadStateException("Price cannot be less than 0");
        }
        this.partNumber = partNumber;
        this.productDescription = productDescription;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0){
            this.quantity = quantity;
        }
    }

    public int getQuantity() {
        return quantity;
    }
    public String getPartNumber() {
        return partNumber;
    }

    public String getProductDescription() {
        return productDescription;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "partNumber='" + partNumber + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", pricePerItem=" + pricePerItem +
                ", quantity=" + quantity +
                '}';
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem > 0.0){
            this.pricePerItem = pricePerItem;}else {
            throw new IllegalArgumentException("Price cannot be less than 0");
        }
    }

    @Override
    public double getPaymentAmount() {
        return getPricePerItem() * getQuantity();
    }
}
