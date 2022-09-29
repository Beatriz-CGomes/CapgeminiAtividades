package atividadesEmAula;

import java.util.Scanner;

public class Quarto_Aula1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double num1;
		double num2;
		double soma;
		String nome;

		System.out.println("Digite o nome do aluno");
		nome = sc.nextLine();

		System.out.println("Digite a primeira nota");
		num1 = sc.nextDouble();

		System.out.println("Digite a segunda nota");
		num2 = sc.nextDouble();

		soma = (num1 + num2) / 2;

		if (soma >= 6) {
			System.out.println("Aprovado");

		} else {
			System.out.println("Reprovado");
		}

		System.out.println("A média do(a) aluno(a) " + nome + " é: " + soma);

		sc.close();
	}
}
