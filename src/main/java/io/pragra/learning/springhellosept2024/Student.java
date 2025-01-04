package io.pragra.learning.springhellosept2024;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public final class Student {
    final Integer studentId;
    final  String firstName;
    final String lastName;
    final Integer age;
    final List<String> phonenumbers;

    public Student(Integer studentId, String firstName, String lastName, Integer age, List<String> phonenumbers) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phonenumbers = phonenumbers;
    }



    @Override
    public int hashCode() {
        return Objects.hash(studentId, firstName, lastName, age, phonenumbers);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phonenumbers=" + phonenumbers +
                '}';
    }

    public Integer getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public List<String> getPhonenumbers() {
        List<String> temp = new ArrayList<>(phonenumbers);
        return temp;
    }
}
