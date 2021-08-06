package com.ChapterEight.Person;

public class Faculty extends Employee{
    private String title;
    private String rank;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "title='" + title + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
