package englishexercisestema2;

public class Exercise05 {

	public static void main(String[] args) {
		
// Create the scanner
Scanner sc = new Scanner(System.in);

// Create variables
int v = 0;
int t = 0;
int d = 0;
String dato;

// Ask the user to introduce a type of data 
System.out.println("Introduce V/D/T: ");
//And read it
dato = sc.next().toUpperCase();
//Then ask the user for each value of each data
System.out.println("Valor:");
switch (dato) {
    case "V" -> { v = sc.nextInt(); }
    case "D" -> { d = sc.nextInt(); }
    case "T" -> { t = sc.nextInt(); }
    default -> { System.out.println("Letra incorrecta"); }
}
//Then ask the user for the second value of another data
System.out.println("Introduce V/D/T: ");
dato = sc.next().toUpperCase();
System.out.println("Valor:");
switch (dato) {
    case "V" -> { v = sc.nextInt(); }
    case "D" -> { d = sc.nextInt(); }
    case "T" -> { t = sc.nextInt(); }
    default -> { System.out.println("Letra incorrecta"); }
}

// Make another condition to calculate missing value and print the according result of each value
if (v != 0 && d != 0) {
    t = d / v;
    System.out.println("RESULTADO: T = " + t);
} else if (v != 0 && t != 0) {
    d = v * t;
    System.out.println("RESULTADO: D = " + d);
} else if (d != 0 && t != 0) {
    v = d / t;
    System.out.println("RESULTADO: V = " + v);
} else {

    System.out.println("Datos insuficientes para calcular el resultado.");
}

//Close the scanner
sc.close();
