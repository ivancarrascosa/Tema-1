package parte2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Declaramos las variables que vamos a utilizar
		//Se va a almacenar la medida en mm
		float medidamm;
		//Se va a almacenar la medida en cm
		float medidacm;
		//Se va a almacenar la medida en m
		float medidam;
		//Creamos el escáner
		Scanner reader = new Scanner(System.in);
		//Pedimos al usuario las distintas medidas
		System.out.println("Introduzca una medida en mm");
		medidamm = reader.nextFloat();
		System.out.println("Introduzca una medida en cm");
		medidacm = reader.nextFloat();
		System.out.println("Introduzca una medida en m");
		medidam = reader.nextFloat();
		//Devolvemos la suma de las medidas en cm
		System.out.println("La suma total son " + (medidamm/10 + medidacm + medidam*100) + " cm");
		//Cerramos el escáner
		reader.close();
	}

}
