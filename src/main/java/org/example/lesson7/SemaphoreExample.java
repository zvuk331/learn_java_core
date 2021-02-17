package org.example.lesson7;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);
        Person person1 = new Person("Pavel",callBox);
        Person person2 = new Person("Alem",callBox);
        Person person3 = new Person("Sergey",callBox);
        Person person4 = new Person("Denis",callBox);
        Person person5 = new Person("Igor",callBox);
    }
}
class Person extends Thread{
    private String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox){
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    @Override
    public void run() {

        try {
            System.out.println(name+ " ждёт");
            callBox.acquire();
            System.out.println(name + " пользуется телефоном");
            Thread.sleep(2000);
            System.out.println(name + " завершил(а) звонок");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            callBox.release();
        }

    }
}
