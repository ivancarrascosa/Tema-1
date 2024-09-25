package parte1;

import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
		// declaro las variables que voy a usar
		double kgman;
		double kgper;
		// Creo el escáner
		Scanner reader = new Scanner(System.in);
		// Solicito al usuario los kilos de manzanas y peras vendidas y lo guardo con
		// las variables
		System.out.println("Dime los kilos de manzanas vendidos");
		kgman = reader.nextDouble();
		System.out.println("Dime los kilos de peras vendidos");
		kgper = reader.nextDouble();
		// Muestro en la consola el total de euros que se han ganado
		System.out.println((kgman * 2.35 + kgper * 1.95) + "€");
		// cerramos el escáner
		reader.close();

	}
}
