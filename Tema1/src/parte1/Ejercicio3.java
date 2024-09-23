package parte1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		int añoNacimiento;
		int añoActual;

		Scanner lectura = new Scanner(System.in);
		//Preguntamos al usuario en qué año estamos
		System.out.println("¿En qué año estamos?");
		//Leemos el número introducido en la conosla
		añoActual = lectura.nextInt();
		//Borramos el contenido de la consola
		lectura.nextLine();
		//Preguntamos al usuario en que año nació
		System.out.println("¿En qué año naciste?");
		/Leemos el número introducido en la consola
		añoNacimiento = lectura.nextInt();
		//Calculamos la edad y la devolvemos al usuario
		System.out.println("Tu edad es" + " " + (añoActual - añoNacimiento));
		//cerramos escáner
		lectura.close();

	}

}
