
public class TesteFuncionario {

	public static void main(String[] args) {

		
//		Funcionário foi transformado em abstrato
//		Funcionario funcionario = new Funcionario();
		
		Gerente funcionario = new Gerente();
		
		funcionario.setNome("aco");
		funcionario.setCpf("566951478-6");
		funcionario.setSalario(2600.00);

		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getBonificacao());

	}

}
