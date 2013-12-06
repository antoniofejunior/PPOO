package exercicio;

import exercicio.Funcionario.Tipo;

public class App {	
	
	public static void main(String[] args) {
		Cliente menenger = new Cliente();
		
		Funcionario funcionarioComun = new Funcionario("Euller", Tipo.Comum);
		Funcionario Gerente = new Funcionario("Antonio", Tipo.Gerente);

		menenger.getConexao(funcionarioComun);
		menenger.getConexao(Gerente);
	}
}