package AtividadesApostilas_1;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		double num1;
		double num2;
		double soma;
	    double sub;
	    double multi;
	    double div;
				
		
		
		System.out.println("Digite o primeiro numero");
		num1 = sc.nextDouble();

		System.out.println("Digite o segundo numero");
		num2 = sc.nextDouble();
		
		soma = num1 + num2;
		sub = num1 - num2;
		multi = num1 * num2;
		div = num1 / num2;
	

		System.out.println("A soma da Adição é " + soma);
		System.out.println("A soma da Subtração é: " + sub);
		System.out.println("A soma da multiplicação é: " + multi);
		System.out.println("A soma da divisão é: "  + div);

		sc.close();

	}

}