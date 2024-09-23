package parte1;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		float nota1;
		float nota2;
		Scanner lectura = new Scanner(System.in);
		//Pedimos al usuario una de las notas
		System.out.println("Dime una nota");
		nota1 = lectura.nextFloat();
		lectura.nextLine();
		//Pedimos al usuario la otra nota
		System.out.println("Dime otra nota");
		nota2 = lectura.nextFloat();
		//Calculamos la media aritmética de ambas y se la devolvemos al usuario 
		System.out.println("La media aritmética de las notas es " + ((nota1 + nota2) / 2));
		//cerramos el escáner
		lectura.close();
	}
}
