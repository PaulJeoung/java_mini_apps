package ch98.no3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    private static final int SIZE = 5;
    private static final int MAX_NUMBER = 25;
    private static final int WINNING_COUNT = SIZE; // 빙고를 만들기 위한 카운트

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] board = generateBingoBoard();
        boolean[][] marked = new boolean[SIZE][SIZE];

        System.out.println("빙고 게임에 오신 것을 환영합니다!");
        printBoard(board, marked);

        while (true) {
            System.out.println("숫자를 입력하세요 (1-25): ");
            int number = scanner.nextInt();

            if (number < 1 || number > MAX_NUMBER) {
                System.out.println("잘못된 숫자입니다. 1과 25 사이의 숫자를 입력하세요.");
                continue;
            }

            boolean found = false;
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (board[i][j] == number) {
                        marked[i][j] = true;
                        found = true;
                        break;
                    }
                }
                if (found) break;
            }

            if (!found) {
                System.out.println("보드에 없는 숫자입니다.");
                continue;
            }

            printBoard(board, marked);
            if (checkBingo(marked)) {
                System.out.println("빙고!");
                break;
            }
        }

        scanner.close();
    }

    private static int[][] generateBingoBoard() {
        Random random = new Random();
        int[][] board = new int[SIZE][SIZE];
        boolean[] used = new boolean[MAX_NUMBER + 1];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                int number;
                do {
                    number = random.nextInt(MAX_NUMBER) + 1;
                } while (used[number]);
                board[i][j] = number;
                used[number] = true;
            }
        }

        return board;
    }

    private static void printBoard(int[][] board, boolean[][] marked) {
        System.out.println("빙고 보드:");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (marked[i][j]) {
                    System.out.print("X\t");
                } else {
                    System.out.print(board[i][j] + "\t");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private static boolean checkBingo(boolean[][] marked) {
        // 행 체크
        for (int i = 0; i < SIZE; i++) {
            boolean rowBingo = true;
            for (int j = 0; j < SIZE; j++) {
                if (!marked[i][j]) {
                    rowBingo = false;
                    break;
                }
            }
            if (rowBingo) return true;
        }

        // 열 체크
        for (int j = 0; j < SIZE; j++) {
            boolean colBingo = true;
            for (int i = 0; i < SIZE; i++) {
                if (!marked[i][j]) {
                    colBingo = false;
                    break;
                }
            }
            if (colBingo) return true;
        }

        // 대각선 체크
        boolean diag1Bingo = true;
        for (int i = 0; i < SIZE; i++) {
            if (!marked[i][i]) {
                diag1Bingo = false;
                break;
            }
        }
        if (diag1Bingo) return true;

        boolean diag2Bingo = true;
        for (int i = 0; i < SIZE; i++) {
            if (!marked[i][SIZE - 1 - i]) {
                diag2Bingo = false;
                break;
            }
        }
        return diag2Bingo;
    }
}
