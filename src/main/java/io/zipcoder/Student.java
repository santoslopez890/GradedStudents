package io.zipcoder;

import java.util.ArrayList;

public class Student {
    String firstName;
    String lastName;
    ArrayList<Double> examScores;

    public Student(String firstName, String lastName, ArrayList<Double> examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }
}
