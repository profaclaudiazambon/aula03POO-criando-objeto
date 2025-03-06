package pessoas;

public class Medico {

	private String nome;
	private int cadastro;
	private String especialidade;

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
	
	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public void consultar() {
		System.out.println("Médico está em atendimento");
	}
	
	public void emitirReceita() {
		System.out.println("Médico emitiu uma receita");
	}
}
