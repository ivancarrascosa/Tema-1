package parte1;

import java.util.*;

public class Ejercicio6 {

	public static void main(String[] args) {
		// declaramos los numeros que vamos a pedir
		double num1;
		double num2;

		Scanner lectura = new Scanner(System.in);
		// pedimos un número y lo asignamos a la variable
		System.out.println("Dime un número");
		num1 = lectura.nextDouble();

		// pedimos el otro número y lo asignamos a la otra variable
		System.out.println("Dime otro número");
		num2 = lectura.nextDouble();
		// Le damos al usuario los resultados de las distintas operaciones
		System.out.println("El resultado de sumar ambos números es " + (num1 + num2));
		System.out.println("El resultado de restar ambos números es " + (num1 - num2));
		System.out.println("El resultado de multiplicar ambos números es " + (num1 * num2));
		System.out.println("El resultado de dividir ambos números es " + (num1 / num2));
		// Cerramos el escáner
		lectura.close();

	}

}
