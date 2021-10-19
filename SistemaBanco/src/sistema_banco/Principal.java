package sistema_banco;

public class Principal {

	public static void main(String[] args) {
		ListaDeGerentes gerentes = new ListaDeGerentes();
		
		Gerente daniel = new Gerente ("Daniel","211221");
		Gerente pamela = new Gerente ("Pamela","344334");
		
		gerentes.cadastrar(daniel);
		gerentes.cadastrar(pamela);
		
		System.out.println(gerentes.listar());
		
		Gerente novaPamela = new Gerente("Pam","900990");		
		gerentes.editar(novaPamela);
		System.out.println(gerentes.listar());
		
		gerentes.remover(pamela);
		System.out.println(gerentes.listar());
		
		ListaDeContas banco = new ListaDeContas();

		Conta conta1 = new Conta(1, 100);
		Conta conta2 = new Conta(2, 200);
		
		banco.cadastrar(conta1);
		banco.cadastrar(conta2);
		System.out.println(banco.listar());
		
		Conta contaEditada = new Conta(1,1000);
		banco.editar(contaEditada);
		System.out.println(banco.listar());
		
		banco.remover(contaEditada);
		System.out.println(banco.listar());
		
		ListaDeClientes clientes = new ListaDeClientes();
		

		Cliente cliente1 = new Cliente("121.232.232-50","Rodrigo Rodrigues Rolando");	
		Cliente cliente2 = new Cliente("545.565.676-80","Maria Marta Maria");

		clientes.cadastrar(cliente1);
		clientes.cadastrar(cliente2);
		System.out.println(clientes.listar());

		Cliente clienteEditado = new Cliente("434.878.211-20","João Jairo Jaime");
		clientes.editar(clienteEditado); 
		System.out.println(clientes.listar());

		clientes.remover(clienteEditado);
		
		System.out.println(clientes.listar());
		
	}
	
}