
public class TestaGetESet {
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24226);
		
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		
		conta.setTitular(paulo);
		
		paulo.setNome("Paulo Henrique");
		
		Cliente cleyton = new Cliente();
		
		conta.setTitular(cleyton);
		
		cleyton.setNome("Cleyton Henrique");
		System.out.println(conta.getTitular().getNome());
	
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador");
		
		System.out.println(titularDaConta.getProfissao());
		
		System.out.println(titularDaConta);
		System.out.println(cleyton);
		System.out.println(conta.getTitular());
	}
}
