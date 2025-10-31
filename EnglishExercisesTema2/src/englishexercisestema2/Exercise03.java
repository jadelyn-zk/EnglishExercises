package englishexercisestema2;

import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		
		//Create the scanner
		Scanner sc = new Scanner(System.in);

		// Variables for hours and minutes
		int hours;
		int minutes;

		int realHours;
		int realMinutes;

		// Ask the user for the hour in the mirror
		System.out.println("Introduce la hora vista en el espejo: ");
		hours = sc.nextInt();
		// Ask the user for the minutes in the mirror
		System.out.println("Introduce los minutos vistos en el espejo: ");
		minutes = sc.nextInt();

		// Condition if the mirror time is exactly 12:00
		if (hours == 12 && minutes == 0) {
			realHours = 12;
			realMinutes = 0;
		}
		// If minutes are 0, just subtract hours from 12
		else if (minutes == 0) {
			realHours = 12 - hours;
			realMinutes = 0;
			if (realHours == 0) {
				realHours = 12;
			}
		}
		// For all other cases
		else {
			realMinutes = 60 - minutes;
			realHours = 11 - (hours - 1);
			if (realHours <= 0) {
				realHours += 12;
			}
		}

		// Print the real time in HH:MM format (with leading zeros)
		System.out.printf("La hora real son las " + realHours + ":" + realMinutes);

		sc.close();
	}
}
