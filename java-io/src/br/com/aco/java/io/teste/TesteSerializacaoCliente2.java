package br.com.aco.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente2 {

	public static void main(String[] args) throws IOException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Cliente cliente = new Cliente();
		cliente.setNome("André");
		cliente.setProfissao("Dev");
		cliente.setCpf("25567894125");

	
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
		oos.writeObject(cliente);
		oos.close();

//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
//		Cliente cliente = (Cliente) ois.readObject();
//		ois.close();
//		System.out.println(cliente.getNome());
	}

}
