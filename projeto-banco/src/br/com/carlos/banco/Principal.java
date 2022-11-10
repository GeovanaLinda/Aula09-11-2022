package br.com.carlos.banco;

public class Principal {

	public static void main(String[] args) {
		
		Clientes cliente1 = new Clientes("Leandro");
		cliente1.conta = new Contas();		
		cliente1.conta.numero = 9999;
		System.out.println(cliente1.nome);
		System.out.println(cliente1.numeroCPF);
		System.out.println(cliente1.conta.getSaldo());
		
		//___________________________________________________________________________
		
		
		Contas conta1 = new Contas();
		conta1.numero = 8888;
	
		
		Clientes cliente2 = new Clientes("Fulano");
		cliente2.numeroCPF = 4321;
		cliente2.nome = "Fulano";
		cliente2.conta = conta1;
		
		Clientes cliente3 = new Clientes("Ciclano");
		cliente3.numeroCPF = 8765;
		cliente3.nome = "Ciclano";
		
		//___________________________________________________________________________

		 System.out.println(cliente1.conta.getSaldo());
		 cliente1.conta.setSaque(100); //Correta!
		 System.out.println(cliente1.conta.getSaldo());
		
		//___________________________________________________________________________
		 
		 Clientes clienteA = new Clientes("Vitor");
		 clienteA.numeroCPF = 1111;
		 clienteA.conta = new Contas();
		 System.out.println(clienteA.conta.numero);

		 Clientes clienteB = new Clientes("Carlos");
		 clienteB.numeroCPF = 2222;
		 clienteB.conta = new Contas();
		 System.out.println(clienteB.conta.numero);
		 
		//___________________________________________________________________________
		 
		 
		 
	}

}
