
public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		try {
			cc.transfere(10.0, cp); 
		}catch (SaldoInsuficienteException ex) {
			System.out.println("Ex: " + ex.getMessage());
		}
		System.out.println("Saldo Conta Corrente: " + cc.getSaldo());

		System.out.println("Saldo Conta Poupança: " + cp.getSaldo());
	}

}
