package AtividadesApostilas_1;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		double num1;
		double num2;
		double soma;

		System.out.println("Digite o primeiro numero");
		num1 = sc.nextDouble();

		System.out.println("Digite o segundo numero");
		num2 = sc.nextDouble();

		soma = num1 + num2;

		System.out.println("A soma dos numeros são " + soma);

		sc.close();

	}

}
