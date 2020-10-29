package vendedores;

import template.Vendedor;

public class VendedorLoja extends Vendedor {

	private double salario;
	private double horaExtra;

	public VendedorLoja() {

	}

	public VendedorLoja(String nome, double vendas, double comissao, double salario, double horaExtra) {
		this.setNome(nome);
		this.setVendas(vendas);
		this.setComissao(comissao);
		this.salario = salario;
		this.horaExtra = horaExtra;
				
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getHoraExtra() {
		return horaExtra;
	}

	public void setHoraExtra(double horaExtra) {
		this.horaExtra = horaExtra;
	}

	public double calcularPagamento() {
		return ((vendas * comissao) + salario + horaExtra);
	}
	
	public boolean equals(Object obj) // Método para atender a Questão 5
	{
		if (!(obj instanceof VendedorLoja))
		return false;
		VendedorLoja e = (VendedorLoja) obj;
		return this.calcularPagamento() == e.calcularPagamento();
	}



	@Override
	public String toString() {
		return " Vendedor Loja"
				+"\n Nome: " +nome
				+"\n Qtd Vendas: " + vendas
				+"\n Salario: " + salario
				+"\n Comissão: " +comissao
				+"\n Hora Extra: " + horaExtra
				+"\n Total: " + calcularPagamento()
				+"\n -------------------------------";
	}

	
}