package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuardarContas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuardadorDeContas guardadorDeContas = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(22,11);
		guardadorDeContas.adicionar(cc);

		
		Conta cc2 = new ContaCorrente(22,22);
		guardadorDeContas.adicionar(cc2);
		
		int tamanho = guardadorDeContas.getQuantidadeDeElemtentos();
		System.out.println(tamanho);
		
		
		Conta ref = guardadorDeContas.getReferenca(0);
		
		System.out.println(ref.getNumero());
	}

}
