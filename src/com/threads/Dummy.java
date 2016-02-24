package com.threads;

public class Dummy implements Runnable {

    public void run() {
        System.out.println("running");
    }

    public static void main(String[] args) {
        Dummy dummy = new Dummy();
        new Thread(dummy).start();
    }
}
