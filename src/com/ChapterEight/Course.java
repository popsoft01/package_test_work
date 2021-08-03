package com.ChapterEight;

import java.lang.reflect.Array;

public class Course {
    private String courseName;
    private String[] students = new String[100];
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
        for (int i = 0; i<students.length; i++){
            if (students[i].equals(student))
                students[i] = null;
        }
//        students[numberOfStudents] = null;
        numberOfStudents--;

    }
    public String[] getStudents(){
        return students;
    }
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
}
