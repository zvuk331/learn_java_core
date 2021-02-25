package org.example.lesson10;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionExample {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class employeeClass = Class.forName("org.example.lesson10.Employee");

        Constructor<Employee> constructor = employeeClass.getConstructor();
        Employee obj = constructor.newInstance();
        Constructor<Employee> constructor2 = employeeClass.getConstructor(String.class, String.class, int.class);


        Object obj2 = constructor2.newInstance("Vasya", "Ivanov", 29);
//        Method method = employeeClass.getMethod("income", double.class);
//        method.invoke(10.0);
        System.out.println(obj2);
        obj.setSalary(10);
        System.out.println(obj);
        Field field = employeeClass.getDeclaredField("salary");
        field.setAccessible(true);
        field.set(obj, 20);
        System.out.println(obj);

        Field[] fields = employeeClass.getFields();
        Field[] fields1 = employeeClass.getDeclaredFields();
        Method[] methods = employeeClass.getMethods();
        Method[] methods1 = employeeClass.getDeclaredMethods();
        Constructor[] constructors = employeeClass.getDeclaredConstructors();


        System.out.println(Arrays.toString(fields1));
        System.out.println(Arrays.toString(methods));
        System.out.println(Arrays.toString(methods1));
        System.out.println(Arrays.toString(constructors));
    }
}
