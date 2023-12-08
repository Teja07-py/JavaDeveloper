import java.util.Random;
import java.util.Scanner;

public class Numgame {
    public static void main(String[] args) {
        Random x= new Random();
        int numberToGuess = x.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess,count=0;

        System.out.println("Let's play!");
        System.out.println("Guess a number between 1 and 100:");

        while (true) {
            guess = scanner.nextInt();
		count++;
            if (guess == numberToGuess) {
                System.out.println("Hurray, you guessed it right! \nNo.of Trails:- "+count);
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is greater than the number. Another try: ");
            } else {
                System.out.println("Your guess is less than the number. Another try: ");
            }
		
        }
                System.out.println("");

        scanner.close();
    }
}