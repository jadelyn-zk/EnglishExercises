package englishexercisestema2;

public class Exercise05 {

	public static void main(String[] args) {
		
//Create scanner
		Scanner sc = new Scanner(System.in);

		// Create the variables 
        String type1, type2;
        double value1, value2;
        double V = 0, D = 0, T = 0;

        // Ask for first type and value
        System.out.print("Introduce el tipo de dato: ");
        type1 = sc.nextLine().toUpperCase();

        System.out.print("Introduce el valor de ese dato: ");
        value1 = sc.nextDouble();
        sc.nextLine(); 

        // Then for second type and value
        System.out.print("Dime otro tipo de dato (V, D, T): ");
        type2 = sc.nextLine().toUpperCase();

        System.out.print("Dime el valor de ese dato: ");
        value2 = sc.nextDouble();

        // Calculate the missing value
        if ((type1.equals("V") && type2.equals("D")) || (type1.equals("D") && type2.equals("V"))) {
            // Missing T
            if (type1.equals("V")) {
                V = value1;
                D = value2;
            } else {
                V = value2;
                D = value1;
            }
            T = D / V;
            System.out.println("RESULT: T = " + T);
        } 
        else if ((type1.equals("V") && type2.equals("T")) || (type1.equals("T") && type2.equals("V"))) {
           
       // Missing D
            if (type1.equals("V")) {
                V = value1;
                T = value2;
            } else {
                V = value2;
                T = value1;
            }
            D = V * T;
            System.out.println("RESULT: D = " + D);
        } 
        else if ((type1.equals("D") && type2.equals("T")) || (type1.equals("T") && type2.equals("D"))) {
           
        // Missing V
            if (type1.equals("D")) {
                D = value1;
                T = value2;
            } else {
                D = value2;
                T = value1;
            }
            V = D / T;
            System.out.println("RESULT: V = " + V);
        } 
        else {
            System.out.println("Invalid input. You must give two different types.");
        }

        sc.close();
    }
}