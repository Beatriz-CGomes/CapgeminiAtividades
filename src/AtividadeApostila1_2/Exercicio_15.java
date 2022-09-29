package AtividadeApostila1_2;

import java.util.Scanner;

public class Exercicio_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite um valor");
		double valor = sc.nextDouble();
		
		if(valor >=100 && valor <=200) {
			System.out.println("O valor digitado está entre 100 e 200");
		} else {
			System.out.println("O valor digitado não está entre 100 e 200");
		}

		sc.close();
	}

}
