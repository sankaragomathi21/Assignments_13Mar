package function_assignment;

import java.util.Scanner;

public class appraisalrating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();
        
        System.out.print("Enter appraisal rating (between 1 and 10): ");
        double rating = sc.nextDouble();
        
        double incrementedSalary = calculateIncrementedSalary(salary, rating);
        if (incrementedSalary == -1) {
            System.out.println("Invalid Input");
        } else {
            System.out.println("Incremented salary: " + incrementedSalary);
        }
        
        sc.close();
    }
    
    public static double calculateIncrementedSalary(double salary, double rating) {
        if (salary <= 0 || rating < 1 || rating > 10) {
            return -1;
        }
        
        if (rating >= 1 && rating <= 4) {
            return salary * 1.1;
        } else if (rating > 4 && rating <= 7) {
            return salary * 1.25;
        } else if (rating > 7 && rating <= 10) {
            return salary * 1.3;
        }
        
        return -1;
    }

}
