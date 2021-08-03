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

    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");
        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");
        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");
        System.out.println("Number of students in course1: "
                + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students[i] + ", ");
        System.out.println();
        course2.deleteStudent("Steve Smith");
        System.out.print("Number of students in course2: " + course2.getNumberOfStudents());
    }

}
