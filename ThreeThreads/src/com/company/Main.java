package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyThread nit1 = new MyThread("nit1");
        MyThread nit2 = new MyThread("nit2");
        MyThread nit3 = new MyThread("nit3");
        // pokretanje prve niti
        nit1.start();
        // pokretanje sledece niti
        try{

            nit1.join();
        }
        catch (InterruptedException ex){
            ex.printStackTrace();
        }
        nit2.start();

        try{
            nit2.join();
        }
        catch (InterruptedException ex){
            ex.printStackTrace();
        }
        nit3.start();
        try{
            nit3.join();

        }
        catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
