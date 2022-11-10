package br.com.carlos.banco;

public class Clientes {

		String nome;
		int numeroCPF; //Modificador private não permite que outras classes utilizem o atributo ou método.
		
		Contas conta;
		
		//Construtor
		public Clientes(String name) { //Ao criar o new devemos informar os valores (ao instanciar).
			this.nome = name;
		}

}
