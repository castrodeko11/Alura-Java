package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta1 = new Conta();
		conta1.saldo = 200;
		System.out.println("Saldo da Conta: " + conta1.saldo);
		
		conta1.saldo += 100; 
		System.out.println("Saldo da Conta com acréscimo: " + conta1.saldo);
		
		Conta conta2 = new Conta();
		conta2.saldo = 50;
		
		System.out.println("Saldo da Conta1: " + conta1.saldo);
		System.out.println("Saldo da Conta2: " + conta2.saldo);

	}

}
