package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {

		//Gererics
		List<Conta> lista = new ArrayList<Conta>();

		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);

		System.out.println(lista.size());

		Conta ref = lista.get(0);

		System.out.println(ref.getNumero());

		lista.remove(0);
		
		
		Conta cc3 = new ContaCorrente(33, 311);
		lista.add(cc3);

		Conta cc4 = new ContaCorrente(33,322);
		lista.add(cc4);

		System.out.println("Tamanho:" + lista.size());

		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}

		for (Conta Conta : lista){
			
			System.out.println(Conta);
		}
		
		
	}

}
