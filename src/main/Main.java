package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// SOMA +
		int numero1 = 20;
		int numero2 = 10;
		int resultado = numero1 + numero2;
		System.out.println("SOMA: (+)" + resultado);
		
		// SUBTRA��O -
		float n1 = (float) 20.40;
		float n2 = (float) 0.40;
		System.out.println("SUBTRA��O: (-)" + (n1 - n2));
		
		// MULTIPLICA��O *
		int num1 = 2;
		int num2 = 6;
		System.out.println("MULTIPLICA��O: (*)" + (num1 * num2));

		// DIVIS�O /
		System.out.println("DIVIS�O: (/)" + 10/2);
		
		// RESTO DA DIVIS�O %
		System.out.println("RESTO DA DIVIS�O: " + 10%3);
		
		/*
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int numeroUsuario = teclado.nextInt();
		System.out.println("Numero * 2 = " + numeroUsuario*2);
		teclado.close();
		*/
		
		System.out.println(" ");
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int numUser1 = teclado.nextInt();
		System.out.println("Digite outro numero: ");
		int numUser2 = teclado.nextInt();
		int result = numUser1 + numUser2;
		System.out.println("Soma = " + result);
		teclado.close();
	}

}
