import java.util.Random;
import java.util.Scanner;

public class random_number_generator {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the maximum Number.");

        String maxNum = myObj.nextLine();
        int maxNumInt = Integer.parseInt(maxNum);
        int [] randomArray = new int[maxNumInt];

        for (int i = 0; i < maxNumInt; i++) {
            randomArray[i] = i + 1;
        }

        int randomNumber = new Random().nextInt(randomArray.length);
        randomNumber = randomArray[randomNumber];

        System.out.println("Your random number is : " + randomNumber);

    }
}
