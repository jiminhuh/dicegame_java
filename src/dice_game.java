import java.util.Random;
import java.util.Scanner;

public class dice_game {
    public static void main(String[] args) {
        int[] dice = {1, 2, 3, 4, 5, 6};


        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter name to roll the dice.");

        String userName = myObj.nextLine();

        int randomNumber = new Random().nextInt(dice.length);
        randomNumber = dice[randomNumber];

        System.out.println("Hello " + userName + ", your number is " + randomNumber);
        System.out.println("Thanks for Playing!");

    }
}
