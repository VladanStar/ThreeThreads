package com.company;
public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Nit " + this.getName() + " pocinje izvrsavanje. ");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("Nit " + this.getName() + " je zavrsena. ");
    }
}



