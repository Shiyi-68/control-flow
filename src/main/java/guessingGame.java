import java.util.Scanner;

public class guessingGame {
    public static void main(String[] args) {

        int secret_number = 88;
        System.out.println("Please guess a number, range from 0-100:)");
        Scanner reader = new Scanner(System.in);
        String number_guess = reader.nextLine();
        int guess_number = Integer.parseInt(number_guess);

        if (guess_number == secret_number) {
            System.out.println("Congratulations! You got it!");
        }

        else if (guess_number < secret_number) {
            System.out.println("Too low, make it higher.");
        }

        if (guess_number > secret_number) {
            System.out.println("Too high, make it lower.");
        }

    }
}
