package Ejercicios1;

import java.util.Scanner;

public class Ej15 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce los grados centígrados:");
		float grados=teclado.nextFloat();
		
		double kelvin=263.15+grados;
			
		System.out.printf("%.2fºC son %.2fºK",grados,kelvin);
		
		teclado.close();
	}
}
