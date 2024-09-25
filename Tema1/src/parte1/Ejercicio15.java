package parte1;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// Declaramos las variables que vamos a utilizar y la constante del IVA
		final int IVA = 21;
		float precio;
		float IVApercentage = (float) IVA/100;
		//Creamos el escáner
		Scanner reader = new Scanner(System.in);
		//Pedimos al usuario el precio 
		System.out.println("Dime el precio que quieres calcular con IVA");
		precio = reader.nextFloat();
		System.out.println("El precio con el IVA incluido es " + (precio+precio*IVApercentage));
		//Cerramos el escaner
		reader.close();
		

	}

}
