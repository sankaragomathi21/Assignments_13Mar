package controlflow;

import java.util.Scanner;

public class luckynumber {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a four-digit number: ");
	        String input = scanner.next();

	        if (input.matches("\\d{4}")) {
	            int num = Integer.parseInt(input);
	            int sum = 0;
	            while (num > 0) {
	                int digit = num % 10;
	                sum += digit;
	                num /= 10;
	            }
	            if (sum % 3 == 0 || sum % 5 == 0 || sum % 7 == 0) {
	                System.out.println("Your lucky number is: " + input);
	            } else {
	                System.out.println("Sorry, " + input + " is not a lucky number.");
	            }
	        } else {
	            System.out.println("Invalid input. Please enter a valid four-digit number.");
	        }
	    }
	}
