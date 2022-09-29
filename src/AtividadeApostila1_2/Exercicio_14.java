package AtividadeApostila1_2;

import java.util.Scanner;

public class Exercicio_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor para A");
		int num1 = sc.nextInt();
		
		System.out.println("Digite um valor para B");
		int num2 = sc.nextInt();

		
	if(num1 >= num2) {
		System.out.println("O número do valor A é maior ou igual ao valor B" + "valor do A: " + num1);
	} else {
		System.out.println("O valor B é maior do que o valor A " +  "valor do B: " + num2);
	}
		sc.close();
	}

}
