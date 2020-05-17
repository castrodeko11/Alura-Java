package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe representa a moldura de uma conta
 * 
 * @author castrodeko11
 *
 */

public abstract class Conta extends Object implements Comparable<Conta>, Serializable {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;

	public Conta() {
	}

	/**
	 * Construtor para inicializar o objeto Conta a partir da agencia e numero
	 * 
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		// Static � da classe (Conta.total++;)
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando uma conta " + this.numero);
	}

	public abstract void deposita(double valor);

	/**
	 * Valor precisa ser maior do que o saldo.
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo insufiiente " + this.saldo + ", Valor: " + valor);
		}

		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {

		this.saca(valor);
		destino.deposita(valor);

	}

	public double getSaldo() {
		return this.saldo;

	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("N�o pode valor menor igual a 0");
			return;
		}
		this.numero = numero;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("N�o pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public void setSaldo(double saldo) {

		this.saldo = saldo;
	}

	public static int getTotal() {
		return total;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Numero:" + this.numero + ", Agencia: " + this.agencia + ", Saldo: "+this.saldo;
	}

	@Override
	public boolean equals(Object ref) {
		Conta outra = (Conta) ref;

		if (this.agencia != outra.agencia) {
			return false;
		}
		if (this.numero != outra.numero) {
			return false;
		}

		return true;
	}

	@Override
	public int compareTo(Conta outra) {

		return Double.compare(this.saldo, outra.saldo);
	}

}