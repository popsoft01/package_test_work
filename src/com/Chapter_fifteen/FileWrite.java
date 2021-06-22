//package com.Chapter_fifteen;
//
//import java.util.Scanner;
//
//public class FileWrite {
//    private String firstName;
//    private String lasttName;
//    private String level;
//    private int year;
//    private static int age;
//
//    public FileWrite(String firstName, String lasttName, String level, int year, int age) {
//        this.firstName = firstName;
//        this.lasttName = lasttName;
//        this.level = level;
//        this.year = year;
//        setAge(age);
//    }
//
//
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLasttName() {
//        return lasttName;
//    }
//
//    public void setLasttName(String lasttName) {
//        this.lasttName = lasttName;
//    }
//
//    public String getLevel() {
//        return level;
//    }
//
//    public void setLevel(String level) {
//        this.level = level;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        int currentYear = 2020;
//        age = currentYear - year;
//        FileWrite.age = age;
//    }
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        while (input.hasNext()){
//            try {
//                FileWrite file = new FileWrite(input.nextLine(),
//                        input.next(),input.nextLine(),input.nextInt(),input.nextInt());
//            }catch ();
//        }
//    }
//}
