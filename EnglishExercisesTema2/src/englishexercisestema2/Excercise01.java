package englishexercisestema2;

import java.util.Scanner;

public class Excercise01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Constants for the price of the products
        final double SYSTEM = 375.99;
        final double BIGSCREEN = 99.99;
        final double SMALLSCREEN = 75.99;
        final double ANTIVIRUS = 65.99;
        final double PRINTER = 99.99;

        //Variables for the elections
        char eleccion1;
        char eleccion2;
        char eleccion3;
        
        // Variables for the selected products
        double product1 = 0;
        double product2 = 0;
        double product3 = 0;

        // Show the user the first products to choose between
        System.out.println("Pedido de ordenadores y complementos. Seleccione los artículos a comprar.");
        System.out.println("Ordenador con sistema base = " + SYSTEM);
        System.out.println("Elija una de las siguientes opciones:");
        System.out.println("A) Pantalla de 38cm = " + SMALLSCREEN);
        System.out.println("B) Pantalla de 43cm = " + BIGSCREEN);

        // And read the first election of the user 
        System.out.print("Opción: ");
        eleccion1 = sc.next().toUpperCase().charAt(0);

        //Now make a condition to know the first product
        switch (eleccion1) {
            case 'A':
                System.out.println("Has elegido el monitor de 38cm.");
                product1 = SMALLSCREEN;
                break;
            case 'B':
                System.out.println("Has elegido el monitor de 43cm.");
                product1 = BIGSCREEN;
                break;
            default:
                System.out.println("La opción introducida no se contempla en la lista.");
        }

        // We ask if the user want extras
        System.out.println("\nAlgunos extras para añadir a tu compra:");
        System.out.println("A) Antivirus = " + ANTIVIRUS);
        System.out.println("B) Impresora = " + PRINTER);
        System.out.print("Opción: ");
        eleccion2 = sc.next().toUpperCase().charAt(0);
        
        //And another condition to know the extra products
        switch (eleccion2) {
            case 'A':
                System.out.println("Has elegido el antivirus.");
                product2 = ANTIVIRUS;
                break;
            case 'B':
                System.out.println("Has elegido la impresora.");
                product2 = PRINTER;
                break;
            default:
                System.out.println("La opción introducida no se contempla en la lista.");
        }

        // Third optional election 
        System.out.println("\n¿Deseas añadir el otro extra?");
        System.out.print("Introduce S (sí) o N (no): ");
        eleccion3 = sc.next().toUpperCase().charAt(0);

        //Another conditional to know if the user wants to add the last item
        if (eleccion3 == 'S') {
            if (product2 == ANTIVIRUS) {
                product3 = PRINTER;
                System.out.println("Has añadido la impresora.");
            } else if (product2 == PRINTER) {
                product3 = ANTIVIRUS;
                System.out.println("Has añadido el antivirus.");
            }
        }

        // Operation to get the total price
        double total = SYSTEM + product1 + product2 + product3;
        System.out.printf("%nEl total de tu compra es: %.2f €%n", total);

        //Close the scanner
        sc.close();
    }
}
