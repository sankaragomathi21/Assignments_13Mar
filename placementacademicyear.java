package function_assignment;

import java.util.Scanner;

public class placementacademicyear {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter number of placements for CS department: ");
	        int csPlacements = sc.nextInt();
	        
	        System.out.print("Enter number of placements for EC department: ");
	        int ecPlacements = sc.nextInt();
	        
	        System.out.print("Enter number of placements for ME department: ");
	        int mePlacements = sc.nextInt();
	        
	        String department = findDepartmentWithMaxPlacements(csPlacements, ecPlacements, mePlacements);
	        System.out.println(department);
	        
	        sc.close();
	    }
	    
	    public static String findDepartmentWithMaxPlacements(int csPlacements, int ecPlacements, int mePlacements) {
	        if (csPlacements < 0 || ecPlacements < 0 || mePlacements < 0) {
	            return "Input is invalid";
	        }
	        
	        if (csPlacements == ecPlacements && ecPlacements == mePlacements) {
	            return "None of the department has got the highest placement";
	        }
	        
	        if (csPlacements >= ecPlacements && csPlacements >= mePlacements) {
	            return "CS";
	        } else if (ecPlacements >= csPlacements && ecPlacements >= mePlacements) {
	            return "EC";
	        } else {
	            return "ME";
	        }
	    }
	}