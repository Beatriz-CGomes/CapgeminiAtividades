package AtividadeApostila1_2;

import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);		
		
		double preco;
		double porce;
		double soma;
		
		System.out.println("Digite o valor da custo");
		preco = sc.nextDouble();
		
		System.out.println("Digite o percentual da venda");
		porce = sc.nextDouble();
		
		soma = preco * porce;
		soma = soma + preco;
		
		System.out.println("O valor da sua venda é de " + soma);
		
		
		
		
		
		
		
		
		sc.close();
		
		
	}

}
