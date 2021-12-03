package com.tylergaston;

import java.util.Scanner;

public class Menu { //For any program startup logic

    public int startMessage() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("████████╗██╗░█████╗░████████╗░█████╗░░█████╗░████████╗░█████╗░███████╗  ██╗░░░██╗░░███╗░░░░░░█████╗░");
        System.out.println("╚══██╔══╝██║██╔══██╗╚══██╔══╝██╔══██╗██╔══██╗╚══██╔══╝██╔══██╗██╔════╝  ██║░░░██║░████║░░░░░██╔══██╗");
        System.out.println("░░░██║░░░██║██║░░╚═╝░░░██║░░░███████║██║░░╚═╝░░░██║░░░██║░░██║█████╗░░  ╚██╗░██╔╝██╔██║░░░░░██║░░██║");
        System.out.println("░░░██║░░░██║██║░░██╗░░░██║░░░██╔══██║██║░░██╗░░░██║░░░██║░░██║██╔══╝░░  ░╚████╔╝░╚═╝██║░░░░░██║░░██║");
        System.out.println("░░░██║░░░██║╚█████╔╝░░░██║░░░██║░░██║╚█████╔╝░░░██║░░░╚█████╔╝███████╗  ░░╚██╔╝░░███████╗██╗╚█████╔╝");
        System.out.println("░░░╚═╝░░░╚═╝░╚════╝░░░░╚═╝░░░╚═╝░░╚═╝░╚════╝░░░░╚═╝░░░░╚════╝░╚══════╝  ░░░╚═╝░░░╚══════╝╚═╝░╚════╝░");
        System.out.println("\uD83C\uDDE7\u200B\u200B\u200B\u200B\u200B\uD83C\uDDFE\u200B\u200B\u200B\u200B\u200B \uD83C\uDDF9\u200B\u200B\u200B\u200B\u200B\uD83C\uDDFE\u200B\u200B\u200B\u200B\u200B\uD83C\uDDF1\u200B\u200B\u200B\u200B\u200B\uD83C\uDDEA\u200B\u200B\u200B\u200B\u200B\uD83C\uDDF7\u200B\u200B\u200B\u200B\u200B \uD83C\uDDEC\u200B\u200B\u200B\u200B\u200B\uD83C\uDDE6\u200B\u200B\u200B\u200B\u200B\uD83C\uDDF8\u200B\u200B\u200B\u200B\u200B\uD83C\uDDF9\u200B\u200B\u200B\u200B\u200B\uD83C\uDDF4\u200B\u200B\u200B\u200B\u200B\uD83C\uDDF3\u200B\u200B\u200B\u200B\u200B\n");
        System.out.println("Menu:");
        System.out.println("1) Start New Game");
        System.out.println("2) View Total Played Games");
        System.out.println("3) Exit\n");
        System.out.println("Type a number for what you would like to do: ");
        return scnr.nextInt();
    }


}
