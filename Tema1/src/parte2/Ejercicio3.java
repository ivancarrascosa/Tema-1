package parte2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// declaro las variables que voy a utilizar
		int num1;
		int num2;
		// Creo el escáner
		Scanner reader = new Scanner(System.in);
		// Pido al usuario los dos números y los guardo
		System.out.println("Dime un número");
		num1 = reader.nextInt();
		System.out.println("Dime otro número");
		num2 = reader.nextInt();
		// Calculamos cuanto hay que sumarle al primero para que sea múltiplo y lo devolvemos
		System.out.println(num1 % num2 == 0 ? "El primer número dado es múltiplo del segundo"
				: "Hay que sumarle " + (num2 - 1 % 2) + " al primer número para que sea múltiplo del segundo.");
		//Cerramos el escáner
		reader.close();

	}

}
