package Ejercicios1;

import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce tu nombre:");
		String nombre=teclado.nextLine();
			
		System.out.printf("Buenos d�as %s",nombre);
		
		teclado.close();
	}
}
