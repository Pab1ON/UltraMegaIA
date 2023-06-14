package Ejercicios1;

import java.util.Scanner;

public class Ej11 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce un número de 3 cifras");
		int num=teclado.nextInt();
		
		if (num>=100 && num<=999) {
			
			int num1=num/100;
			int num2=num%100/10;
			int num3=num%100%10;
			
			System.out.printf("Has introducido las cifras %d, %d y %d",num1,num2,num3);
		} else {
			System.out.println("El número debe de tener 3 cifras");
		};		
		teclado.close();
	}
}
