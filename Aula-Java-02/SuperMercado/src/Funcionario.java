
public class Funcionario {
	private Residencia residencia;
	private String nome;
	private String cpf;
	
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
	
	public Residencia getResidencia() {
		return residencia;
	}
	
	public void setResidencia(Residencia residencia) {
		this.residencia = residencia;
	}
	
	public String toString() {
		return " nome " + nome + " doc " + cpf + " logradouro " + residencia;
	}
}
