package Aula01;

public class Programa9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double salario = 4300;

		if (salario >= 1900 && salario <= 2800) {
			System.out.println("Deduzir IRPF R$ 142.00");
		} else if (salario >= 2801.00 && salario <= 3751.00) {
			System.out.println("Deduzir IRPF R$ 350.00");
		} else if (salario >= 3751.01 && salario <= 4664.00) {
			System.out.println("Deduzir IRPF R$ 636.00");
		}
	}

}
