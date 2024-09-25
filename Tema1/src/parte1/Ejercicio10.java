package parte1;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		// declaramos la variable que vamos a utilizar
		int num;
		// Creo el escáner
		Scanner lectura = new Scanner(System.in);
		// Le pedimos al usuario un número y lo asignamos a la variable
		System.out.println("Dime un número");
		num = lectura.nextInt();
		/*Devolvemos el booleano que corresponde a si ese número módulo 2 es 0 o no lo
		es*/
		System.out.println(num % 2 == 0);
		//Cerramos el escáner
		lectura.close();
	}

}
