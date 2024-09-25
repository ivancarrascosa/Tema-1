package parte1;

import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
		// Declaro las variables que voy a utilizar
		boolean llueve;
		boolean tareas;
		boolean biblioteca;
		// creo el escáner
		Scanner reader = new Scanner(System.in);
		// Le pido al usuario la información que necesito
		System.out.println("¿Está lloviendo?");
		llueve = reader.nextBoolean();
		System.out.println("Has finalizado tus tareas");
		tareas = reader.nextBoolean();
		System.out.println("¿Necesitas ir a la biblioteca?");
		biblioteca = reader.nextBoolean();
		// Devuelvo si puede salir a la calle o no
		System.out.println((!llueve) && tareas || biblioteca);
		// Cerramos el escáner
		reader.close();
	}

}
