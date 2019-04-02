package com.java8.flatmap;


import static java.util.stream.Collectors.toList;

import java.util.List;

public class StreamsFlatMapExample {

    public static List<String> printStudentActivities(){

        List<String> studentActivities = StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>
                .flatMap(List::stream) //Stream<String>
                .collect(toList());

        return studentActivities;
    }


    public static void main(String[] args) {

        System.out.println("printStudentActivities : " + printStudentActivities());
    }
}
