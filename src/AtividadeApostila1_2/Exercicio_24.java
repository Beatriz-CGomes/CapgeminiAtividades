package AtividadeApostila1_2;

import java.util.Scanner;


//Faça um algoritmo que receba “N” números e mostre positivo, negativo ou zero para cada número;	

public class Exercicio_24 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int num;
	
		System.out.println("Digite um numero");
	num = sc.nextInt();
	
	for(int i = 0; i < 3; i++) {
	if(num < 0 ) {
		System.out.println("Numero negativo " + num);
	} else if (num > 0) {
		System.out.println("Numero positivo " + num);
	} else {
		System.out.println("Numero igual a zero");
	}
	
	}	
	
	
	sc.close();
	
	
	
	}
	
	
}
