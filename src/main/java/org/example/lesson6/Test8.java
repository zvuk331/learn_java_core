package org.example.lesson6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test8 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Pavel", 21,1,8.5);
        Student student2 = new Student("Sergey", 22,2,7.4);
        Student student3 = new Student("Alem", 23,3,6.4);
        Student student4 = new Student("Denis", 20,1,9.3);
        Student student5 = new Student("Ivan", 24,4,6.3);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        List<Integer> courses = students.stream().mapToInt(e->e.getCourse()).boxed().collect(Collectors.toList());
        List<Double> avgGradeList = students.stream().mapToDouble(e->e.getAvgGrade()).boxed().collect(Collectors.toList());
//        System.out.println(courses);
//        System.out.println(avgGradeList);
        double sum = students.stream().mapToDouble(e->e.getAvgGrade()).sum();
        double average = students.stream().mapToDouble(e->e.getAvgGrade()).average().getAsDouble();
        int min = students.stream().mapToInt(e -> e.getAge()).min().getAsInt();
//        System.out.println(sum);
//        System.out.println(average);
//        System.out.println(min);

        List<Integer> list = List.of(1,2,3,4,5,6,7,8);
        double divisionResult = list.parallelStream().reduce((a,e)->a+e).get();
        System.out.println(divisionResult);
//        Student first = students.stream().findFirst().get();                                         //findFirst()
//        System.out.println(first);

//        Student min = students.stream().min((x,y)-> x.getAge()- y.getAge()).get();                   // min() method
//        Student max = students.stream().max((x,y)-> x.getAge()- y.getAge()).get();                   // max() method
//        System.out.println(min);
//        System.out.println(max);

//        students.stream().filter(e -> e.getAge() > 20).limit(2).forEach(System.out::println);         // limit()

//        students.stream().filter(e -> e.getAge() > 20).skip(2).forEach(System.out::println);          // skip()
//        Map<Integer, List<Student>> map = students.stream().map(student -> {
//            student.setName(student.getName().toUpperCase());
//            return student;
//        }).collect(Collectors.groupingBy(student -> student.getCourse()));
//        for (Map.Entry<Integer, List<Student>> entry : map.entrySet()){
//            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
//        }
//        Map<Boolean,List<Student>> map = students.stream().collect(Collectors.partitioningBy(student -> student.getAvgGrade() > 7));
//
//        for (Map.Entry<Boolean, List<Student>> entry : map.entrySet()){
//            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
//        }
    }
}
