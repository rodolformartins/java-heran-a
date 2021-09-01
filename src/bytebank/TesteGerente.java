package bytebank;

public class TesteGerente {
	public static void main(String[] args) {
		Gerente pedrao = new Gerente();
		
		pedrao.setNome("Pedrao");
		pedrao.setCpf("444555669977");
		pedrao.setSalario(4000);
		
		
		
		System.out.println(pedrao.getBonificacao());
		boolean senha = pedrao.autentica(223);
		
		System.out.println("Senha esta correta: " + senha);
		
		
	}
}
