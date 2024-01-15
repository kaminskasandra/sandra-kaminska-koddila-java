package com.kodiila.sudoku;

public class SudokuApp {
    public static void main(String[] args) {
        boolean gameFinished = false;

        while (!gameFinished) {
            SudokuGame sudokuGame = new SudokuGame();
            gameFinished = sudokuGame.resolve();
        }
    }
}