package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Deck deck = new Deck();
        deck.shuffle();
        Card cards = deck.deal();

        String winner = "";

        String player1 = scanner.next();
        String player2 = scanner.next();

        int p1Points = 0;
        int p2Points = 0;

        Hand hand1 = new Hand();
        Hand hand2 = new Hand();

        hand1.Deal(cards);
        hand1.Deal(cards);
        p1Points = hand1.getValue();

        hand2.Deal(cards);
        hand2.Deal(cards);
        p2Points = hand2.getValue();

        if (p1Points > 21) {
            winner = player1;
        }

        if (p2Points > 21) {
            winner = player2;
        }
    }
}
