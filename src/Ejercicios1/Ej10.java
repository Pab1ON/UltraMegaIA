package Ejercicios1;

import java.util.Scanner;

public class Ej10 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce el precio");
		float precio=teclado.nextFloat();
		
		System.out.println("Introduce el importe");
		float importe=teclado.nextFloat();
		
		float vuelta=importe-precio;
		
		if (vuelta<0) {
			System.out.println("Falta dinero.");
		} else if (vuelta==0) {
			System.out.println("Importe exacto, no hay vuelta.");
		} else {
			int[] monedas = new int[8];
			int euros = (int) vuelta;
			int centimos = Math.round((vuelta-euros)*100);
			monedas[0]=euros/2;
			monedas[1]=euros%2;
			monedas[2]=centimos/50;
			monedas[3]=(centimos%50)/20;
			monedas[4]=((centimos%50)%20)/10;
			monedas[5]=(((centimos%50)%20)%10)/5;
			monedas[6]=((((centimos%50)%20)%10)%5)/2;
			monedas[7]=((((centimos%50)%20)%10)%5)%2;
			System.out.println(centimos);
			System.out.printf("La vuelta son:"
					+ "\n%d monedas de 2€"
					+ "\n%d monedas 1€"
					+ "\n%d monedas de 50cent"
					+ "\n%d monedas de 20cent"
					+ "\n%d monedas de 10 cent"
					+ "\n%d monedas de 5 cent"
					+ "\n%d monedas de 2 cent"
					+ "\n%d monedas de 1 cent",
					monedas[0],monedas[1],monedas[2],monedas[3],monedas[4],monedas[5],monedas[6],monedas[7]);
		};
					
		teclado.close();
	}
}
