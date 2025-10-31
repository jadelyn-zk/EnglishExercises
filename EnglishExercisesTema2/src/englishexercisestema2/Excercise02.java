package englishexercisestema2;

import java.util.Scanner;

public class Excercise02 {

	public static void main(String[] args) {

		// Create scanner
		Scanner sc = new Scanner(System.in);

		/*
		 * amount of money that can be earned in one year as interest on that money
		 */

		// VARIABLE FOR interest
		double interes=0;

		// Another for the selected bank
		String selectedBank;

		// And for the amount of money the user wants to deposit in the bank
		double money;
		// Ask the user he amount of money to deposit
		System.out.println("Introduce la cantidad de dinero a meter al banco: ");
		money = sc.nextDouble();

		// Now ask for which type of account 
		System.out.println("Elije el tipo de cuenta: "
				+ "\n A) Tipo A -> Con 1.5% de interés"
				+ "\n B) Tipo B -> Con 2% de interés"
				+ "\n C) Tipo C -> Con 1.5% de interés"
				+ "\n X) Tipo X -> Con 5% de interés");
		//And read the answer
		selectedBank = sc.next();
	
		switch (selectedBank) {
		case "A" -> interes = (money*0.015);
		case "B" -> interes = (money*0.02);
		case "C" -> interes = (money*0.015);
		case "X" -> interes = (money*0.05);
		
		default -> System.out.println("ERROR. La opción introducida no está en la lista");
		};
		
		if (interes>0) {
		//Print the solution
		System.out.println("El interés es de " + interes + ". Al año cobrarías " + (money-interes)); 
		
		// close the scanner
		sc.close();
		}
	}
}
