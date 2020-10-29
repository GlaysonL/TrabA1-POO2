package vendedores;

import template.Vendedor;

public class VendedorExterno extends Vendedor {

	private double ajudaCusto;

	public VendedorExterno() {
	}

	public VendedorExterno(String nome, double vendas, double comissao, double ajudaCusto) {
		this.setNome(nome);
		this.setVendas(vendas);
		this.setComissao(comissao);
		this.ajudaCusto = ajudaCusto;
		
	}

	public double getAjudaCusto() {
		return ajudaCusto;
	}

	public void setAjudaCusto(double ajudaCusto) {
		this.ajudaCusto = ajudaCusto;
	}

	public double calcularPagamento() {

		return ((vendas * comissao) + ajudaCusto);

	}
	
	public boolean equals(Object obj) // M�todo para atender a Quest�o 5
	{
		if (!(obj instanceof VendedorLoja))
		return false;
		VendedorLoja e = (VendedorLoja) obj;
		return this.calcularPagamento() == e.calcularPagamento();
	}
	
	public void comparar(double sal) // Quest�o 6
	{
	if (!vet[i].getClass().equals(vet[j].getClass())) {
	System.out.println("Classes Diferentes n�o podem ser comparadas!");
	System.exit(0);
	}
	if (vet[i].compareTo(vet[j]) == 0)
	System.out.println(
	"O Funcionario " + vet[i].getNome() + " tem o mesmo sal�rio do funcion�rio " + vet[j].getNome());
	else if (vet[i].compareTo(vet[j]) == 1)
	System.out.println("O Funcionario " + vet[i].getNome() + " tem o sal�rio maior que o do funcion�rio "
	+ vet[j].getNome());
	else
	System.out.println("O Funcionario " + vet[i].getNome() + " tem 0 sal�rio menor que o do funcion�rio "
	+ vet[j].getNome());
	}

	@Override
	public String toString() {
		return " Vendedor Externo"
				+"\n Nome: " +nome
				+"\n Vendas: " + vendas
				+"\n Comiss�o: " +comissao
				+"\n Ajuda de Custo: " + ajudaCusto
				+"\n Total: " + calcularPagamento()
				+"\n -------------------------------";
	}

	
}