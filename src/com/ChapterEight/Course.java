package com.ChapterEight;

import java.lang.reflect.Array;

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
    public void deleteStudent(String student){
        students[numberOfStudents] = student;

    }
    public String[] getStudents(){
        return students;
    }
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
}
