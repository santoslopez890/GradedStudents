package io.zipcoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ListIterator;

public class Classroom {

    private Student[] kids;

    public Classroom(Student[] kids){
        this.kids=kids;
    }
    public Classroom(int maxStudents){
        this.kids= new Student[maxStudents];
    }
    public Student[] getKids(){
        return kids;
    }
    public Classroom(){
        this.kids=new Student[30];
    }
    public Double getAverageExamScore(){
        Double sum=0.0;
        for (Student students:kids) {
            sum+=students.getAverageExamScore();
        }
        return sum/kids.length;
    }
    public void addStudent(Student student){
        ArrayList<Student> studentList=new ArrayList<>(Arrays.asList(kids));
        studentList.add(student);
        this.kids= studentList.toArray(new Student[0]);
    }
    public void removeStudent(String firstname,String lastname){
        ArrayList<Student> studentsList=new ArrayList<>(Arrays.asList(kids));
        for (Student student:kids) {
            if(student.getFirstName().equals(firstname)&& student.getLastName().equals(lastname)) {
                studentsList.remove(student);
                studentsList.add(null);
            }
        }
        this.kids= studentsList.toArray(new Student[0]);

    }
    public void  sortByScore(){

        ArrayList<Student> studentsList=new ArrayList<>(Arrays.asList(kids));
        ArrayList<Double> gradeSort=new ArrayList<>(kids.length);
        ListIterator<Student> it = studentsList.listIterator();
        while (it.hasNext()) {
            Student t = it.next();
            Student prev = it.previous();
            if(t.getAverageExamScore()< prev.getAverageExamScore()){
                
            }
        }


        for (Student i:studentsList) {

           // studentsList.sort(Comparator.comparingDouble(i.getAverageExamScore(),i.getAverageExamScore());
        }

        this.kids= studentsList.toArray(new Student[0]);

    }

    @Override
    public String toString() {
        return "Classroom{" +
                "kids=" + Arrays.toString(kids) +
                '}';
    }
}
