package controlflow;
import java.util.Random;
import java.util.Scanner;
public class randomnumber {

	    public static void main(String[] args) {
	        Random rand = new Random();
	        int randomNumber = rand.nextInt(100) + 1;
	        int userGuess;
	        Scanner scanner = new Scanner(System.in);
	        
	        do {
	            System.out.print("Guess a number between 1 and 100: ");
	            userGuess = scanner.nextInt();
	            
	            if (userGuess > randomNumber) {
	                System.out.println("Too high, try again.");
	            } else if (userGuess < randomNumber) {
	                System.out.println("Too low, try again.");
	            }
	        } while (userGuess != randomNumber);
	        
	        System.out.println("Yes, you guessed the number.");
	    }
}
