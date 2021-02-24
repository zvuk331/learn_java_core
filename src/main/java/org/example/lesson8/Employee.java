package org.example.lesson8;

import java.io.Serializable;

public class Employee implements Serializable {
    String name;
    int age;
    transient int salary;
    String department;
    Car car;

    public Employee() {
    }

    public Employee(String name, int age, int salary, String department, Car car) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
        this.car = car;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", Car='" + car + '\'' +
                '}';
    }
}
