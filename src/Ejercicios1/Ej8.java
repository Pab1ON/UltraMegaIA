package Ejercicios1;

import java.util.Scanner;

public class Ej8 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce el radio");
		float radio=teclado.nextFloat();
		
		double volumen=4/3.0*Math.PI*Math.pow(radio,3);
			
		System.out.printf("La esfera con radio %.0f tiene un volumen de %.2f",radio,volumen);
		
		teclado.close();
	}
}

