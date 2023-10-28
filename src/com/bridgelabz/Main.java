package com.bridgelabz;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder program.");
        final int LADDER = 1;
        final int SNAKE = 2;
        int player1Position = 0;
        int player2Position = 0;
        int currentPlayer = 1;
        int count1 = 0;
        int count2 = 0;

        while (player1Position < 100 && player2Position < 100) {
            int output = (int)(Math.random() * 6) + 1;
            if (currentPlayer == 1) {
                count1++;
                System.out.println("Player 1, the dice number is: " + output);
            } else {
                count2++;
                System.out.println("Player 2, the dice number is: " + output);
            }

            int option = (int) Math.floor(Math.random() * 10) % 3;

            if (option == LADDER) {
                if (currentPlayer == 1 && player1Position + output <= 100) {
                    player1Position += output;
                    System.out.println("Player 1, Your status is Ladder");
                    System.out.println("Player 1, Your Position is: " + player1Position);
                } else if (currentPlayer == 2 && player2Position + output <= 100) {
                    player2Position += output;
                    System.out.println("Player 2, Your status is Ladder");
                    System.out.println("Player 2, Your Position is: " + player2Position);
                }
            } else if (option == SNAKE) {
                if (currentPlayer == 1 && player1Position > 0 && (player1Position - output) >= 0) {
                    player1Position -= output;
                    System.out.println("Player 1, Your status is Snake");
                    System.out.println("Player 1, Your Position is: " + player1Position);
                } else if (currentPlayer == 2 && player2Position > 0 && (player2Position - output) >= 0) {
                    player2Position -= output;
                    System.out.println("Player 2, Your status is Snake");
                    System.out.println("Player 2, Your Position is: " + player2Position);
                }
            } else {
                if (currentPlayer == 1) {
                    System.out.println("Player 1, Your status is no play :");
                    System.out.println("Player 1, Your position is: " + player1Position);
                } else {
                    System.out.println("Player 2, Your status is no play :");
                    System.out.println("Player 2, Your position is: " + player2Position);
                }
            }

            // Switch to the other player's turn
            currentPlayer = (currentPlayer == 1) ? 2 : 1;
        }

        if (player1Position >= 100) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }

        System.out.println("Total number of times dice is played for Player 1: " + count1);
        System.out.println("Total number of times dice is played for Player 2: " + count2);
        System.out.println("Congratulations!");
        System.out.println("Game over!");
    }
}