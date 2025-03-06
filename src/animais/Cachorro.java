package animais;

public class Cachorro {

	private String nome;
	private String tutor;
	private String raca;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTutor() {
		return tutor;
	}

	public void setTutor(String tutor) {
		this.tutor = tutor;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public void comer() {
		System.out.println("O cachorro está comendo");
	}

	public void emitirSom() {
		System.out.println("O cachorro está latindo");
	}

}
