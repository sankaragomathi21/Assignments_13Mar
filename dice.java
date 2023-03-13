package arrays;

import java.util.Scanner;

public class dice {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Arun Dice Choice: ");
	        int[] arunDice = new int[10];
	        for (int i = 0; i < arunDice.length; i++) {
	            arunDice[i] = sc.nextInt();
	        }

	        System.out.print("Naveen Choice: ");
	        int[] naveenDice = new int[10];
	        for (int i = 0; i < naveenDice.length; i++) {
	            naveenDice[i] = sc.nextInt();
	        }

	        int arunTotal = 0;
	        for (int i = 0; i < arunDice.length; i++) {
	            arunTotal += arunDice[i];
	        }

	        int naveenTotal = 0;
	        for (int i = 0; i < naveenDice.length; i++) {
	            naveenTotal += naveenDice[i];
	        }

	        if (arunTotal > naveenTotal) {
	            System.out.println("Arun Wins!!!");
	        } else if (naveenTotal > arunTotal) {
	            System.out.println("Naveen Wins!!!");
	        } else {
	            System.out.println("It's a tie!");
	        }

	        sc.close();
	    }

}
