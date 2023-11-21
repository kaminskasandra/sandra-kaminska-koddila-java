package com.kodilla.rps;

import java.util.Scanner;

public class GameLogic {

    public static void RpsLogic() {
        Scanner scanner = new Scanner(System.in);
        boolean end = false;
        String decision;

        System.out.println("Welcome to the 'rock paper scissors' game. Please enter your name:");
        String name = scanner.nextLine();
        System.out.println("How to play? " +
                "1 = playing ROCK |" +
                " 2 = playing PAPER |" +
                " 3 = playing SCISSORS |" +
                " x = end of game |" +
                " n = new game");
        while (!end) {
            System.out.println("How many won rounds gives you victory, " + name + "?");
            int computerWins = 0;
            int userWins = 0;

            int numberOfRound = scanner.nextInt();

            for (int i = 0; i < numberOfRound; i++) {
                System.out.println("Enter your choice:");
                decision = scanner.next();
                int computerChoice = ComputerMoves.getComputerMove();

                if ("1".equals(decision)) {
                    System.out.println(name + " chose rock");
                } else if ("2".equals(decision)) {
                    System.out.println(name + " chose paper");
                } else if ("3".equals(decision)) {
                    System.out.println(name + " chose scissors");
                }

                if ("x".equals(decision)) {
                    System.out.println("Are you sure you want to quit Y/N?");
                    decision = scanner.next();
                    if ("Y".equals(decision)) {
                        computerWins = 0;
                        userWins = 0;
                        end = true;
                        break;
                    } else {
                        end = false;
                    }
                } else if ("n".equals(decision)) {
                    System.out.println("Are you sure you want to play new game Y/N?");
                    decision = scanner.next();
                    if ("Y".equals(decision)) {
                        computerWins = 0;
                        userWins = 0;
                        break;
                    }
                } else if (decision.equals(String.valueOf(computerChoice))) {
                    System.out.println("Tie! Score result: " + userWins + ":" + computerWins);
                } else if (decision.equals("3") && computerChoice == 2) {
                    userWins++;
                    System.out.println(name + " won! Score result: Computer - " + computerWins + ", " + name + "- " + userWins);
                } else if (decision.equals("2") && computerChoice == 1) {
                    userWins++;
                    System.out.println(name + " won! Score result: Computer - " + computerWins + ", " + name + "- " + userWins);
                } else if (decision.equals("1") && computerChoice == 3) {
                    userWins++;
                    System.out.println(name + " won! Score result: Computer - " + computerWins + ", " + name + "- " + userWins);
                } else {
                    computerWins++;
                    System.out.println("Computer won! Score result: " + "Computer - " + computerWins + ", " + name + "- " + userWins);
                }
            }
            if (computerWins > userWins) {
                System.out.println("The winner is Computer!!!");
            } else {
                System.out.println("The winner is " + name + "!!!");
            }
            System.out.println("play again - PRESS 'n', exit game - PRESS 'x'");
            decision = scanner.next();
            if ("x".equals(decision)) {
                System.out.println("Are you sure you want to quit Y/N?");
                decision = scanner.next();
                if ("Y".equals(decision)) {
                    end = true;
                    break;
                } else {
                    end = false;
                }
            }
        }
    }
}
