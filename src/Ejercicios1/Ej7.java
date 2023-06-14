package Ejercicios1;

import java.util.Scanner;

public class Ej7 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce un lado");
		float cat1=teclado.nextFloat();
		
		System.out.println("Introduce el otro lado");
		float cat2=teclado.nextFloat();
		
		double hip=Math.sqrt(Math.pow(cat1,2)+Math.pow(cat2,2));
			
		System.out.printf("El triángulo con catetos %.0f y %.0f tiene una hipotenusa de %.2f ",cat1,cat2,hip);
		
		teclado.close();
	}
}
