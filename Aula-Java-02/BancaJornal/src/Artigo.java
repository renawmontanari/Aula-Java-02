
public class Artigo {
	
	private String nomeArtigo;
	private int numeroPaginas;
	
	// Get and Set Nome Artigo.
	public String getNomeArtigo() {
		return nomeArtigo;
	}
	
	public void setNomeArtigo(String nomeArtigo) {
		this.nomeArtigo = nomeArtigo;
	}
	
	// Get and Set Número de Páginas.
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
	// Retorna nome do artigo e número de páginas.
	public String toString() {
		return nomeArtigo + "\nPÁGINAS:: " + numeroPaginas;
	}
}
