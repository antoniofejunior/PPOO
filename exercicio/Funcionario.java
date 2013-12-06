package exercicio;

public class Funcionario {
	
	public enum Tipo{Gerente,Comum};
	
	private String nome;
	private Tipo hierarquia;
	
	public Funcionario(String nome, Tipo hierarquia) {
		super();
		this.nome = nome;
		this.hierarquia = hierarquia;
	}
	
	public Funcionario() {
		super();
		this.nome = null;
		this.hierarquia = null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Tipo getTipo() {
		return hierarquia;
	}

	public void setTipo(Tipo hierarquia) {
		this.hierarquia = hierarquia;
	}	
}
