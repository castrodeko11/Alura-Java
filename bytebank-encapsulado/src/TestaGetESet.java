
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero(1337);
		System.out.println(conta.getNumero());

		Cliente aco = new Cliente();
		aco.setNome("Andr� Oliveira");

		conta.setTitular(aco);
		System.out.println(conta.getTitular().getNome());
		conta.getTitular().setProfissao("Programador");

		// Agora em das linhas
		Cliente titularConta = conta.getTitular();
		titularConta.setProfissao("Desenvolvedor");

		System.out.println(titularConta);
		System.out.println(aco);
		System.out.println(titularConta);

		
	}
}
