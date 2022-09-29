package AtividadesApostilas_1;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          
		String nome;
		double salario;
		double totalVendas;
		double comissao = 0.15;
		double soma;
		
		
		System.out.println("Digite o nome do vendedor");
		nome = sc.nextLine();
		
		System.out.println("Digite o salario do vendedor");
		salario = sc.nextDouble();
	
		System.out.println("Digite o total de vendas do mes");
		totalVendas = sc.nextDouble();
		
		
		soma = totalVendas * comissao;
		soma = soma + salario;
		
		System.out.println("Vendodor(a)  " + nome + " seu salario do mês é: " + soma);
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
		
		
	}

}
