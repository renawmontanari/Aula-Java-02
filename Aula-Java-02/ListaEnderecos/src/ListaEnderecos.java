
public class ListaEnderecos {

	public static void main(String[] args) {
		Individuo individuoUm = new Individuo();
		
		individuoUm.setNome(" Marcelo ");
		individuoUm.setCpf(" 222.222.222-00 ");
		
		Endereco enderecoUm = new Endereco();
		enderecoUm.setCidade(" Bauru ");
		enderecoUm.setRua(" Rua 7 de setembro ");
		enderecoUm.setNumero(" 5-10 ");
		
		// Vincula o endereço
		individuoUm.setEndereco(enderecoUm);
		System.out.println(individuoUm);
	}
}
