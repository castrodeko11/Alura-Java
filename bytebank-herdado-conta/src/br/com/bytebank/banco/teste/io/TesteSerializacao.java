package br.com.bytebank.banco.teste.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		Cliente cliente = new Cliente();
		cliente.setNome("André");
		cliente.setProfissao("Dev");
		cliente.setCpf("25567894125");

		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.setTitular(cliente);
		cc.deposita(222.3);

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();
	}

}
