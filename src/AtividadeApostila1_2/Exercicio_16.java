package AtividadeApostila1_2;

import java.util.Scanner;

public class Exercicio_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		double nota1, nota2, nota3, media;
		String nome;

		System.out.println("Digite o nome do(a) aluno(a)");
		nome = sc.nextLine();

		System.out.println("Digite a primeira nota");
		nota1 = sc.nextDouble();

		System.out.println("Digite a segunda nota");
		nota2 = sc.nextDouble();

		System.out.println("Digite a terceira nota");
		nota3 = sc.nextDouble();

		media = (nota1 + nota2 + nota3) / 3;

		if (media >= 7) {
			System.out.println("Parabéns aluno(a)" + nome + "sua média do bimestre é de: " + media + " Você está aprovado");
		} else {
         System.out.println("Aluno(a) " + nome + "sua média do bimestre é de: " + media + " Você está reprovado");
		}
		
		sc.close();
}
	}
	