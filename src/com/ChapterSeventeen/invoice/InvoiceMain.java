package com.ChapterSeventeen.invoice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class InvoiceMain {
    public static void main(String[] args) {

        Invoice[] invoice = {new Invoice(83,  7, 57.98,"Electric sander"),
                new Invoice(24 , 18, 99.99,"Power saw"),
                new Invoice(7, 11, 21.50,"Sledge hammer"),
                new Invoice(77, 76, 11.99,"Hammer" ),
                new Invoice(39, 3, 79.50,"Lawn mower" )};

        List<Invoice> list = new ArrayList<>(Arrays.asList(invoice));
        System.out.println("all invoice");
        list.stream()
                .forEach(System.out::println);

        System.out.println();
        Function<Invoice,String> sortBypartDecription = Invoice::getPartDescription;
        System.out.println("printing invoice and sort by part Description");
        Comparator<Invoice> byPartDescriptionFirst = Comparator.comparing(sortBypartDecription);
         list.stream()
         .sorted(byPartDescriptionFirst)
         .forEach(System.out::println);

        System.out.println();
        Function<Invoice,Double>  sortByPrice = Invoice::getPricePerItem;
        Comparator<Invoice> sortBypriceLast = Comparator.comparing(sortByPrice);
        System.out.println("printing invoice sorted");
        list.stream()
                .sorted(sortBypriceLast)
                .forEach(System.out::println);




    }
}
