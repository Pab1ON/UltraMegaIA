package Ejercicios1;

import java.util.Scanner;

public class Ej4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce los grados cent�grados:");
		float grados=teclado.nextFloat();
		
		float faren=32+(9*grados/5);
			
		System.out.printf("%.2f C son %.2f F",grados,faren);
		
		teclado.close();
	}
}
