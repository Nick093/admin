package com.bbd;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;

public class Course
{
    private static int numberOfCourses=0;
    private int capacity;
    private String name;
    private ArrayList<Student> students = new ArrayList<Student>();

    public Course(String name, int capacity)
    {
        //this.students.clear();
        this.name = name;
        this.capacity = capacity;
        numberOfCourses ++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Boolean EnrollStudent(Student student)
    {
        if (this.capacity<=students.size())
            return false;
        if(!IsInCourse(student))
        {
            students.add(student);
            return true;
        }
        return false;
    }

    public Boolean IsInCourse(Student student)
    {
        for (Student s: students)
        {
            if (s.getStudentNumber()==student.getStudentNumber())
                return true;
        }
        return false;
    }

    public boolean DropStudent(Student student)
    {
        if(IsInCourse(student))
        {
            for (Student s: students)
            {
                if (s.getStudentNumber()== student.getStudentNumber())
                {
                    students.remove(student);
                    return true;
                }
            }
        }
        return false;
    }

    public String PrintEnrolledStudents()
    {
        String str ="";
        System.out.println("Students Enrolled in" + this.getName());
        for (Student s: students)
        {
            str += "Name: " + s.getName()+ " Student Number: " + s.getStudentNumber()+ " Date of Birth: "+ s.getDob() +".";
            System.out.println("Name: " + s.getName()+ ", Student Number: " + s.getStudentNumber()+ ", Date of Birth: "+ s.getDob() +".");
        }
        return str;
    }
}
