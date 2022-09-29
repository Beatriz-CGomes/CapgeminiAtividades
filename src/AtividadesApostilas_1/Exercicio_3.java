package AtividadesApostilas_1;

import java.util.Scanner;

public class Exercicio_3 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	double media;
	double distancia;
	double combo;
	
	
	
	System.out.println("Digite a distancia percorrida");
	distancia = sc.nextDouble();
	
	
	System.out.println("Digite o total de combustivel gasto");
	combo = sc.nextDouble();
	
	
	media = distancia / combo;
	
	
	System.out.println("Em media você percorre " + distancia + " e o seu gasto é de " + media);
	
	
	
	
	
	
	
	
	sc.close();
	
	
	}
}
