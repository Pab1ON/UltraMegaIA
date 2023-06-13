package Ejercicios1;

import java.util.Scanner;

public class Ej5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce el radio de la circunferencia:");
		float radio=teclado.nextFloat();
		
		double longitud= 2*Math.PI*radio;
		double area= Math.PI*Math.pow(radio,2);
			
		System.out.printf("La circunferencia con radio %.2f tiene una longitud de %.2f y un área de %.2f",radio,longitud,area);
		
		teclado.close();
	}
}
