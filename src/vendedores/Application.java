package vendedores;

import template.Vendedor;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Application {
	static List<Vendedor> vet;

	public static void main(String args[]) {
		int opc = 0, sair = 0;

		try (Scanner sc = new Scanner(System.in)) {
			vet = new ArrayList<Vendedor>();
			for (;;) {

				System.out.println();
				System.out.println("----------------------");
				System.out.println("Entre com uma opcao");
				System.out.println("1-Cadastrar um vendedor");
				System.out.println("2-Localizar um Vendedor");
				System.out.println("3-Listar Vendedor");
				System.out.println("4-Sair");
				System.out.print("opção: ");
				opc = sc.nextInt();
				sair = 0;

				switch (opc) {
				case 1:

					while (sair != 1) {
						System.out.println("Qual vendedor quer Cadastrar? ");
						System.out.println("1 - Vendedor da Loja \n 2 - Vendedor Externo");
						System.out.println("opção: ");
						opc = sc.nextInt();

						if (opc == 1) {

							for (int i = 0; i < 5; i++) {

								sc.nextLine();
								System.out.println("Nome do Vendedor da Loja " + (i + 1) + ": ");
								String nome = sc.nextLine();

								System.out.println("Digite a quantidade de vendas do Vendedor: ");
								double vendas = sc.nextDouble();

								System.out.println("Digite a comissão do vendedor: ");
								double comissao = sc.nextDouble();

								System.out.println("Digite o salario do vendedor: ");
								double salario = sc.nextDouble();

								System.out.println("Digite a hora extra do vendedor: ");
								double horaExtra = sc.nextDouble();

								if(vet.add(new VendedorLoja(nome, vendas, comissao, salario, horaExtra))) {
									System.out.println("1 - Menu Principal");
									System.out.println("2 - Continuar cadastrando");
									System.out.println("Opção: ");
									sair = sc.nextInt();
								}
								
								if(sair == 1)
									break;
							}
						}
						if (opc == 2) {
							for (int i = 5; i < 10; i++) {

								sc.nextLine();

								System.out.println("Nome do Vendedor Externo" + (i + 1) + ": ");
								String nome = sc.nextLine();

								System.out.println("Digite a quantidade de vendas do Vendedor: ");
								double vendas = sc.nextDouble();

								System.out.println("Digite a comissão do vendedor: ");
								double comissao = sc.nextDouble();

								System.out.println("Digite a ajuda de custo do vendedor: ");
								double ajudaCusto = sc.nextDouble();

								if(vet.add(new VendedorExterno(nome, vendas, comissao, ajudaCusto))) {
									System.out.println("1 - Menu Principal");
									System.out.println("2 - Continuar cadastrando");
									System.out.println("Opção: ");
									sair = sc.nextInt();
								}
								
								if(sair == 1)
									break;
							}
						}

					}
					break;
				case 2:

					Vendedor Localizar = null;

					System.out.println("Qual Vendedor você quer Cadastrar para ser localizado? ");
					System.out.println("1 - Vendedor da Loja \n 2 - Vendedor Externo");
					System.out.println("opção: ");
					opc = sc.nextInt();

					if (opc == 1) {

						sc.nextLine();
						System.out.println("Nome do Vendedor Loja a Localizar: ");
						String nome = sc.nextLine();

						System.out.println("Digite a quantidade de vendas do Vendedor: ");
						double vendas = sc.nextDouble();

						System.out.println("Digite a comissão do vendedor: ");
						double comissao = sc.nextDouble();

						System.out.println("Digite o salario do vendedor: ");
						double salario = sc.nextDouble();

						System.out.println("Digite a hora extra do vendedor: ");
						double horaExtra = sc.nextDouble();

						Localizar = new VendedorLoja(nome, vendas, comissao, salario, horaExtra);

					}
					if (opc == 2) {

						sc.nextLine();
						System.out.println("Nome do Vendedor Externo a Localizar: ");
						String nome = sc.nextLine();

						System.out.println("Digite a quantidade de vendas do Vendedor: ");
						double vendas = sc.nextDouble();

						System.out.println("Digite a comissão do vendedor: ");
						double comissao = sc.nextDouble();

						System.out.println("Digite a ajuda de custo do vendedor: ");
						double ajudaCusto = sc.nextDouble();

						Localizar = new VendedorExterno(nome, vendas, comissao, ajudaCusto);

					}

					for (int i = 0; i < vet.size(); i++) {

						if (Localizar.equals(vet.get(i))) {
							System.out.println("Nome do vendedor encontrado é : " + vet.get(i).getNome());
							return;
						}
					}
					System.out.println("Não encontrado");
					break;

				case 3:

					ListeVendedores.listarVendedores(vet);

					break;
				case 4:

				}
			}
		}

		catch (InputMismatchException a) {
			System.out.println("Erro de Entrada e saída!!!");
			System.exit(0);
		}

	}

//	public Vendedor[] getVet() {
//		return vet;
//	}
//
//	public void setVet(Vendedor[] vet) {
//		Application.vet = vet;
//	}

}