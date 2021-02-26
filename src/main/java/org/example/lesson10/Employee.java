package org.example.lesson10;

import java.util.Objects;

public class Employee {
    public String name;
    public String surname;
    public int age;
    private double salary;


    public double income(double salary){
        return salary*0.8;
    }

    private void anyMethod(){
        System.out.println("x");
    }

    public Employee() {
    }

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Employee(String name, String surname, int age, double salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Double.compare(employee.salary, salary) == 0 && name.equals(employee.name) && surname.equals(employee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
