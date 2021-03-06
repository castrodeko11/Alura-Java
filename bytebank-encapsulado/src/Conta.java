
public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;

	public Conta() {
	}

	public Conta(int agencia, int numero) {
		// Static � da classe (Conta.total++;)
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criadno uma conta " + this.numero);
	}

	void deposita(double valor) {
		this.saldo += valor;

	}

	public boolean saca(double valor) {
		if (this.saldo > valor) {
			this.saldo -= valor;
			return true;
		} else {
			System.out.println("Saldo insuficiente");
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {

		if (this.saldo > 0) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			System.out.println("Saldo insuficiente");
			return false;

		}

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

}