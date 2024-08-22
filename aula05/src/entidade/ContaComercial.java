package entidade;

import entidade.enums.Cores;

public class ContaComercial extends Conta {

	private double limite;

		
	public ContaComercial(String nome, int numero, double saldo, Cores cor) {
		super(nome, numero, saldo, cor);
		this.limite = limite;
	}


	public String agua() {
		return toString() + "limite: " + limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
}
