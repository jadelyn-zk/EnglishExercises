package englishexercisestema2;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/*
		 * My grandfather owns a small shop and sometimes he asks me to help him, but
		 * I’m not very good at maths, so I need a program to calculate the changes.
		 * This program must calculate the changes with the least number of coins.
		 * Input: Two numbers. The first number is the quantity that the client must
		 * pay, and the second number is the quantity that the client gives me. Both
		 * numbers are cents of euro. Output: A list of numbers that represent the
		 * quantity of coins of 2 euros, 1 euro, 50 cts, 20 cts, 10 cts, 5 cts, 2 cts
		 * and 1 cent that I have to give to the client.
		 */

		// Variable for the price to pay (cents)
		int price;
		// Variable for the money the client gives
		int money;
		//Variable for the change
		int change;
		//Then some variables for each quantity of each type of coin
		int c2=0;
		int c1=0;
		int c050=0;
		int c020=0;
		int c010=0;
		int c005=0;
		int c002=0;
		int c001=0;
		
		// Ask the user to introduce the price to pay
		System.out.println("Precio a pagar:");
		// And read it
		price = sc.nextInt();
		
		// Ask the user to introduce the price to pay
		System.out.println("Dinero entregado por el cliente:");
		// And read it
		money = sc.nextInt();
		
		//Operation to get the change
		change = money - price;
		
		if (change>=200) {
			c2=change/200;
			change=change%200;
		} 
		if (change>=100) {
			c1=change/100;
			change=change%100;
		}
		if (change>=50) {
			c050=change/50;
			change=change%50;
		}
		if (change>=20) {
			c020=change/20;
			change=change%20;
		}
		if (change>=10) {
			c010=change/10;
			change=change%10;
		}
		if (change>=5) {
			c005=change/5;
			change=change%5;
		}
		if (change>=2) {
			c002=change/2;
			change=change%2;
		}
		if (change>=1) {
			change=change%1;
		}
		
		System.out.println("El cambio a entregar es de \n"
				+ c2 + " Monedas de 2€, \n "
				+ c1 + " Monedas de 1€, \n "
				+c050+ " Monedas de 50cent,\n "
				+c020+ " Monedas de 20cent,\n "
				+c010+ " Monedas de 10cent,\n "
				+c005+ " Monedas de 5cent,\n "
				+c002+ " Monedas de 2cent,\n "
				+c001+ " Monedas de 1cent,\n ");

		sc.close();
	}

}
