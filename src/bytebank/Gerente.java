package bytebank;

public class Gerente extends Funcionario {
	
	private int senha = 222;
	
	
	//M�todo para autenticar senha
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

}
