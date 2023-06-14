package Ejercicios1;

import java.util.Scanner;

public class Ej4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce los grados centígrados:");
		float grados=teclado.nextFloat();
		
		float faren=32+(9*grados/5);
			
		System.out.printf("%.2fºC son %.2fºF",grados,faren);
		
		teclado.close();
	}
}
