package exercicio;

import exercicio.Funcionario.Tipo;

public class ProxyInternetAccess implements IInternetAccess {

	private RealInternetAccess rede;
	private Funcionario funcionario;

	public void LiberarAcesso() {
		if(this.getFuncionario().getTipo() == Tipo.Comum)
			System.out.println("Acesso negado!!");
		else rede.LiberarAcesso();
	}

	public ProxyInternetAccess(Funcionario funcionario) {
		super();
		this.funcionario = funcionario;
		this.rede = new RealInternetAccess();
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public RealInternetAccess getRede() {
		return rede;
	}

	public void setRede(RealInternetAccess rede) {
		this.rede = rede;
	}
}