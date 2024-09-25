package parte1;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// declaro las variables que voy a utilizar
		int primerTrim;
		int segunTrim;
		int tercerTrim;
		double primerTrimd;
		double segunTrimd;
		double tercerTrimd;
		// creo el escáner
		Scanner reader = new Scanner(System.in);
		// Solicito al usuario las notas
		System.out.println("Dime tu nota del primer trimestre");
		primerTrim = reader.nextInt();
		primerTrimd = primerTrim;
		System.out.println("Dime tu nota del segundo trimestre");
		segunTrim = reader.nextInt();
		segunTrimd = segunTrim;
		System.out.println("Dime tu nota del tercer trimestre");
		tercerTrim = reader.nextInt();
		tercerTrimd = tercerTrim;
		// muestro en la consola ambas medias
		System.out.println("La nota del boletín será " + ((primerTrim + segunTrim + tercerTrim) / 3)
				+ " y la nota del expediente será " + ((primerTrimd + segunTrimd + tercerTrimd) / 3));
		// Cierro el escáner
		reader.close();

	}

}
