package org.example.lesson7;

public class MobileExample {
    static Object lock = new Object();
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MobileImplRunMobile());
        Thread thread2 = new Thread(new MobileImplRunWhatsapp());
        Thread thread3 = new Thread(new MobileImplRunSkype());

        thread1.start();
        thread2.start();
        thread3.start();
    }

    void skypeCall() {
        synchronized (lock) {
            try {
                System.out.println("Skype call starts");
                Thread.sleep(3000);
                System.out.println("Skype call ends");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void mobileCall() {
        synchronized (lock) {
            try {
                System.out.println("Mobile call starts");
                Thread.sleep(7000);
                System.out.println("Mobile call ends");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void whatsappCall() {
        synchronized (lock) {
            try {
                System.out.println("whatsApp call starts");
                Thread.sleep(5000);
                System.out.println("whatsApp call ends");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MobileImplRunSkype implements Runnable {
    @Override
    public void run() {
        new MobileExample().skypeCall();
    }
}
class MobileImplRunWhatsapp implements Runnable {
    @Override
    public void run() {
        new MobileExample().whatsappCall();
    }
}
class MobileImplRunMobile implements Runnable {
    @Override
    public void run() {
        new MobileExample().mobileCall();
    }
}