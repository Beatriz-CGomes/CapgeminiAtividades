package AtividadeApostila1_2;

import java.util.Scanner;

public class Exercicio_22 {
	
/* Fa�a um algoritmo que receba o pre�o de custo e o pre�o de venda de 40 produtos. 
 * Mostre como resultado se houve lucro, preju�zo ou empate para cada produto. 
 * Informe o valor de custo de cada produto, o valor de venda de cada produto, 
 * a m�dia de pre�o de custo e do pre�o de venda; */



	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
		
		
		double custo, venda;
		double totalCusto, totalVenda, dife;
				
		for(int i = 0; i < 3; i++) {
			System.out.println("Digite o valor da venda");
			venda = sc.nextDouble();
			
			System.out.println("Digite o valor do custo");
			custo = sc.nextDouble();
		
			
		if(venda <= custo) {
			System.out.println("Houve prejuizo na venda");
		} else if (venda == custo) {
			System.out.println("Houve �mpate na venda");
		} else {
			System.out.println("Houve lucro na venda");
		}
		
		}
	
		
		//totalCusto = totalCusto + custo;
		//totalVenda = totalVenda + venda;
		
		//System.out.println("A media do custo foi de + " + totalCusto/3);
		
		System.out.println("A media da venda foi de + ");
		
			
           sc.close();
				
				
		
		
		
		
		
	}

}
