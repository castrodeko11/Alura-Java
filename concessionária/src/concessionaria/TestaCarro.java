package concessionaria;

public class TestaCarro {
	public static void main(String[] args) {

		Carro carro = new Carro(1800, "Gol", 35000.0);
		Carro outroCarro = new Carro("Civic", 95000.0);
//		carro.setAno(2013);
//		carro.setPreco(35000.0);
		
		System.out.println(carro.getAno());
	}

}
