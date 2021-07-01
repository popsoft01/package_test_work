package com.ChapterEight;

public class Date {
        private int month; // 1-12
        private int day; // 1-31 based on month
        private int year; // any year
        private static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        public Date(int month, int day, int year)
        {
            if (month <= 0 || month > 12){
                throw new IllegalArgumentException("month (" + month + ") must be 1-12");}
            else this.month = month;

            if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29))){
                throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");}
            else this.day =day;

            if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))){
                throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");}
            else this.year = year;

            System.out.printf("Date object constructor for date %s%n", this);
        }
    public String toString()
    {
        return String.format("%d/%d/%d", month, day, year);
}
}
