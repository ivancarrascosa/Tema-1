package parte2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Declaramos las variables que vamos a utilizar
		int segundos;
		int minutos;
		int horas;
		//Esta variable es para devolver los segundos sin los que han entrado
		int finalSegundos;
		// Creamos el escáner
		Scanner reader = new Scanner(System.in);
		// Pedimos al usuario los segundos
		System.out.println("Número de segundos que quiere transformar");
		// Calculamos las horas y minutos que serían mediante módulos y divisiones
		segundos = reader.nextInt();
		minutos = (int) (segundos / 60);
		finalSegundos = segundos % 60;
		horas = (int) (minutos / 60);
		minutos %= 60;
		// Devolvemos el resultado
		System.out.println(
				"Los segundos dados son " + horas + " horas " + minutos + " minutos " + finalSegundos + " segundos.");
		// Cerramos el escáner"
		reader.close();

	}

}
