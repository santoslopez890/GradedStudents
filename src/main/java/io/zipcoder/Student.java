package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    String firstName;
    String lastName;
    ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(Arrays.asList(examScores));
    }

    public String getFirstName() {
        return firstName;
    }
    public String getExamScores(){
        StringBuilder string = new StringBuilder();
        string.append("\nExam Scores: \n") ;
       // for (int i = 0; i < examScores.size(); i++) {
       //     string.append (String.format("\tExam %d -> %.0f \n", 1 + i, examScores);
        //}
       int i=0;
        for (Double score:examScores) {
            string.append (String.format("\tExam %d -> %.0f \n", 1 + i, score));
        }
        return string.toString();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void addExamScore(double score){
        examScores.add(score);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getNumberOfExamsTaken(){
        return examScores.size();
    }

    public Double getAverageExamScore() {
        double sum =0.0;
        for (Double i:examScores) {
            sum+=i;
        }
        return sum/examScores.size();
    }
public String toString(){
    StringBuilder string = new StringBuilder();
    string.append("String Name: ").append(firstName).append(" ").append (lastName);
    string.append("\nAverage Score: "). append (getAverageExamScore());
            string.append ((getExamScores()));
    return string.toString();
}
}
