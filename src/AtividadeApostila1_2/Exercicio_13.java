package AtividadeApostila1_2;

import java.util.Scanner;

public class Exercicio_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número");
		int num = sc.nextInt();

		
	if(num >=10) {
		System.out.println("O número digitado é maior do que 10");
	} else {
		System.out.println("O número digitado é menor do que 10");
	}
		sc.close();
	}

}
