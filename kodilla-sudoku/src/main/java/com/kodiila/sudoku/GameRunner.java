package com.kodiila.sudoku;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameRunner {

    private final static Scanner scanner = new Scanner(System.in);

    public static List<String> getInput() {
        List<String> inputList = new ArrayList<>();
        System.out.println("Please enter your numbers (row,column,value) example: 111");
        inputList.add(checkNumber(scanner.nextLine()));
        return inputNext(inputList);
    }

    public static List<String> inputNext(List<String> inputList) {
        System.out.println("Please enter your numbers (row,column,value)");
        String input = scanner.nextLine();
        while (!input.equals("s")) {
            inputList.add(checkNumber(input));
            System.out.println("Please enter your numbers (row,column,value) or press 's' to show sudoku board)");
            input = scanner.nextLine();
        }
        return inputList;
    }

    public static String checkNumber(String check) {
        while (!check.matches("-?[1-9]{3}")) {
            System.out.println("Wrong move - choose numbers between 1-9");
            check = scanner.nextLine();
        }
        return check;
    }
}
