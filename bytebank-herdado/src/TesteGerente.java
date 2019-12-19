
public class TesteGerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gerente gerente = new Gerente();
		gerente.setNome("André Oliveira");
		gerente.setCpf("456.851.4512.56");
		gerente.setSalario(5000.0);

		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());

		gerente.setSenha(2222);
		boolean autenticou = gerente.autentica(2222);

		System.out.println(autenticou);

	}

}
