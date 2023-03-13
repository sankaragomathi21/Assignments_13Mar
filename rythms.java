package function_assignment;

import java.util.Scanner;

public class rythms {
		    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the lower limit of the interval: ");
	        int lower = scanner.nextInt();
	        System.out.print("Enter the upper limit of the interval: ");
	        int upper = scanner.nextInt();

	        printPrimes(lower, upper);
	    }

	    public static void printPrimes(int lower, int upper) {
	        if (lower < 2 || upper < lower) {
	            System.out.println("Invalid input");
	            return;
	        }

	        for (int i = lower; i <= upper; i++) {
	            boolean isPrime = true;
	            for (int j = 2; j <= Math.sqrt(i); j++) {
	                if (i % j == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	            if (isPrime) {
	                System.out.print(i + " ");
	            }
	        }
	    }
}
