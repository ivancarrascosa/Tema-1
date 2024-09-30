package parte2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Declaro las variables que voy a utilizar
		int a;
		int b;
		int c;
		int x;
		// Creo el escáner
		Scanner reader = new Scanner(System.in);
		// Pido al usuario que ingrese los valores de las variables
		System.out.println("Dame el valor del coeficiente de grado 2");
		a = reader.nextInt();
		System.out.println("Dame el valor del coeficiente de grado 1");
		b = reader.nextInt();
		System.out.println("Dame el valor del coeficiente de grado 0");
		c = reader.nextInt();
		System.out.println("Dame el valor de la x");
		x = reader.nextInt();
		// Devuelvo el valor de y
		System.out.println("El valor de y es " + ((a * x * x) + b * x + c));
		// Cerramos el escáner
		reader.close();
	}

}

