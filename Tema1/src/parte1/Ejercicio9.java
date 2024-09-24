package parte1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// declaramos las variables que vamos a usar
		int edad;
		// Creamos el escáner
		Scanner lectura = new Scanner(System.in);
		// Le preguntamos al usuario su edad
		System.out.println("¿Cuántos años tienes?");
		edad = lectura.nextInt();
		// Le decimos si es o no mayor de edad, haciendo que haga print de true o false
		// si su edad es mayor o igual a 18
		System.out.println(edad >= 18);
		// Cerramos el escáner
		lectura.close();

	}

}
