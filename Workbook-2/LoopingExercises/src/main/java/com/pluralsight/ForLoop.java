package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {
        for (int x = 10; x > 0; x--) {
            Thread.sleep(1000);
            System.out.println(x);
        }
        System.out.println("Launch!");
    }
}
