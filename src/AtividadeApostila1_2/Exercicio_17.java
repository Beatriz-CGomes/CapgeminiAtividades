package AtividadeApostila1_2;

import java.util.Scanner;

public class Exercicio_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		int num;
		
		
		for(int i = 0; i < 4; i++) {
			System.out.println("Digite um numero");
			num = sc.nextInt();
			
			
			if(num >=10 && num <=150) {
				System.out.println("Número entre os intervalos de 10  a 150" + " obtemos ");
			} else {
				System.out.println("Não está entre o intervalo");
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
}
