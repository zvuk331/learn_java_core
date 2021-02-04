package org.example.lesson3;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Employee emp1 = new Employee(19, "Pasha", 900000);
        Employee emp2 = new Employee(21, "Oleg", 200000);
        Employee emp3 = new Employee(15, "Vasya", 100000);
        Employee emp4 = new Employee(1, "Petya", 100000);
        Employee emp5 = new Employee(2, "Gena", 100000);
        Employee emp6 = new Employee(4, "Timur", 100000);
        Employee emp7 = new Employee(7, "Aler", 100000);

        List<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
        list.add(emp6);
        list.add(emp7);


        Collections.sort(list);

//        int index = Collections.binarySearch(list, new Employee(2, "Gena", 100000));
//        System.out.println(list);
        int[] array = {-5,4,2,7,9,150,0,-2,56};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int index = Arrays.binarySearch(array,150);
        System.out.println(index);
    }
}

class Employee implements Comparable<Employee>{
    public int id;
    public String name;
    public int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && salary == employee.salary && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary);
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        int result = this.id - anotherEmp.id;
        if (result == 0){
            result = this.name.compareTo(anotherEmp.name);
        }
        return result;
    }
}
