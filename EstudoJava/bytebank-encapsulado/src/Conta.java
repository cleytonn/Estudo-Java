public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private static int cont;
	
	public Conta(int agencia, int numero) {
		Conta.cont++;
		
		System.out.println("O total de contas criadas é: " + Conta.cont);
		this.agencia = agencia;
		this.numero = numero;
		
		System.out.println("Estou criando uma conta: " + this.numero);
	}
	
	private Cliente titular;
		
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			System.out.println("Você não tem saldo suficiente!");
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			
			return true;
		}else {
			System.out.println("Saldo indisponivel");
			return false;
		}
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public int getNumero(){
		return this.numero;
	}
	
	public void setNumero(int Numero){
		if(numero <= 0) {
			System.out.println("Não pode valor menor ou igual a zero!");
			return;
		}
		this.numero = Numero;
	}
	
	public int getAgencia(){
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Não pode valor menor ou igual a zero!");
			return;
		}
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static  int getCont() {
		return Conta.cont;
	}
}
