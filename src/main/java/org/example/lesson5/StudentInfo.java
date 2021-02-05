package org.example.lesson5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentInfo {
    void studentsCheck(List<Student> students, Predicate<Student> pr){
        for (Student s : students){
            if (pr.test(s)){
                System.out.println(s);
            }
        }
    }
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student st1 = new Student("Pasha",21,'M',1,8.2);
        Student st2 = new Student("Ivan",20,'M',2,6.2);
        Student st3 = new Student("Inna",21,'F',3,9.1);
        Student st4 = new Student("Sergey",22,'M',1,7.7);
        Student st5 = new Student("Denis",21,'M',4,9.5);
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        Function<Student, Double> f = student -> student.avgGrade;
        double res = avgOfSmth(students,f);
        System.out.println(res);
//        Predicate<Student> p1 = student -> student.course>2;
//        Predicate<Student> p2 = student -> student.avgGrade<8;
//        StudentInfo studentInfo = new StudentInfo();
//        studentInfo.studentsCheck(students, (Student s) -> {return s.age>21;});
//        studentInfo.studentsCheck(students, s -> s.age>21);
//        System.out.println("------------------------------");
//        studentInfo.studentsCheck(students, p1);
//        System.out.println("------------------------------");
//        studentInfo.studentsCheck(students, p2);
//        studentInfo.studentsCheck(students, p1.and(p2));
//        studentInfo.studentsCheck(students, p1.or(p2));



//        students.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student st1, Student st2) {
//                return st1.course-st2.course;
//            }
//        });

//        Collections.sort(students, (stud1,stud2) ->{return stud1.course-stud2.course;});
//        System.out.println(students);
    }
    static double avgOfSmth(List<Student> list, Function<Student, Double> f){
        double result = 0;
        for (Student student : list){
            result += f.apply(student);
        }
        result /= list.size();
        return result;
    }

}
//interface StudentCheck{
//    boolean check(Student s);
//}
