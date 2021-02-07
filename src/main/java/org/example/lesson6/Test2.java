package org.example.lesson6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
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

        List<Student> list = students.stream().filter(student
                -> student.getAge() < 23 && student.getAvgGrade() < 8).collect(Collectors.toList());


//        System.out.println(students);
//        System.out.println(list);

        // Можно и просто создать Stream c нуля
        Stream<Student> stream = Stream.of(student1,student2,student3,student4,student5);
        List<Student> list3 = stream.filter(st -> st.getCourse() > 2).collect(Collectors.toList());
//        System.out.println(list3);

//        students = students.stream().sorted((x,y) -> x.getCourse() - y.getCourse()).collect(Collectors.toList());
        students = students.stream()
                .filter(student -> student.getCourse()<3)
                .map(student -> {
                    student.setName(student.getName().toUpperCase());
                    return student;})
                .collect(Collectors.toList());
        System.out.println(students);
    }
}
class Student {
    private String name;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, int age, int course, double avgGrade) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }
}
