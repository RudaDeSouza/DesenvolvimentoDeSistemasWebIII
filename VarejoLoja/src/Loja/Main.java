package Loja;

public class Main {

	public static void main(String[] args) {
		Clientes cli1 = new Clientes();
		Produtos prod1 = new Produtos();
		Transportadora trans1 = new Transportadora();
		Vendedores vend1 = new Vendedores();
		
		cli1.nome = "Roberto";
		cli1.cpf = "051-246-345-66";
		cli1.endereco = "rua jamais vista, 200";
		
		prod1.nome = "Prancha de surf";
		prod1.tamanho = "Grande";
		prod1.valor = "2000";
		
		trans1.empresa = "Element";
		trans1.endereco = "Rua Alberto Silva, 49";
		trans1.veiculo = "Jatinho";
		
		vend1.idVendedor = "11";
		vend1.nome = "Cleiton";
		vend1.salario = "1500";
		
		System.out.printf("O cliente %s comprou o produto %s vendido pelo colaborador %s, que chegará através da transportadora %s", cli1.nome, prod1.nome, vend1.nome, trans1.empresa);
		
	}
}
