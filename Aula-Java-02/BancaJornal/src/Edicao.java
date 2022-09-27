
public class Edicao {
	
	private String numero;
	private int tiragem;
	private Artigo artigo;
	 
	// Get and Set Número.
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	// Get and Set Tiragem.
	public int getTiragem() {
		return tiragem;
	}
	
	public void setTiragem(int tiragem) {
		this.tiragem = tiragem;
	}
	
	// Get and Set Artigo.
	public Artigo getArtigo() {
		return artigo;
	}
	
	public void setArtigo(Artigo artigo) {
		this.artigo = artigo;
	}
	
	// Retorna número da edição tiragem e dados do artigo.
	public String toString() {
		return numero + "\nTIRAGEM:: " + tiragem + "\nARTIGO:: " + artigo;
	}
}