package com.ChapterTen.payable;

import com.ChapterEight.Date;

public class PayableMain {
    public static void main(String[] args) {
        Date birthday1 = new Date(4,6,1994);
        Date birthday2 = new Date(2,21,1995);

        Payable[] payablesObjects = new Payable[4];
        payablesObjects[0] = new Invoice("12345","table",3,100);
        payablesObjects[1] = new Invoice("54321","box",3,100.0);
        payablesObjects[2] = new SalaryEmployee("John", "Smith", "111-11-1111", birthday1,800.00);
        payablesObjects[3] = new SalaryEmployee("Lisa", "Barnes", "888-88-8888", birthday2,1200.00);

        System.out.println("Invoice and Employees processed polymorphically");
        for (Payable currentPayable: payablesObjects){
            System.out.printf("%n%s %n%s: $%,.2f%n", currentPayable.toString() , "payment due", currentPayable.getPaymentAmount() );
        }

        }

}
