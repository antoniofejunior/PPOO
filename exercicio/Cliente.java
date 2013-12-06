package exercicio;

public class Cliente {
	private IInternetAccess rede;
	
	public void getConexao(Funcionario funcionario){
		this.rede = new ProxyInternetAccess(funcionario);
		this.rede.LiberarAcesso();
	}
}