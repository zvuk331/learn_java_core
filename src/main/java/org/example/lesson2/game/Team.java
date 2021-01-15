package org.example.lesson2.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Participant>{
    private String name;
    List<T> participantList = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addParticipant(T participant){
        participantList.add(participant);
        System.out.println("В команду " + name + " был добавлен " + participant.getName());
    }

    public void playWith(Team<T> team){
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0){
            winnerName = this.name;
        } else {
            winnerName = team.name;
        }
        System.out.println("Выиграла команда " + winnerName);
    }
}
