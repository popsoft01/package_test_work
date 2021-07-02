package com.ChapterTen.Payroll;

import com.ChapterEight.Date;

public class HourlyEmployee extends  Employee {
    private double hours;
    private double wage;

    public HourlyEmployee(String firstName, String lastName, String ssn, Date birthday, double hours, double wages) {
        super(firstName, lastName, ssn, birthday);
        if (hours <= 0.0) {
            throw new IllegalArgumentException("hour can not be less than or equal to zero");
        } else {
            this.hours = hours;
        }
        if (wages <= 0.0) {
            throw new IllegalArgumentException("wage can not be less than or equal to zero");
        } else {
            this.wage = wages;
        }
    }


    public void setHour(double hour) {
        if (hour >= 0.0) {
            this.hours = hour;
        } else throw new IllegalArgumentException("Hour cannot be less than zero");
    }

    public double getHour() {
        return hours;
    }

    public void setWage(double wage) {
        if (hours >= 0.0) {
            this.wage = wage;
        } else throw new IllegalArgumentException("Hour cannot be less than zero");

    }

    public double getWage() {
        return wage;
    }

    @Override
    public double earning(){
        double earning = 0.0;
        if (hours <= 40) {
            earning = wage * hours;
        } else if (hours > 40) {
          earning =  (40 * wage + (hours - 40) * wage * 1.5);
        }
        return earning;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" + "Name is " + getFirstName() + " lastname " + getLastName() + " hour= " + hours + ", wage= " + wage + " earning =" + earning() + " }";
    }
}
