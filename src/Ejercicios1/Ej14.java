package Ejercicios1;

import java.util.Scanner;

public class Ej14 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce la fecha de nacimiento:");
		System.out.println("Año");
		int ano=teclado.nextInt();
		if (ano<0 || ano>9999) {
			System.out.println("Año inválido");
		} else {
			System.out.println("Mes");
			int mes=teclado.nextInt();
			if (mes<1 || mes>12) {
				System.out.println("Mes inválido");
			} else {
			System.out.println("Día");
			int dia=teclado.nextInt();
			if (dia<1 || dia>31) {
				System.out.println("Día inválido");
			} else {
				int suerte=dia+mes+ano;
				int suert2=(suerte/1000)+(suerte%1000/100)+(suerte%1000%100/10)+(suerte%10);
				System.out.printf("El número de la suerte es %d",suert2);
				}			
			}
		}
		teclado.close();
	}
}
