package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSaca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta conta = new ContaCorrente(123, 321);

		conta.deposita(200.0);

		try {
			conta.saca(210.0);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
