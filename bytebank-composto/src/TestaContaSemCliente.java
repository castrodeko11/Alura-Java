
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaAco = new Conta();
		System.out.println(contaAco.getSaldo());

		contaAco.titular = new Cliente();
		System.out.println(contaAco.titular);

		contaAco.titular.nome = "André";
		System.out.println(contaAco.titular.nome);
	}

}
