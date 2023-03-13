package function_assignment;

import java.util.Scanner;

public class lowerupperbound {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower bound: ");
        int lower = scanner.nextInt();
        System.out.print("Enter the upper bound: ");
        int upper = scanner.nextInt();

        int oddSum = findOddSum(lower, upper);
        int evenSum = findEvenSum(lower, upper);

        System.out.println("Sum of odd numbers: " + oddSum);
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Absolute difference: " + Math.abs(oddSum - evenSum));
    }

    public static int findOddSum(int lower, int upper) {
        int sum = 0;
        for (int i = lower; i <= upper; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int findEvenSum(int lower, int upper) {
        int sum = 0;
        for (int i = lower; i <= upper; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

}
