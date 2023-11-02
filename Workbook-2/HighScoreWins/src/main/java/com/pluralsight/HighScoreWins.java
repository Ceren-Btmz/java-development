package com.pluralsight;

import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a game score using this format: Home:Visitor|21:9 ");
        String input = scanner.nextLine();

        int pipeIndex = input.indexOf('|');

        if (pipeIndex == -1) {
            System.out.println("Invalid input format.");
            scanner.close();
            return;
        }

        String teamPart = input.substring(0, pipeIndex);
        String scorePart = input.substring(pipeIndex + 1);

        int colonIndex = scorePart.indexOf(':');

        if (colonIndex == -1) {
            System.out.println("Invalid input format.");
            scanner.close();
            return;
        }

        int homeScore = Integer.parseInt(scorePart.substring(0, colonIndex));
        int visitorScore = Integer.parseInt(scorePart.substring(colonIndex + 1));

        String winner;
        if (homeScore >)
        System.out.println("Winner: " + highScore);

    }
}
