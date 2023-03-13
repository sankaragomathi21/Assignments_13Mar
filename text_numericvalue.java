package controlflow;
import java.util.Scanner;

public class text_numericvalue {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter numerical value: ");
	        int value = scanner.nextInt();

	        String text;

	        if (value >= 0 && value <= 4) {
	            text = "Fail";
	        } else if (value == 5) {
	            text = "Approved";
	        } else if (value == 6) {
	            text = "Good";
	        } else if (value == 7 || value == 8) {
	            text = "Notable";
	        } else if (value == 9 || value == 10) {
	            text = "Excellent";
	        } else {
	            text = "Invalid";
	        }

	        System.out.println(text);
	    }

}
