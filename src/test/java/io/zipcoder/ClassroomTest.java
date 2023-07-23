package io.zipcoder;

import org.junit.Test;

public class ClassroomTest {
    @Test
    public void removetest(){
        Student student=new Student("santos","herrera",new Double[]{15.2,23.2,21.0});
        Student student2=new Student("bantos","berrera",new Double[]{12.2,20.2,19.0});
        Student[] students=new Student[]{student,student2};
        Classroom classroom=new Classroom(students);

        classroom.removeStudent("bantos","berrera");
        System.out.println(classroom.toString());
    }
}
