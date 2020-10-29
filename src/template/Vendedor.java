package template;

public abstract class Vendedor implements Pagamento, Comparable<Vendedor> {
	protected String nome;
	protected double vendas;
	protected double comissao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getVendas() {
		return vendas;
	}

	public void setVendas(double vendas) {
		this.vendas = vendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public int compareTo(Vendedor doisVendedor) {
		return (int) (this.calcularPagamento() - doisVendedor.calcularPagamento());
	}

	@Override
	public String toString() {
		return null;
	}

	

}
