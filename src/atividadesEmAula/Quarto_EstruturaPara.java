package atividadesEmAula;

import java.util.Scanner;

public class Quarto_EstruturaPara {	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		//estrutura FOR serve quando eu sei quantas vezes vou usar a repeti��o
		
		String nomeProduto;
		double precoCusto;
		double precoVenda;
		
		double totalCusto = 0.0;
		double totalVenda = 0.0;
		
		 int i = 0;
		 for(; i < 2; i++) {
			 
			 System.out.println("Digite o nome do produto");
			 nomeProduto = sc.next();
			 
			 System.out.println("Digite o pre�o de custo");
			 precoCusto = sc.nextDouble();
			 
			 System.out.println("Digite o pre�o de venda");
			 precoVenda = sc.nextDouble();
			 
			 totalCusto = totalCusto + precoCusto;
			 totalVenda = totalVenda + precoVenda;
			 
			 
			 if(precoCusto == precoVenda) {
				 System.out.println("N�o houve diferen�a no pree�o de custa no pre�o de venda");
			 } else {
				 if(precoCusto >= precoVenda) {
					 System.out.println("Prejuizo na venda");
				 }else {
					 System.out.println("Venda com lucro");
				 }
			 }
		 }
			 
			 System.out.println("A m�dia do pre�o de custo � de: " + 
					 (totalCusto /  i ));
			 
			 System.out.println("A m�dia do pre�o de venda � de: " + 
					 (totalVenda /  i ));

	
		
		 sc.close();
	}
}
