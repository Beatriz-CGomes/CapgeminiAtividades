package AtividadeApostila1_2;

import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		double p1, p2, p3, p4, p5;
		
		System.out.println("Digite o preco da sua compra");
		double compra = sc.nextDouble();
		
	         p1 = compra / 1;
	         p2 = compra / 2;
	         p3 = compra / 3;
	         p4 = compra / 4;
	         p5 = compra / 5;

		System.out.println("O valor em uma presta��o : " + p1);
		System.out.println("O valor em duas presta��es : " + p2);
		System.out.println("O valor em tr�s presta��es : " + p3);
		System.out.println("O valor em quarto presta��es : " + p4);
		System.out.println("O valor em cinco presta��es : " + p5);

		sc.close();

	}

}
