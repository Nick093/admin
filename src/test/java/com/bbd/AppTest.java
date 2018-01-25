package com.bbd;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void CreateCourse()
    {
        Course course = new Course("Elen1000",156);
        assertNotNull(course);
    }

    @Test
    public void CreateStudent()
    {
        Student student = new Student("John Wayne",666666,"May 3 1993");
        assertNotNull(student);
    }

    @Test
    public void IsStudentInCourseIn()
    {
        Course course = new Course("Elen1000",156);
        Student student = new Student("John Wayne",666666,"May 3 1993");
        course.EnrollStudent(student);
        assertTrue(course.IsInCourse(student));
    }

    @Test
    public void IsStudentInCourseNotIn()
    {
        Course course = new Course("Elen1000",156);
        Student student = new Student("John Wayne",666666,"May 3 1993");
        assertFalse(course.IsInCourse(student));
    }

    @Test
    public void EnrolStudentToCourse()
    {
        Course course = new Course("Elen1000",156);
        Student student = new Student("John Wayne",666666,"May 3 1993");
        assertTrue(course.EnrollStudent(student));
    }

    @Test
    public void EnrolStudentToCourseInAlready()
    {
        Course course = new Course("Elen1000",156);
        Student student = new Student("John Wayne",666666,"May 3 1993");
        course.EnrollStudent(student);
        assertFalse(course.EnrollStudent(student));
    }

    @Test
    public void EnrolStudentToCourseFull()
    {
        Course course = new Course("Elen1000",0);
        Student student = new Student("John Wayne",666666,"May 3 1993");
        assertFalse(course.EnrollStudent(student));
    }

    @Test
    public void DropStudentFromCourse()
    {
        Course course = new Course("Elen1000",156);
        Student student = new Student("John Wayne",666666,"May 3 1993");
        course.EnrollStudent(student);
        assertTrue(course.DropStudent(student));
    }

    @Test
    public void DropStudentFromCourseNotIn()
    {
        Course course = new Course("Elen1000",156);
        Student student = new Student("John Wayne",666666,"May 3 1993");
        assertFalse(course.DropStudent(student));
    }

    @Test
    public void PrintStudentsInCourse()
    {
        Course course = new Course("Elen1000",156);
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("John Wayne",666666,"May 3 1893"));
        students.add(new Student("Pilgrim",664526,"May 27 1890"));
        for (Student s: students)
            course.EnrollStudent(s);
        assertEquals(course.PrintEnrolledStudents(), "Name: John Wayne Student Number: 666666 Date of Birth: May 3 1893.Name: Pilgrim Student Number: 664526 Date of Birth: May 27 1890.");
    }

    @Test
    public void PrintStudentsInCourseWrong()
    {
        Course course = new Course("Elen1000",156);
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("John Wayne",666666,"May 3 1893"));
        students.add(new Student("Pilgrim",664526,"May 27 1890"));
        for (Student s: students)
            course.EnrollStudent(s);
        assertFalse(course.PrintEnrolledStudents().equals("Name: Butch Cassidy Student Number: 666666 Date of Birth: May 3 1893.Name: Sundance Student Number: 664526 Date of Birth: May 27 1890."));
    }
}
