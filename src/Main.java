import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder program.");
        final int LADDER = 1;
        final int SNAKE = 2;
        int playerPosition = 0;

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
            playerPosition = playerPosition - output;
            System.out.println(" Your status is Snake");
            System.out.println("Your position is :" + playerPosition);

        }
        else
        {
            System.out.println("Your status is no play :");
            System.out.println("Your position is :" + playerPosition);
        }
    }
}