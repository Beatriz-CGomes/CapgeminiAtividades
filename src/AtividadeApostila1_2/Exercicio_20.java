package AtividadeApostila1_2;

import java.util.Scanner;

public class Exercicio_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		double carroAno;
		double desconto1 = 0.12;
		double desconto2 = 0.07;
		double soma1, soma2;

		char desejaCadastrar = 's';

		System.out.println("Digite o ano do veiculo");
		carroAno = sc.nextDouble();
		if (carroAno >=2000) {
			System.out.println("Voc� ganhou doze porcento de desconto");
			soma1 = carroAno * desconto1;
		} else {
			System.out.println("Seu carro � Semi novo e voc� ganhou sete porcento de desconto");
			soma2 = carroAno * desconto2; 

		}
		
		
		  System.out.println("Deseja continuar? S- Sim / N- n�o?");
		  desejaCadastrar = sc.next().charAt(0);
		if (desejaCadastrar == 'n' || desejaCadastrar == 'n'){
	
		}  
		
		
	

		sc.close();
	}

}
