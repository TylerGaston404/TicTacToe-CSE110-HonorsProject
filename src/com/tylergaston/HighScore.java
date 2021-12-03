package com.tylergaston;

import java.io.*;
import java.util.Scanner;

public class HighScore {
    private int totalGames = 0;

    public void getTop() throws IOException {
        Scanner scnr = new Scanner(System.in);
        String topOne = "null", topTwo = "null", topThree = "null", topFour = "null", topFive = "null";
        int goBack = 0;
        while (goBack == 0) {
            System.out.println("Total Games Played: " + getTotal());
            System.out.println(" ");
            System.out.println("Tic Tac Toe Leaderboard: (COMING IN v1.1)");
            System.out.println("1. " + topOne);
            System.out.println("2. " + topTwo);
            System.out.println("3. " + topThree);
            System.out.println("4. " + topFour);
            System.out.println("5. " + topFive);
            System.out.println(" ");
            System.out.println("Type '1' when you want to return to the menu: ");
            goBack = scnr.nextInt();
        }

    }

    public void addWin(String playerName) throws IOException {
        File file = new File("winners.txt");
        PrintWriter writer = new PrintWriter(new FileWriter(file, true));
        writer.println(playerName+",");
        writer.close();
    }

    public int getTotal() throws IOException {
        int wordsCount = 0;

        File file = new File("winners.txt");
        Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {

                String tmpStr = scanner.nextLine();
                if (!tmpStr.equalsIgnoreCase("")) {
                    String replaceAll = tmpStr.replaceAll("\\s+", "");
                    wordsCount += tmpStr.split("\\s+").length;
                }
            }

            return wordsCount;
    }
}
