package AtividadeApostila1_2;

import java.util.Scanner;

public class Exercicio_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 int idade;
		 
		 for(int i=0; i < 7; i++) {
		 System.out.println("Digite a sua idade");
		 idade = sc.nextInt();
		  if(idade >=18) {
			  System.out.println("Você é MAIOR de idade");
		  } else {
			  System.out.println("Você é MENOR de idade");
		  }
		
		 }
		
		
		
		
		
		sc.close();
	}

}
