package AtividadeApostila1_2;

import java.util.Scanner;

public class Exercicio_23 {

	public static void main(String[] args) {
		// Fa�a um algoritmo que receba um n�mero e mostre uma mensagem caso este n�mero
		// sege maior que 80, menor que 25 ou igual a 40;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int num1 = sc.nextInt();
		
		if(num1 >= 80) {
			System.out.println("O numero que voc� digitou � maior do que 80");
		} else if(num1 <= 25) {
			System.out.println("O numero que voc� digitou � menor do que 25");
		} else if (num1 == 40){
			System.out.println("O numero que voc� digou � igual a 40");
		} 
		
		
		
		
		
		
		sc.close();	
		
	}

}
