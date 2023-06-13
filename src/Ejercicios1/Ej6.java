package Ejercicios1;

import java.util.Scanner;

public class Ej6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce los Km/h");
		double kmh=teclado.nextFloat();
		
		double ms=kmh*0.2778;
			
		System.out.printf("%.2fKm/h son %.2fm/s",kmh,ms);
		
		teclado.close();
	}
}
