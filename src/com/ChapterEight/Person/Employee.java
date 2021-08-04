package com.ChapterEight.Person;

import java.math.BigDecimal;
import java.util.Date;

public class Employee extends Person{
    private String officeName;
    private BigDecimal salary;
    private Date date;

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
