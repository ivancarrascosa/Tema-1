package parte2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//declaro las variables que voy a utilizar
		int numero;
		//Creo el escáner
		Scanner reader = new Scanner(System.in);
		//Pido al usuario el número
		System.out.println("Dime un número");
		//Guardo el número
		numero = reader.nextInt();
		//le resto a 7 el número que me ha dado el usuario módulo 7
		System.out.println("Hay que sumarle " + (numero%7== 0 ? 0 :7 - numero%7) + " para que sea múltiplo de 7.");
		//Cierro el escáner
		reader.close();
		
	}

}
