package AtividadesApostilas_1;

import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String nome;
		double nota1;
		double nota2;
		double nota3;
		double media;
		
		
		System.out.println("Digite o nome do aluno(a)");
		nome = sc.nextLine();
		
		System.out.println("Digite a primeira nota");
		nota1 = sc.nextDouble();
		
		System.out.println("Digite a segunda nota");
		nota2 = sc.nextDouble();
		
		System.out.println("Digite a terceira nota");
		nota3 = sc.nextDouble();
		
		
		media = (nota1+ nota2 + nota3) /3;
		
		if(media >= 6) {
			System.out.println("Parabéns Aluno(a) " + nome + " você foi aprovado" + " sua média é: " +  media);
			
		} else {
			System.out.println("Aluno(a) " + nome + " você foi reprovado " + " sua média é: " + media);
		}
		
		
		
		sc.close();
		
		
	}

}
