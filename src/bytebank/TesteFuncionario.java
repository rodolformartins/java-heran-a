package bytebank;

public class TesteFuncionario {
	public static void main(String[] args) {
		
		Funcionario pedro = new Funcionario();
		
		pedro.setNome("Pedro");
		pedro.setCpf("222666777-95");
		pedro.setSalario(1200);
		
		System.out.println(pedro.getNome());
		System.out.println(pedro.getBonificacao());
		System.out.println(pedro.getSalario());
	}

}
