package org.example.lesson2.game;

import java.util.List;

public class Play {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 10);
        Schoolar schoolar2 = new Schoolar("Petr", 13);

        Student student1 = new Student("Petya", 19);
        Student student2 = new Student("Valya", 20);
        Student student3 = new Student("Oleg", 11);
        Student student4 = new Student("Pasha", 10);

        Employee employee1 = new Employee("Kseniya", 25);
        Employee employee2 = new Employee("Igor", 30);

        Team<Schoolar> team1 = new Team<>("Dragons");
        Team<Student> team2 = new Team<>("Na'Vi");
        Team<Employee> team3 = new Team<>("Pro team");

        Team<Schoolar> team4 = new Team<>("Astralis");

        team1.addParticipant(schoolar1);
        team1.addParticipant(schoolar2);

        team2.addParticipant(student1);
        team2.addParticipant(student2);

        team3.addParticipant(employee1);
        team3.addParticipant(employee2);

        team1.playWith(team4);

    }
}
