package com.ChapterEight;

public enum EnumClass {
    LLP("LOve Life People", 2015),
    PPT("People property tech", 2019);


    private String title;
    private int year;

    EnumClass(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }
}
