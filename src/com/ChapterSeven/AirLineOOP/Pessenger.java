package com.ChapterSeven.AirLineOOP;

import java.time.LocalDate;

public class Pessenger {
    private String firstName;
    private String lastName;
    private LocalDate age;
    private int seatNumber;

    public Pessenger() {
    }

    public Pessenger(String firstName, String lastName, LocalDate age, int seatNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.seatNumber = seatNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getAge() {
        return age;
    }

    public void setAge(LocalDate age) {
        this.age = age;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public String toString() {
        return "Pessenger{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", seatNumber='" + seatNumber + '\'' +
                '}';
    }
}
