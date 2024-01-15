package com.kodiila.sudoku;

public class SudokuBoardFiller {

    private final SudokuBoard backtrackBoard;

    public SudokuBoardFiller(SudokuBoard sudokuBoard) throws CloneNotSupportedException {
        this.backtrackBoard = sudokuBoard.deepCopy();
    }

    public SudokuBoard solve() throws CloneNotSupportedException {
        if (!solveBoard()) {
            throw new IllegalArgumentException("Sudoku impossible to solve");
        }
        return backtrackBoard.deepCopy();
    }

    private boolean solveBoard() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (emptyField(i, j)) {
                    return solveField(i, j);
                }
            }
        }
        return true;
    }

    private boolean emptyField(int row, int col) {
        return backtrackBoard.getSudokuBoard().get(row).getRows().get(col).getValue() == SudokuElement.EMPTY;
    }

    private boolean solveField(int row, int col) {
        for (int v = 1; v < 10; v++) {
            if (possibleFill(row, col, v)) {
                backtrackBoard.getSudokuBoard().get(row).getRows().get(col).setValue(v);
                if (solveBoard()) {
                    return true;
                }
                backtrackBoard.getSudokuBoard().get(row).getRows().get(col).setValue(SudokuElement.EMPTY);
            }
        }
        return false;
    }

    private boolean possibleFill(int row, int col, int value) {
        return possibleInLine(row, col, value) && possibleInSquare(row, col, value);
    }

    private boolean possibleInSquare(int row, int col, int value) {
        int startX = row - row % 3;
        int startY = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (backtrackBoard.getSudokuBoard().get(startX + i).getRows().get(startY + j).getValue() == value) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean possibleInLine(int row, int col, int value) {
        for (int i = 0; i < 9; i++) {
            if (backtrackBoard.getSudokuBoard().get(i).getRows().get(col).getValue() == value ||
                    backtrackBoard.getSudokuBoard().get(row).getRows().get(i).getValue() == value) {
                return false;
            }
        }
        return true;
    }
}