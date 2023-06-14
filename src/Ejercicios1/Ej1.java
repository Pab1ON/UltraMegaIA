package Ejercicios1;

import java.util.Scanner;

public class Ej1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce un número:");
		float num1=teclado.nextFloat();
		
		System.out.println("Introduce otro:");
		float num2=teclado.nextFloat();
		
			
		System.out.print(num1+" "+num2);
		
		teclado.close();
	}
}
