
public class SuperMercado {

	public static void main(String[] args) {
		Funcionario funcionarioUm = new Funcionario();
	
		funcionarioUm.setNome(" José Alberto ");
		funcionarioUm.setCpf(" 777.222.333-90 ");
		
		Residencia residenciaUm = new Residencia();
		residenciaUm.setCidade(" Bauru ");
		residenciaUm.setRua(" Rua 9 de Outubro ");
		residenciaUm.setNumero(" 7-90 ");
		
		// Vincula o endereço
		funcionarioUm.setResidencia(residenciaUm);
		System.out.println(funcionarioUm);
	}

}
