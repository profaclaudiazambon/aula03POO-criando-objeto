package pessoas;

public class Auxiliar {

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

	public void realizarBanho() {
		System.out.println("Auxiliar está em serviço de banho");
	}
	
	public void realizarTosa() {
		System.out.println("Auxiliar está em serviço de tosa");
	}
}
