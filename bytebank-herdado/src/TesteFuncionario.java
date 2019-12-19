
public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		funcionario.setNome("aco");
		funcionario.setCpf("566951478-6");
		funcionario.setSalario(900.00);

		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getBonificacao());

	}

}
