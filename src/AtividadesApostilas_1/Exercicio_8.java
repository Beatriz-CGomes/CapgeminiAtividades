package AtividadesApostilas_1;

import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		double cota, dolar, soma;
		
		
		System.out.println("Digite quantos dolares");
		dolar = sc.nextDouble();
		
		System.out.println("Digite a cotação");
		cota = sc.nextDouble();
		
		soma = dolar * cota;
		
		
		System.out.println("Valor em Reias R$: " + soma);
		
		
		
		
		sc.close();
		
	}

}
