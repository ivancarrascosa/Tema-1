package parte2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Declaro la variable que voy a utilizar
		double numero;
		double numerox10;
		int respuesta;
		// Creo el escáner
		Scanner reader = new Scanner(System.in);
		// Pido al usuario que me de el número con decimales
		System.out.println("Dame un número con decimales");
		numero = reader.nextDouble();
		numerox10 = numero * 10;
		respuesta = numerox10 % 10 < 5 ? (int) numero : (int) numero + 1;
		// muestro la respuesta
		System.out.println(respuesta);
		// Cierro el escáner
		reader.close();

	}

}
