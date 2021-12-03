package com.tylergaston;


import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Menu start = new Menu();
        PlayGame create = new PlayGame();
        HighScore top = new HighScore();

        int choice = 0;
        while (choice != 3) {
            choice = start.startMessage();
            if (choice == 1) {
                create.startNewGame();
            } else if (choice == 2) {
                top.getTop();
            } else if (choice == 3) {
                System.out.println("Good Bye!\n\nProgram Closed...");
            } else {
                System.out.println("Sorry that input is not valid! Try again.");
            }
        }


    }
}
