package AtividadesApostilas_1;

import java.util.Scanner;

public class Exercicio_9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nome;
		double deposito;
		double juros = 0.07;
		double soma;
	//	int meses = 12;
		double rendimento;

		System.out.println("Digite o nome do cliente da conta");
		nome = sc.nextLine();

		System.out.println("Digite o valor que ser� depositado");
		deposito = sc.nextDouble();

		soma = deposito * juros;
		rendimento = soma + deposito;

		System.out.println("Ol� cliente  " + nome + " seu saldo atual �: " + rendimento + " seu rendimento no m�s foi de: " + soma);
		sc.close();
	}

}
