package com.ChapterEight;

public class Course {
    private String courseName;
    private String[] students;
    private int numberOfStudents;


    public Course(String courseName){
        this.courseName = courseName;
    }

    public String getCourseName(){
        return courseName;
    }

    public void addStudent(String student){
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
}
