package pessoas;

public class Atendente {

	private String nome;
	private int cadastro;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCadastro() {
		return cadastro;
	}

	public void setCadastro(int cadastro) {
		this.cadastro = cadastro;
	}

	public void agendarConsultas() {
		System.out.println("Atendente agendou uma consulta");
	}
}
