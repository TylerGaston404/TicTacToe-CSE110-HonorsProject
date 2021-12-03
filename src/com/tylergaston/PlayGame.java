package com.tylergaston;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class PlayGame {
    private static String[] board;
    private static String turn;
    private static String player1;
    private static String player2;

    public void startNewGame() throws IOException {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please Enter Player1's Name: ");
        player1 = scnr.next();
        System.out.println("Please Enter Player2's Name: ");
        player2 = scnr.next();
        playGame();
    }

    static void printBoard() {
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("|---|---|---|");
    }

    public static void playGame() throws IOException {
        Scanner scnr = new Scanner(System.in);
        board = new String[9]; //String array with 9 elements
        turn = "X";
        String winner = null;

        board[0] = String.valueOf(1);
        board[1] = String.valueOf(1 + 1);
        board[2] = String.valueOf(2 + 1);
        board[3] = String.valueOf(3 + 1);
        board[4] = String.valueOf(4 + 1);
        board[5] = String.valueOf(5 + 1);
        board[6] = String.valueOf(6 + 1);
        board[7] = String.valueOf(7 + 1);
        board[8] = String.valueOf(8 + 1);

        System.out.printf("Lets play Tic Tac Toe!\nFirst player to connect three in a row wins!\nTry your best to block off your opponent from winning.\n\n%s will be: X\n%s will be: O\n", player1, player2);
        printBoard();
        System.out.printf("%s will move first. Enter a number to place your move:\n", player1);

        while (winner == null) {
            int index;
            index = scnr.nextInt();
            if (board[index - 1].equals(String.valueOf(index))) {
                board[index - 1] = turn;
                if (turn.equals("X")) {
                    turn = "O";
                }
                else {
                    turn = "X";
                }
                printBoard();
                winner = checkWinner();
            }
            else {
                System.out.println("You cant play this spot. Try again: ");
            }
        }

        if (winner.equalsIgnoreCase("draw")) {
            System.out.println("It's a draw! The game is now over!");
        }
        else {
            System.out.println("Congratulations! " + winner + " won!");
        }
    }

    static String checkWinner() throws IOException {
        HighScore logwin = new HighScore();
        for (int i = 0; i < 8; i++) {
            String win = switch (i) { //Enhanced switch statement // Suggested by intellij
                case 0 -> board[0] + board[1] + board[2];
                case 1 -> board[3] + board[4] + board[5];
                case 2 -> board[6] + board[7] + board[8];
                case 3 -> board[0] + board[3] + board[6];
                case 4 -> board[1] + board[4] + board[7];
                case 5 -> board[2] + board[5] + board[8];
                case 6 -> board[0] + board[4] + board[8];
                case 7 -> board[2] + board[4] + board[6];
                default -> null;
            };
            if (win.equals("XXX")) {
                logwin.addWin(player1);
                return player1;
            }
            else if (win.equals("OOO")) {
                logwin.addWin(player2);
                return player2;
            }
        }

        for (int i = 0; i < 9; i++) {
            if (Arrays.asList(board).contains(String.valueOf(i + 1))) {
                break;
            }
            else if (i == 8) {
                return "draw";
            }
        }

        String turnName;
        if (turn.equals("X")) {
            turnName = player1;
        } else {
            turnName = player2;
        }
        System.out.println(turnName + "'s turn; enter a slot number to place " + turn + " in:");
        return null;
    }

}
