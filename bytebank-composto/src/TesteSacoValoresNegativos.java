
public class TesteSacoValoresNegativos {
	public static void main(String[] args) {
		Conta aco = new Conta();
		aco.deposita(100);
		System.out.println(aco.saca(200));
		System.out.println(aco.getSaldo());

		// proibido
		aco.saca(101);
		System.out.println(aco.getSaldo());
		
		

	}

}
