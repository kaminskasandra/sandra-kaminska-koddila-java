package com.kodiila.sudoku;

import java.util.*;

class SudokuGame {
    private final SudokuBoard board = new SudokuBoard();
    private final Scanner scanner = new Scanner(System.in);

    public boolean resolve() {
        board.createBoard();
        fillSudoku();
        solveSudoku();
        return true;
    }

    private void fillSudoku() {
        System.out.println("Welcome to SUDOKU");
        System.out.println(board);
        List<String> inputList = GameRunner.getInput();
        for (String input : inputList) {
            board.addInputToSudoku(Character.getNumericValue(input.charAt(0)), Character.getNumericValue(input.charAt(1))
                    , Character.getNumericValue(input.charAt(2)));
            System.out.println(board);
        }
    }

    private void solveSudoku() {
        do {
            System.out.println("Write 'SUDOKU' to autofill");
        } while (!scanner.nextLine().toUpperCase(Locale.ROOT).equals("SUDOKU"));

        try {
            SudokuBoardFiller boardFiller = new SudokuBoardFiller(board.deepCopy());
            SudokuBoard result = boardFiller.solve();
            System.out.println(result);
        } catch (CloneNotSupportedException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        System.out.println("Sudoku completed correctly!");
    }
}
