package AtividadeApostila1_2;

import java.util.Scanner;

public class Exercicio_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int idade;
		char sexo = 'f';
		char desejaContinuar = 's';
		char saude = 'b';

		int total = 0;
		int totalAptos = 0;

		// int soma;

		while (desejaContinuar == 's' || desejaContinuar == 'S') {

			System.out.println("Digite seu nome");
			nome = sc.next();

			System.out.println("Digite sua idade");
			idade = sc.nextInt();

			System.out.println("Qual seu sexo 'f' - FEMININO / 'm' = MASCULINO");
			sexo = sc.next().charAt(0);

			System.out.println("Como está sua saúde? 'B' - Boa / 'R' - RUIM ");
			saude = sc.next().charAt(0);

			if (idade >= 18 && saude == 'b') {
				System.out.println("Você está apto para entrar no exercito");
			} else {
				System.out.println("Você não está apto -");
			}

			totalAptos++;

			System.out.println("Deseja continuar cadastrando?");
			desejaContinuar = sc.next().charAt(0);
			if (desejaContinuar == 'n') {
				System.out.println(" ---- FIM DA CONSULTA ------  ");
			}

		}
		totalAptos = totalAptos + 1;

		System.out.println(" A SOMA TOTAL DE APTOS É: " + totalAptos);

		System.out.println("-------------------------------------------");

		sc.close();

	}
}
