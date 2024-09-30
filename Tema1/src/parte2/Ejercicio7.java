package parte2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Declaramos las variables que vamos a utilizar
		final float PRECIOENTRADASINFANTILES = 15.50f;
		final int PRECIOENTRADASADULTOS = 20;
		int numeroEntradasInfantiles;
		int numeroEntradasAdultos;
		double precioTotal;
		// Creamos el escáner
		Scanner reader = new Scanner(System.in);
		// Pedimos al usuario que introduzca el número de entradas y las guardamos
		System.out.println("Introduce el número de entradas infantiles que deseas.");
		numeroEntradasInfantiles = reader.nextInt();
		System.out.println("Introduce el número de entradas infantiles que deseas.");
		numeroEntradasAdultos = reader.nextInt();
		// calculamos el precio total
		precioTotal = numeroEntradasInfantiles * PRECIOENTRADASINFANTILES
				+ numeroEntradasAdultos * PRECIOENTRADASADULTOS;
		// Con un ternario veremos si aplicamos o no el descuento
		precioTotal = precioTotal >= 100 ? precioTotal * 0.95 : precioTotal;
		// Devolvemos el precio total
		System.out.println("El precio final son " + precioTotal + " euros.");
		// Cerramos el escáner
		reader.close();

	}

}
