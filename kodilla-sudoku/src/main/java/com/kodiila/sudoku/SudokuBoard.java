package com.kodiila.sudoku;

import java.util.*;

public class SudokuBoard extends Prototype {
    public final static int MIN_INDEX = 0;
    public final static int MAX_INDEX = 8;
    private List<SudokuRow> board = new ArrayList<>();

    public SudokuBoard() {
    }

    public void createBoard() {
        for (int i = 0; i < 9; i++) {
            board.add(new SudokuRow());
        }
        for (SudokuRow row : board) {
            row.getEmptyRow();
        }
    }

    public void addInputToSudoku(int row, int col, int value) {
        board.get(row - 1).getRows().set(col - 1, new SudokuElement(value));
    }

    public List<SudokuRow> getSudokuBoard() {
        return board;
    }

    public SudokuBoard deepCopy() throws CloneNotSupportedException {
        SudokuBoard backtrackSudokuBoard = (SudokuBoard) super.clone();
        backtrackSudokuBoard.board = new ArrayList<>();
        for (SudokuRow row : board) {
            SudokuRow backtrackRow = new SudokuRow();
            for (SudokuElement element : row.getRows()) {
                backtrackRow.getRows().add(element);
            }
            backtrackSudokuBoard.getSudokuBoard().add(backtrackRow);
        }
        return backtrackSudokuBoard;
    }

    public String toString() {
        String result = "";
        result += "+-----------+-----------+-----------+\n";
        for (int y = MIN_INDEX; y <= MAX_INDEX; y++) {

            result += "|";

            for (int x = MIN_INDEX; x <= MAX_INDEX; x++) {
                if (getSudokuBoard().get(y).getRows().get(x).getValue() == -1) {
                    result += "   ";
                } else {
                    result += " " + getSudokuBoard().get(y).getRows().get(x).getValue() + " ";
                }

                if (x == 2 || x == 5 || x == 8) {
                    result += "|";
                } else {
                    result += "|";
                }
            }

            if (y == 2 || y == 5 || y == 8) {
                result += "\n+-----------+-----------+-----------+\n";
            } else {
                result += "\n";
            }
        }
        return result;
    }
}




