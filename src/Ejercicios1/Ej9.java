package Ejercicios1;

import java.util.Scanner;

public class Ej9 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce un lado");
		float lado1=teclado.nextFloat();
		
		System.out.println("Introduce el segundo lado");
		float lado2=teclado.nextFloat();
		
		System.out.println("Introduce el tercer lado");
		float lado3=teclado.nextFloat();
		
		double semiperimetro=(lado1+lado2+lado3)/2;
		
		double area=Math.sqrt(semiperimetro*(semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3));
	
		if (Double.isNaN(area)) {
			System.out.println("Ese triángulo no existe.");
		} else {			
			System.out.printf("El triángulo con lados %.0f, %.0f y %.0f tiene un área de %.2f",lado1,lado2,lado3,area);
		};
		
		teclado.close();
	}
}