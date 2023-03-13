package controlflow;

import java.util.Scanner;

public class primefactors {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a positive integer: ");
	        int num = sc.nextInt();
	        System.out.print("Prime factors of " + num + " are: ");
	        for (int i = 2; i <= num; i++) {
	            while (num % i == 0) {
	                System.out.print(i + " ");
	                num /= i;
	            }
	        }
	        sc.close();
	    }

}
