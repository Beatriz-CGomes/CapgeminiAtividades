package Heranca;


public class vendedor extends funcionario {


	private int totalVendas;
	private double comissao;
	
	public vendedor() {
		super();
	}

	public double calcularSalario() {
		return super.getSalario() + (this.comissao * totalVendas);
	}

	public int getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(int totalVendas) {
		this.totalVendas = totalVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	
	
}
