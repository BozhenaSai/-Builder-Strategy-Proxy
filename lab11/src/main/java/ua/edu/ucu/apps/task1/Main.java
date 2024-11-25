package ua.edu.ucu.apps.task1;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // StudentBuilder studentBuilder = new StudentBuilder();
        Student student = Student.builder()
            .firstName("John")
            .lastName("Doe")
            .age(20)
            .gender("")
            .courses(List.of("Course from list"))
            .course("New Course")
            .email("")
            .build();

        System.out.println(student);
    }
}