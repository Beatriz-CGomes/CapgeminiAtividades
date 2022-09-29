package AtividadeApostila1_2;

import java.util.Scanner;

public class Exercicio_25 {
/*Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes. 
 * Caso eles sejam iguais imprima uma mensagem dizendo que eles são iguais. 
 * Caso sejam diferentes, informe qual número é o maior, e uma mensagem que são diferentes; */
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

 int num1, num2;
 int soma;
 
 System.out.println("Digite um valor para A ");
 num1 = sc.nextInt();
 
 System.out.println("Digite um valor para B");
 num2 = sc.nextInt();
 
 if(num1 != num2) {
	 System.out.println("O valor de A e B são diferentes");
 } else {
	 System.out.println("O valor de A e B são iguais");
 }
 
  soma = num1 + num2;
  
	 System.out.println("E O VALOR DO NUMERO 1 é : " + num1 + " MAIS O VALOR DO NUMERO 2 é: " + num2 + 
			 " O RESULTADO É : " + soma);
 
 
		
	}

}
