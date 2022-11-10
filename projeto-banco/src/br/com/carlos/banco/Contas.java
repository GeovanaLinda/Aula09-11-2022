package br.com.carlos.banco;

public class Contas {
	
	int numero;
	private double saldo;
	
	private static int valorAleatorio = 1; //Vai manter as alterações
	
	void setSaque(double valor) {
		
		if(valor <= this.saldo) {
			this.saldo -= valor;
		}
	}
	
	double getSaldo() {
		return this.saldo;
	}
	
	public void setNumeroAleatorio() {
		this.numero = valorAleatorio;
		valorAleatorio++;
	}
		 
	}
