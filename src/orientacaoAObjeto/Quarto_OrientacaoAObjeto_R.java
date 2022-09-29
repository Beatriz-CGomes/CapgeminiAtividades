package orientacaoAObjeto;

import java.util.Scanner;

public class Quarto_OrientacaoAObjeto_R {

	public static void main(String[] args) {

		Pessoa objetoPessoa = new Pessoa(53.00, 1.63);		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu nome");
		objetoPessoa.setNome(sc.next());

		System.out.println("Digite seu peso");
		objetoPessoa.setPeso(sc.nextDouble());

		System.out.println("Digite sua altura");
		objetoPessoa.setAltura(sc.nextDouble());
		
		
		System.out.println("IMC = " + objetoPessoa.calcularImc());

		sc.close();

	}

}
