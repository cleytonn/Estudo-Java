
public class TesteFuncionario {
	public static void main(String[] args) {
		Gerente dico = new Gerente();
		
		dico.setNome("Dico");
		dico.setCpf("564382391-00");
		dico.setSalario(2590.80);
		
		System.out.println(dico.getNome());
		System.out.println(dico.getBonificacao());
				
	}
}
