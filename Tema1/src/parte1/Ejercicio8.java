package parte1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Declaramos las variables que vamos a usar
		String nombre;
		int edad;
		// Creamos el escáner
		Scanner lectura = new Scanner(System.in);
		// Le pedimos al usuario la información necesaria y la asignamos a las variables
		System.out.println("¿Cual es tu nombre?");
		nombre = lectura.nextLine();
		System.out.println("¿Cuántos años tienes?");
		edad = lectura.nextInt();
		// Le damos al usuario lo que se nos solicita
		System.out.println("Hola " + nombre + ". Tienes " + edad + " años, ¡qué mayor eres!");
		// cerramos el escaner
		lectura.close();
	}

}
