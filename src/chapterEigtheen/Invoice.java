package chapterEigtheen;

import java.util.Comparator;

public class Invoice {
    private int partNumber;
    private String partDescription;
    private int quantity;
    private double price;

    public Invoice() {
        partNumber = 0;
        partDescription ="";
        quantity = 0;
        price = 0.00;
    }

    public Invoice(int partNumber, String partDescription, int quantity, double price) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.price = price;
    }

    public void setPartNumber(int partNumber) {
        this.partNumber = partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public void setquantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getInvoiceValue(){
        return quantity * Math.round(price * 100.0) / 100.0;
    }

    public static void printHeader(){

        System.out.println(String.format("%-12s %-30s %-10s %-10s","Part Number","Part Description","Quantity","Price"));
    }


    public String toString() {

        return String.format("%-12s %-30s %-10s %-10s",getPartNumber(),getPartDescription(),getQuantity(),getPrice() );
    }


}
