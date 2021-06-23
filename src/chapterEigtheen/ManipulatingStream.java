package chapterEigtheen;

import java.util.List;
import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.Comparator;

public class ManipulatingStream {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        List<Invoice> invoices = new ArrayList<>();

        invoices.add(new Invoice(83, "Electric sander", 7,57.98));
        invoices.add(new Invoice(24, "Power Saw", 18,99.99));
        invoices.add(new Invoice(7, "Sledge Hammer", 11, 21.50));
        invoices.add(new Invoice(77, "Hammer  ", 76, 11.99));
        invoices.add(new Invoice(39, "Lawn mower", 3, 79.50));
        invoices.add(new Invoice(68, "Screwdriver", 106, 6.99));
        invoices.add(new Invoice(56, "Jig Saw  ", 21, 11.00));
        invoices.add(new Invoice(3, "Wrench  ", 34, 7.50));

        //Print original invoice
        System.out.println("Original Invoices:");
        Invoice.printHeader();
        invoices
                .forEach(System.out::println);

        //Comparator to sort the invoice by part description

        Comparator<Invoice> descriptionComparator = Comparator.comparing(Invoice::getPartDescription);

        // sort the Invoice objects by PartDescription , then display the results
        System.out.println("\nAfter Sorting by description:");
        Invoice.printHeader();
        invoices
                .stream()
                .sorted(descriptionComparator)
                .forEach(System.out::println);

        //compares by price
        Comparator<Invoice> priceComparator = Comparator.comparing(Invoice::getPrice);

        System.out.println("\nAfter Sorting by price:");
        Invoice.printHeader();
        invoices
                .stream()
                .sorted(priceComparator)
                .forEach(System.out::println);

        //Comparator that compares by quantity
        Comparator<Invoice> quantityComparator = Comparator.comparing(Invoice::getQuantity);

        //Map each Invoice to its PartDescription and Quantity and then sorts the
        //results by Quantity then display the results
        System.out.println("\nMapping invoice to part Description and quantity then sorting results by quantity: \n" +
                String.format("%-30s %-8s","Part Description","Quantity"));
        invoices
                .stream()
                .sorted(quantityComparator)
                .map(invoice ->String.format("%-30s %-8s", invoice.getPartDescription() , invoice.getQuantity()))
                .forEach(System.out::println);

        //comparator that compares values
        Comparator<Invoice> totalValueComparator = Comparator.comparing(Invoice::getInvoiceValue);

        // map each Invoice to its PartDescription and the value of the
        //Invoice ( Quantity * Price ). Order the results by Invoice value.
        System.out.println("\nMapping each invoice to part description and value, the sorting by total value: \n" +
                String.format("%-30s %-8s","Part Description","Invoice Value"));
        invoices
                .stream()
                .sorted(totalValueComparator)
                .map(invoice ->String.format("%-30s %-8s", invoice.getPartDescription() , invoice.getInvoiceValue()))
//                .map(invoice ->String.format("%-8d",invoice.getQuantity()*invoice.getPrice()))
                .forEach(System.out::println);

        //Predicate to set range of values
        Predicate<Invoice> range = invoice -> (invoice.getInvoiceValue() >= 200 && invoice.getInvoiceValue() <= 500);

        //Printing invoices whose total value is between $200 and $500
        System.out.println("\nSelecting only invoices between $200 to $500 ordered by invoice value: \n" +
                String.format("%-30s %-8s","Part Description","Invoice Value"));
        invoices
                .stream()
                .filter(range)
                .sorted(totalValueComparator)
                .map(invoice ->String.format("%-30s %-8s", invoice.getPartDescription() , invoice.getInvoiceValue()))
                .forEach(System.out::println);

    }

}
