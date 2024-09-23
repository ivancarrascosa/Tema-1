package parte1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		// creamos el escáner
		Scanner lectura = new Scanner(System.in);
		// variable donde almacenar el número
		int número = 0;
		// 1º pedimos un número al usuario
		System.out.println("Introduce un número");
		// 2º Leemos el número de la consola
		número = lectura.nextInt();
		// 3º Mostramos el número introducido por el usuario
		System.out.println("El número introducido es" + número);
		// Cerramos el escáner
		lectura.close();

	}

}
