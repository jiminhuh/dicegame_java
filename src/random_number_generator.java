import java.util.Random;
import java.util.Scanner;

public class random_number_generator {
    public static void main(String[] args) {
        //Setup Scanner
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the maximum Number.");

        // Set Variables
        String maxNum = myObj.nextLine();
        int maxNumInt = Integer.parseInt(maxNum);
        int [] randomArray = new int[maxNumInt];


        // For loop for setting up the array based on max number
        for (int i = 0; i < maxNumInt; i++) {
            randomArray[i] = i + 1;
        }

        // Grab Random Number
        int randomNumber = new Random().nextInt(randomArray.length);
        randomNumber = randomArray[randomNumber];

        // Give back random number
        System.out.println("Your random number is : " + randomNumber);

    }
}
