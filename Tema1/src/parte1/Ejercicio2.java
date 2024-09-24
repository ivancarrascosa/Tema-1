package parte1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int número = 0;
		Scanner lectura = new Scanner(System.in);
		// 1º Pedimos la edad al usuario
		System.out.println("Dime tu edad");
		// 2º Leemos el número que se introduce en la consola
		número = lectura.nextInt();
		// 3º Le sumamos 1 al número que nos ha dado
		System.out.println("Tu edad el próximo año será " + ++número);
		// Cerramos el escáner
		lectura.close();
	}

}
