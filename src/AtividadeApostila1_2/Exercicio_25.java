package AtividadeApostila1_2;

import java.util.Scanner;

public class Exercicio_25 {
/*Fa�a um algoritmo que leia dois n�meros e identifique se s�o iguais ou diferentes. 
 * Caso eles sejam iguais imprima uma mensagem dizendo que eles s�o iguais. 
 * Caso sejam diferentes, informe qual n�mero � o maior, e uma mensagem que s�o diferentes; */
	
	

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
	 System.out.println("O valor de A e B s�o diferentes");
 } else {
	 System.out.println("O valor de A e B s�o iguais");
 }
 
  soma = num1 + num2;
  
	 System.out.println("E O VALOR DO NUMERO 1 � : " + num1 + " MAIS O VALOR DO NUMERO 2 �: " + num2 + 
			 " O RESULTADO � : " + soma);
 
 
		
	}

}
