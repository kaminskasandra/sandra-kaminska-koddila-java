package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        GameLogic.RpsLogic();
        ComputerMoves.getComputerMove();
    }
}