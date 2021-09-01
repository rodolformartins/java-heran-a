package bytebank;

public class Funcionario {
	
	//Atributos
	private String nome;
	private String cpf;
	private double salario;
	
	
	
	//Métodos getters and setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	//Método para receber bonificacao
	public double getBonificacao() {
		return this.salario * 0.1;
	}
	
	
	
	

}
