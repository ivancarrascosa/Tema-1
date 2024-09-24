package parte1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Declaramos las variables
		String Nombre;
		String Calle;
		int Tlf;
		// Creamos el escáner
		Scanner lectura = new Scanner(System.in);
		// Le pedimos al usuario la información y se las vamos asignando a las variables
		System.out.println("¿Cuál es tu nombre?");
		Nombre = lectura.nextLine();
		System.out.println("¿Cuál es tu dirección?");
		Calle = lectura.nextLine();
		System.out.println("¿Cuál es tu número de teléfono?");
		Tlf = lectura.nextInt();
		// Devolvemos al usario la información dada
		System.out.println("Nombre: " + Nombre);
		System.out.println("Dirección: " + Calle);
		System.out.println("Teléfono: " + Tlf);
		// cerramos el escáner
		lectura.close();

	}

}
