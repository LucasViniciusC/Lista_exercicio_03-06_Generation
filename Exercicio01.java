package br.com.generation.listaExercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero, i, numeroMaior = 0;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		for (i = 0; i < 3; i++) {
			System.out.println("Informe um n�mero: ");
			numero = entrada.nextInt();
			if(numero > numeroMaior) {
				numeroMaior = numero;
			}
		}
		System.out.println("O maior n�mero inserido foi: " + numeroMaior);
		entrada.close();
	}

}
