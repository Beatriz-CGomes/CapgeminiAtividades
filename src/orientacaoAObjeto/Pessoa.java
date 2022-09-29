package orientacaoAObjeto;

public class Pessoa {

	
	//Atributos
	String nome;
	double peso;
	double altura;
	
	//Metodo
	public double calcularImc() {
		double imc = peso / (altura * altura);
		return imc;
		
	}
	
	//Metado Construtor
	public Pessoa(double peso, double altura) {
	   this.peso = peso;
	   this.altura = altura;
	}

	//Metado Acessores
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
}
