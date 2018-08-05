
public class TesteSaca {

	public static void main(String[] args) throws SaldoInsuficienteException {
		Conta conta = new ContaCorrente(123, 321);
		Conta teste = new ContaPoupanca(1234, 4321);
		
		conta.deposita(200.0);
		
		try {
			conta.saca(198.0);
		}catch(SaldoInsuficienteException ex) {
			System.out.println("E: " + ex.getMessage());
		}
		
		conta.transfere(500, teste);
		
		System.out.println(conta.getSaldo());
	}
}
