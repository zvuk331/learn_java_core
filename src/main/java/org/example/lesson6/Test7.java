package org.example.lesson6;

import java.util.ArrayList;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {
        Student student1 = new Student("Pavel", 21,1,8.5);
        Student student2 = new Student("Sergey", 22,2,7.4);
        Student student3 = new Student("Alem", 23,3,6.4);
        Student student4 = new Student("Denis", 20,1,9.3);
        Student student5 = new Student("Ivan", 24,4,6.3);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Applied Mathematics");

        f1.listStudentsOnFaculty.add(student1);
        f1.listStudentsOnFaculty.add(student2);
        f1.listStudentsOnFaculty.add(student3);
        f2.listStudentsOnFaculty.add(student4);
        f2.listStudentsOnFaculty.add(student5);

        List<Faculty> listFaculty = new ArrayList<>();
        listFaculty.add(f1);
        listFaculty.add(f2);

        listFaculty.stream().flatMap(faculty -> faculty.listStudentsOnFaculty.stream())
                .forEach(e -> System.out.println(e.getName()));
    }
}
class Faculty {
    String name;
    List<Student> listStudentsOnFaculty;

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                '}';
    }

    public Faculty(String name) {
        this.name = name;
        this.listStudentsOnFaculty = new ArrayList<>();


    }
}
