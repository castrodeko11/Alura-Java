package Aula01;

public class Programa16 {
	public static void main(String[] args) {

		int fatorial = 6;
		int total = 1;
		for (int contador = 1; contador <= fatorial; contador++) {

			total *= contador;

		}

		System.out.println("Fatorial " + fatorial + "! =" + total);
	}

}
