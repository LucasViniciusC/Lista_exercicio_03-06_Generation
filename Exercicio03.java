package br.com.generation.listaExercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a sua idade");
		idade = entrada.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.println("Infantil");
		}else if(idade >= 15 && idade <= 17) {
			System.out.println("Juvenil");
		}else {
			System.out.println("Adulto");
		}
		
		entrada.close();
	}

}
