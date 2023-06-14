package Ejercicios1;

import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce un número:");
		int num=teclado.nextInt();
			
		System.out.printf("El doble de %d es %d, y el triple %d",num,num*2,num*3);
		
		teclado.close();
	}
}
