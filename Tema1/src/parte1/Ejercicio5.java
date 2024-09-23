package parte1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		float radio;
		double Pi = Math.PI;

		Scanner lectura = new Scanner(System.in);
		// Pedimos al usuario el radio de la circunferencia
		System.out.println("Introduce el radio de la circunferencia");
		// Leemos la consola y guardamos el radio
		radio = lectura.nextFloat();
		// Devolvemos la longitud y el área
		System.out.println(
				"La longitud de la circunferencia es " + (2 * radio * Pi) + "y su área es " + (Pi * radio * radio));
		// Cerramos el escáner
		lectura.close();

	}

}
