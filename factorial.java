package controlflow;

import java.util.Scanner;

public class factorial {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int n = scanner.nextInt();
	        
	        if (n <= 0) {
	            System.out.println("Invalid Input");
	            return;
	        }
	        
	        int factorial = 1;
	        int i = 1;
	        
	        while (factorial < n) {
	            i++;
	            factorial *= i;
	        }
	        
	        if (factorial == n) {
	            System.out.println(n + " is the factorial of " + i);
	        } else {
	            System.out.println("Sorry. The given number is not a perfect factorial");
	        }
	    }
}

