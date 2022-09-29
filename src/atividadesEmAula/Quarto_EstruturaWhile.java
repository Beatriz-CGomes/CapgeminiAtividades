package atividadesEmAula;

import java.util.Scanner;

public class Quarto_EstruturaWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub

		// Estrutura While eu uso quando eu não sei quantas vezes não sei quantas vezes
		// vai se repetir

		int totalAlunos = 10;

		while (totalAlunos > 0) {
			String nomeAluno = sc.nextLine();
			int idadeAluno = sc.nextInt();

			
			System.out.println("O nome do(a) aluno(a) é: " + nomeAluno + "e sua idade é: " 
			+ idadeAluno);
			
			totalAlunos = totalAlunos - 1;
			
			sc.close();
		}

	}

}
