package AtividadeApostila1_2;

import java.util.Scanner;

public class Exercicio_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String nome;
		int f = 0;
		int m = 0;
		char sexo = 'f';

		for (int i = 0; i < 3; i++) {
			System.out.println("Digite seu nome");
			nome = sc.next();

			System.out.println("Qual seu sexo 'f' - FEMININO / 'm' = MASCULINO");
			sexo = sc.next().charAt(0);
			
			if (sexo == 'f') {
				System.out.println("Seu nome é: + " + nome + " Você é do sexo Feminino");
				
				f = f + 1;
				
			} else {
				System.out.println("Seu nome é: + " + nome + " Você é do sexo Masculino");
				m = m +1;
			}

			System.out.println("Total de Mulheres " + f);
			System.out.println("Total de Homens " + m);
			
		
		}

		sc.close();
	}

}
