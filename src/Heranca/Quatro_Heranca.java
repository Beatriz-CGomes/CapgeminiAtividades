package Heranca;

import java.util.Date;

public class Quatro_Heranca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		vendedor v = new vendedor();
        v.setNome("Poliana");
        v.setSalario(4200.00);
        v.setCpf("1234567891");
        v.setDataNascimento(new Date());
        v.setComissao(10.00);
        v.setTotalVendas(25);
		
       System.out.println("O salario do(a) vendedor(a) é:  " +  v.calcularSalario());
	
		motorista m = new motorista();
        m.setNome("Roberto");
        m.setSalario(2200.00);
        m.setCpf("1234567891");
        m.setDataNascimento(new Date());
		
        System.out.println("O salario do(a) motorista é:  ");
    	
		
		
		
		
		
		
		
	}

}
