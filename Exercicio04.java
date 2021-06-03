package br.com.generation.listaExercicios;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub

		int numero = 0;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe um número: ");
		numero = entrada.nextInt();

		if (numero % 2 == 0) {

			System.out.println("A raiz quadrada é de: " + Math.sqrt(numero));
		} else {

			System.out.println("O número elevado ao quadrado é de: " + Math.pow(numero, 2));
		}
		entrada.close();
	}

}
