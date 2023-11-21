package com.kodilla.rps;

import java.util.Random;

public class ComputerMoves {
    public static int getComputerMove() {
        Random random = new Random();
        int computerChoice = random.nextInt(3 - 1 + 1) + 1;

        System.out.println(computerChoice);
        if (1 == computerChoice) {
            System.out.println("Computer chose rock");
        } else if (2 == computerChoice) {
            System.out.println("Computer chose paper");
        } else if (3 == computerChoice) {
            System.out.println("Computer chose scissors");
        }
        return computerChoice;
    }
}
