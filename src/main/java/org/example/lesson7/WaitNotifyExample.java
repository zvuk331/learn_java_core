package org.example.lesson7;

public class WaitNotifyExample {
    public static void main(String[] args) {
        Market market = new Market();
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);

        Thread thread1= new Thread(producer);
        Thread thread2= new Thread(consumer);

        thread1.start();
        thread2.start();
    }
}

class Market{
    int breadCounter = 0;
    synchronized void getBread(){
        while (breadCounter < 1){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCounter--;
        System.out.println("Потребитель купил 1 хлеб");
        System.out.println("Хлеба осталось = " + breadCounter);
        notify();
    }
    synchronized void putBread(){
        while (breadCounter>=5){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCounter++;
        System.out.println("Производитель добавил 1 хлеб");
        System.out.println("Количество хлеба = " + breadCounter);
        notify();
    }
}

class Producer implements Runnable{
    Market market;

    public Producer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            market.putBread();
        }
    }
}

class Consumer implements Runnable{
    Market market;

    public Consumer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            market.getBread();
        }
    }
}


