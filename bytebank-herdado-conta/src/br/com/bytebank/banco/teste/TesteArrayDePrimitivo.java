package br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivo {

	// Array
	public static void main(String[] args) {

//		int[] idades = new int[5]; // inicializa a array com 0
//
//		idades[0] = 29;
//		idades[1] = 39;
//		idades[2] = 69;
//		idades[3] = 89;
//		idades[4] = 79;
//
//		int idade1 = idades[4];
//
//		System.out.println(idade1);
//		System.out.println(idades.length);

		int[] idades = new int[5];
		
		for (int i = 0; i < idades.length; i++) {
			
			idades[i] = i * i;
			
		}
		
		
		for (int i = 0; i < idades.length; i++) {
		
			System.out.println(idades[i]);
			
		}
		
	}

}
