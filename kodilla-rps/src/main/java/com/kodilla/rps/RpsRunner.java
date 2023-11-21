package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        GameLogic.RpsLogic();
        ComputerMoves.getComputerMove();
    }
}




















/*


    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
        System.out.println("Welcome to the 'rock paper scissors' game. Please enter your name:");

                int rock=1;
                int paper=2;
                int scissors=3;
                boolean end=false;

                String name=scanner.nextLine();

                System.out.println("How many won rounds gives you victory, "+name+"?");

                int numberOfRounds=scanner.nextInt();

                System.out.println("How to play? "+
                "1 = playing ROCK |"+
                " 2 = playing PAPER |"+
                " 3 = playing SCISSORS |"+
                " x = end of game |"+
                " n = new game");

                System.out.println("Enter your choice:");

                int userChoice=scanner.nextInt();


                while(userChoice>3){
                System.out.println("Wrong data, enter number between 1-3");
                userChoice=scanner.nextInt();
                }

                for(int i=0;i<numberOfRounds; i++){
        if(userChoice==rock){
        System.out.println("User chose ROCK");
        }else{
        if(userChoice==paper){
        System.out.println("User chose PAPER");
        }else{
        System.out.println("User chose SCISSORS");
        }
        }

        int computerChoice=random.nextInt(4);

        if(computerChoice==rock){
        System.out.println("Computer chose ROCK");
        }else{
        if(computerChoice==paper){
        System.out.println("Computer chose PAPER");
        }else{
        System.out.println("Computer chose SCISSORS");
        }
        }
        if(userChoice==computerChoice){
        System.out.println("Tie!");
        }
        if(userChoice==scissors&&computerChoice==paper){
        System.out.println(name+" won");
        }
        if(userChoice==paper&&computerChoice==scissors){
        System.out.println("Computer won");
        }
        if(userChoice==rock&&computerChoice==paper){
        System.out.println("Computer won");
        }
        if(userChoice==paper&&computerChoice==rock){
        System.out.println(name+" won");
        }
        if(userChoice==rock&&computerChoice==scissors){
        System.out.println(name+" won");
        }
        if(userChoice==scissors&&computerChoice==rock){
        System.out.println("Computer won");
        }
        }
        }
*/
