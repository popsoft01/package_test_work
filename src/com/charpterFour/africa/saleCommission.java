package com.charpterFour.africa;

public class saleCommission {
    private static double percentage;
    private double total_price;

    public double calculatePercentage(int percentangeCommission, int sale_price) {
        this.total_price = sale_price;
        return percentage = sale_price / (percentangeCommission * 1.0);
    }

    public double commissionCalculator(int salary) {
        return salary * percentage;
    }

    public double calculateRealRevenue(int sale_price) {
//        this.percentage = percentage;
        return sale_price - (sale_price * percentage);
    }

    public double CalculatePriceWithCommission(int base_price) {
        return base_price + (base_price * percentage);
    }

    public double sumOfProductprice(double price, double numberOfProductSale) {

        double total_price = 0;
        while (price <= numberOfProductSale) {
            total_price += price;
            numberOfProductSale++;
        }
        return total_price;

    }
}
