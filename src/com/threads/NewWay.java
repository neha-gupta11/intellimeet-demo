package com.threads;

public class NewWay {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("running from lambda");
        }).start();
    }
}
