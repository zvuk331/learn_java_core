package org.example.lesson7;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerExample {
    public static void main(String[] args) {
    Exchanger<Action> exchanger = new Exchanger<>();
    List<Action> myAction = new ArrayList<>();
    List<Action> actionFriend = new ArrayList<>();
    myAction.add(Action.NOJNICI);
    myAction.add(Action.BUMAGA);
    myAction.add(Action.NOJNICI);
    actionFriend.add(Action.BUMAGA);
    actionFriend.add(Action.KAMEN);
    actionFriend.add(Action.KAMEN);

    new BestFriend("Pavel", myAction, exchanger);
    new BestFriend("Sergey", actionFriend, exchanger);
    }
}
enum Action {
    KAMEN, NOJNICI, BUMAGA;
}
class BestFriend extends Thread {
    private String name;
    private List<Action> actions;
    private Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> actions, Exchanger<Action> exchanger) {
        this.name = name;
        this.actions = actions;
        this.exchanger = exchanger;
        this.start();
    }

    public void whoWins(Action myAction, Action friendAction){
        if ((myAction == Action.KAMEN && friendAction == Action.NOJNICI)
        || (myAction == Action.BUMAGA && friendAction==Action.KAMEN)
        || (myAction == Action.NOJNICI && friendAction==Action.BUMAGA)){
            System.out.println(name + " WINS!");
        }
    }

    @Override
    public void run() {
        Action reply;
        for (Action action : actions){
            try {
                reply = exchanger.exchange(action);
                whoWins(action, reply);
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
