
public class BancaJornal {

	public static void main(String[] args) {
		
		// Novo Objeto Revista 1 e add valores em nome e Issn.
		Revista revistaUm = new Revista();
		revistaUm.setNome(" Java Magazine ");
		revistaUm.setIssn(" 2233445566-77 ");
		
		// Novo Objeto Edição e add valores em número e tiragem.
		Edicao edicao = new Edicao();
		edicao.setNumero(" 01 ");
		edicao.setTiragem(5000);
		
		// Novo Objeto Artigo 1 e add valores em nome do artigo e número de páginas.
		Artigo artigoUm = new Artigo();
		artigoUm.setNomeArtigo(" Java para WEB ");	
		artigoUm.setNumeroPaginas(12);
		
		// Vinculando revista com edição e artigo.
		revistaUm.setEdicao(edicao);
		edicao.setArtigo(artigoUm);
		
		// Imprimindo na tela do usúario.
		System.out.println(revistaUm);
	}
}
