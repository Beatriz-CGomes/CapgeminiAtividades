package AtividadeApostila1_2;

import java.util.Scanner;


//Fa�a um algoritmo que receba �N� n�meros e mostre positivo, negativo ou zero para cada n�mero;	

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
