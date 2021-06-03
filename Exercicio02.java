package br.com.generation.listaExercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 0, n2 = 0, n3 = 0;

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o primeiro númeoro: ");
		n1 = entrada.nextInt();
		
		System.out.println("Informe o primeiro númeoro: ");
		n2 = entrada.nextInt();
		
		System.out.println("Informe o primeiro númeoro: ");
		n3 = entrada.nextInt();

		if (n1 <= n2 && n2 <= n3) {
			System.out.println("A ordem crescente: \n" + n1 + " - " + n2 + " - " + n3);
		} else if (n1 <= n3 && n3 <= n2) {
			System.out.println("A ordem crescente: \n" + n1 + " - " + n3 + " - " + n2);
		} else if (n2 <= n1 && n1 <= n3) {
			System.out.println("A ordem crescente: \n" + n2 + " - " + n1 + " - " + n3);
		} else if (n2 <= n3 && n3 <= n1) {
			System.out.println("A ordem crescente: \n" + n2 + " - " + n3 + " - " + n1);
		} else if (n3 <= n1 && n1 <= n2) {
			System.out.println("A ordem crescente: \n" + n3 + " - " + n1 + " - " + n2);
		} else /* n3 <= n2 && n2 < n1 */
		{
			System.out.println("A ordem crescente: \n" + n3 + " - " + n2 + " - " + n1);
		}
		entrada.close();
	}

}
