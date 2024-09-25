package parte1;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// declaro la variable que voy a utilizar
		double pesetas;
		// creo el escáner
		Scanner lectura = new Scanner(System.in);
		// pido al usuario que introduzca los euros que quiere convertir
		System.out.println("Introduce las pesetas que quieres convertir");
		pesetas = lectura.nextDouble();
		// mostramos en pantalla cuantas pesetas eran esos euros
		System.out.println(pesetas + "€ son " + (pesetas / 166) + " euros");
		// cierro el escáner
		lectura.close();

	}
}
