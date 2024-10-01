package parte2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Declaramos la variable que vamos a utilizar, que son los metros lanzados
		double metrosLanzados;
		// Creamos el escáner
		Scanner reader = new Scanner(System.in);
		// Pedimos al usuario la distancia en metros que se ha lanzado
		System.out.println("Introduzca la longitud del lanzamiento en metros");
		metrosLanzados = reader.nextDouble();
		// Devolvemos la parte entera de la longitud del lanzamiento en centímetros
		System.out.println("La parte entera de la distancia en centímetros es " + (int) (metrosLanzados * 100) + " cm");
		//cerramos el escáner
		reader.close();
	}

}
