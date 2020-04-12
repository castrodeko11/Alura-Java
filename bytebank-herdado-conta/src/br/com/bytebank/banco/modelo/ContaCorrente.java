package br.com.bytebank.banco.modelo;

//new ContaCorrente()
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);

	}

	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		double valorSacar = valor + 0.2;
		super.saca(valorSacar);
	}

	@Override
	public void deposita(double valor) {
		// TODO Auto-generated method stub
		super.saldo += valor;

	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ContaConrrente, " + super.toString();
	}

}
