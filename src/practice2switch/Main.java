package practice2switch;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("What weekday do we have?");
        
        // ask for weekday
        Scanner scanner = new Scanner(System.in);
        String weekday = scanner.nextLine();

        // ask for age
        System.out.println("Type in your age");
        int age = Integer.parseInt(scanner.nextLine());
        
        // variable to decide
        boolean isWeekday= false;
        
        // decision list
        switch (weekday) {
        // MON-FRI is weekday
        	case "MON": 
        	case "TUE":
        	case "WED":
        	case "THU":
        	case "FRI": isWeekday = true;
            // leave switch
        	break;
            // SAT-SUN is weekend
        	case "SAT": 
        	case "SUN": isWeekday = false;
            // leave switch
        	break;
            // when no case matches
        	default: System.out.println("Weekday unknown");
        	// leave main function - terminate program
        	return;
        }
        // handle weekday or not
        if (isWeekday) {
        	// handle age
        	if (age < 18) {
            	System.out.println("Go to school");
        	} else {
        		System.out.println("Go to work");
        	}

        } else {
        	System.out.println("Relax");
        }

        
        
    }
}
