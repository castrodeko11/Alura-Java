package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta = new Conta();
		conta.saldo = 100;
		conta.deposita(800);
		System.out.println(conta.saldo);

		boolean conseguiuRetirar = conta.saca(500);
		System.out.println(conta.saldo);
		System.out.println(conseguiuRetirar);

		Conta conta2 = new Conta();
		conta2.deposita(2000);

		if (conta2.transfere(1000, conta)) {
			System.out.println("Transferido com sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}
		System.out.println(conta.saldo);

	}

}
