package com.bbd;

public class Student
{
    String name;
    int studentNumber;
    String dob;

    public Student(String name, int studentNumber, String dob)
    {
        this.name = name;
        this.studentNumber = studentNumber;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
