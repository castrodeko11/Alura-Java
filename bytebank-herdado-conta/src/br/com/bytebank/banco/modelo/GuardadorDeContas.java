package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {

	private Conta[] referencias;
	private int posicaoLivre;

	public GuardadorDeContas() {
		this.referencias = new Conta[10];
		this.posicaoLivre = 0;
	}

	public void adicionar(Conta ref) {
		this.referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
		
		
	}

	public int getQuantidadeDeElemtentos() {
		// TODO Auto-generated method stub
		return this.posicaoLivre;
	}

	public Conta getReferenca(int pos) {
		return this.referencias[pos];
	}

}
