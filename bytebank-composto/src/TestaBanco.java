
public class TestaBanco {
	public static void main(String[] args) {
		Cliente aco = new Cliente();
		aco.nome = "Andr� Oliveira";
		aco.cpf = "433.567.666-88";
		aco.profissao = "Desenvolvedor";
		
		Conta contaAco = new Conta();
		contaAco.deposita(100);
		
		// associa o cliente aco a contaAco
		contaAco.titular = aco;
		
		System.out.println(contaAco.titular.nome);
	}

}
