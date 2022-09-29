package AtividadeApostila1_2;

import java.util.Scanner;

public class Exercicio_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		double custo, soma1, soma2, total, carroNovo;
		double imposto = 0.45;
		double per = 0.28;

		System.out.println("Digite o preço de cuto do carro");
		custo = sc.nextDouble();
		
		soma1 = custo * imposto;
		soma2 = custo * per;
		total = soma1 + soma2;
		
		carroNovo = total + custo;
		
		System.out.println("O valor do carro ficou: " + carroNovo);
		
		
		sc.close();

	}

}
