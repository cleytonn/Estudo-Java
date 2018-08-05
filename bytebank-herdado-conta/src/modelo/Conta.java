public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private static int cont;
	
	public Conta(int agencia, int numero) {
		Conta.cont++;
		
		if(agencia < 1) {
			throw new IllegalArgumentException("Agencia Inválida");
		}
		
		if(numero < 0) {
			throw new IllegalArgumentException("Número Inválido");
		}
		
		//System.out.println("O total de contas criadas é: " + Conta.cont);
		this.agencia = agencia;
		this.numero = numero;
		
		//System.out.println("Estou criando uma conta: " + this.numero);
	}
	
	private Cliente titular;
		
	public abstract void deposita(double valor);

	public void saca(double valor) throws SaldoInsuficienteException{
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
			this.saldo -= valor;
			System.out.println("Saldo:" + this.saldo);
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
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
