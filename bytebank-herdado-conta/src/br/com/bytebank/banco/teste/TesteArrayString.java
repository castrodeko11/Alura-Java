package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object[] referencias = new Object[5];

		ContaCorrente cc1 = new ContaCorrente(22, 11);
		referencias[0] = cc1;

		ContaPoupanca cc2 = new ContaPoupanca(22, 22);
		referencias[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente; 

		System.out.println(((Conta) referencias[1]).getNumero());

		ContaPoupanca ref = (ContaPoupanca) referencias[1];// type cast
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());

//		Conta[] contas = new Conta[5];
//		
//		
//		ContaCorrente cc1 = new ContaCorrente(22, 11);
//		contas[0] = cc1;
//		
//		ContaPoupanca cc2 = new ContaPoupanca(22, 22);
//		contas[1] = cc2;
//
//		System.out.println(contas[1].getNumero());
//		
//		ContaPoupanca ref = (ContaPoupanca) contas[1];// type cast
//		System.out.println(cc2.getNumero());
//		System.out.println(ref.getNumero());

//		ContaCorrente[] contas = new ContaCorrente[5];
//		
//		ContaCorrente cc1 = new ContaCorrente(22, 11);
//		contas[0] = cc1;
//		
//		ContaCorrente cc2 = new ContaCorrente(22, 22);
//		contas[1] = cc2;
//		
//		
//		
//		System.out.println(contas[1].getNumero());
//		
//		ContaCorrente ref = contas[1];
//		System.out.println(cc2.getNumero());
//		System.out.println(ref.getNumero());

	}

}
