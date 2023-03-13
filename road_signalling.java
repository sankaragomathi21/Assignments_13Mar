package controlflow;

import java.util.Scanner;

public class road_signalling {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the color: ");
	        String signal = scanner.nextLine().trim().toLowerCase();
	        
	        switch(signal) {
	            case "red":
	                System.out.println("Stop");
	                break;
	            case "yellow":
	                System.out.println("Proceed with caution");
	                break;
	            case "green":
	                System.out.println("Go");
	                break;
	            default:
	                System.out.println("Prepare to go");
	        }
	    }
	}

