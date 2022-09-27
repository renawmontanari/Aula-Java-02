
public class Revista {
	
	private String nome;
	private String issn;
	private Edicao edicao;
	
	// Get and Set Nome.
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// Get and Set ISSN.
	public String getIssn() {
		return issn;
	}
	
	public void setIssn(String issn) {
		this.issn = issn;
	}
	
	// Get and Set Edição.
	public Edicao getEdicao() {
		return edicao;
	}
	
	public void setEdicao(Edicao edicao) {
		this.edicao = edicao;
	}
	
	// Retorna nome da revista o código do issn com a sua edição.
	public String toString() {
		return "**** NOME DA REVISTA ****\n\n" + "REVISTA::" + nome + "\nCÓDIGO ISSN::" + issn + "\nEDIÇÃO:: " + edicao; 
	}
}
