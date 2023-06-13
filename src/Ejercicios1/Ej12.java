package Ejercicios1;

import java.util.Scanner;

public class Ej12 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce un número de 5 cifras");
		int num=teclado.nextInt();
		
		if (num>=10000 && num<=99999) {
			
			int num1=num/10000;
			int num2=num/1000;
			int num3=num/100;
			int num4=num/10;
			
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
			System.out.println(num4);
			System.out.println(num);
			
		} else {
			System.out.println("El número debe de tener 5 cifras");
		};	
		
		teclado.close();
	}
}
