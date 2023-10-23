package com.bridgelabz;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder program.");
        final int LADDER = 1;
        final int SNAKE = 2;
        int playerPosition = 0;

        while (playerPosition < 100){
            int output=(int)(Math.random() * 6) + 1;
            System.out.println("The dice number is: "+ output);
            int option = (int) Math.floor(Math.random() * 10) % 3;
            if (option == LADDER)
            {
                playerPosition = playerPosition + output;
                System.out.println("Your status is ladder");
                System.out.println("Your position is :" + playerPosition);
            }
            else if (option == SNAKE)
            {
                if (playerPosition > 0 && (playerPosition - output) >= 0) {
                    playerPosition = playerPosition - output;
                    System.out.println(" Your status is Snake");
                    System.out.println("Your Position is :" + playerPosition);
                }
            }
            else
            {
                System.out.println("Your status is no play :");
                System.out.println("Your position is :" + playerPosition);
            }
        }
        System.out.println("Congratulations!");
        System.out.println("You reached the final position!");
        System.out.println("!Game over!");
    }
}