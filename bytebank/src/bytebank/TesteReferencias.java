package bytebank;

public class TesteReferencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta1 = new Conta();
		conta1.saldo = 300;
		System.out.println("Primeira Conta: " + conta1.saldo);
		
		Conta conta2 = conta1;
		conta2.saldo += 100;
		System.out.println("Saldo Conta2: " + conta2.saldo);
		
		conta2.saldo =50;
		
		System.out.println(conta2.saldo);
		
		conta1.titular = "Andr� Oliveira";
		System.out.println(conta1.titular);
		

	}

}
