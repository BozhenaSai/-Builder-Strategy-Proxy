package ua.edu.ucu.apps.task1;

import java.util.List;

import lombok.Builder;
import lombok.Singular;
import lombok.ToString;

@Builder
@ToString
public class Student {
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private int age;
    @Singular private List<String> courses;

    // public Student() {
        
    // }

    // public static class StudentBuilder {
    //     private Student Student;

    //     public StudentBuilder() {
    //         this.Student = new Student();
    //     }

    //     public StudentBuilder firstName(String firstName) {
    //         Student.firstName = firstName;
    //         return this;
    //     }

    //     public StudentBuilder lastName(String lastName) {
    //         Student.lastName = lastName;
    //         return this;
    //     }

    //     public StudentBuilder age(int age) {
    //         Student.age = age;
    //         return this;
    //     }

    //     public Student build() {
    //         return Student;
    //     }

    // }

}
