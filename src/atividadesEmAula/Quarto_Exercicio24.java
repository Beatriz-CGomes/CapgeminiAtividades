package atividadesEmAula;

import java.util.Scanner;

public class Quarto_Exercicio24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  int soma;
		  char desejaContinuar = 'S';
		  while (desejaContinuar == 'S' || desejaContinuar == 's') {
			  
			  System.out.println("Digite um n�mero");
			  int numero = sc.nextInt();
			  if(numero == 0) {
				  System.out.println("O n�mero � zero");
			  } else {
				  if(numero > 0) {
					  System.out.println("O n�mero � positivo");
					  
				  } else {
					  System.out.println("O n�mero � negativo");
				  }
				  
				  System.out.println("Deseja continuar? S- Sim / N- n�o?");
				  desejaContinuar = sc.next().charAt(0);
				  
				  if(desejaContinuar == 'n'|| desejaContinuar == 'N'){
				      soma = numero + numero;
	
				  
				  System.out.println("Seu �ltimo n�mero digitado foi: " + numero + " e a soma foi " +
						  soma);
				  
				
				  
			  }
			  
	
		  }
			  
		
		  }
		  
		
		
		sc.close();
		
	}

}
