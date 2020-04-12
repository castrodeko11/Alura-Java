package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class TesteGuardarReferencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuardadorDeReferencias guardador = new GuardadorDeReferencias();
		
		Conta cc = new ContaCorrente(22,11);
		guardador.adicionar(cc);

		
		Conta cc2 = new ContaCorrente(22,22);
		guardador.adicionar(cc2);
		
		int tamanho = guardador.getQuantidadeDeElemtentos();
		System.out.println(tamanho);
		
		
		Conta ref = (Conta) guardador.getReferenca(0);
		System.out.println(ref.getNumero());
	}

}
