package teste;

import animais.Gato;
import pessoas.Medico;

public class Executa {

	public static void main(String[] args) {

		// Objeto Gato
		Gato gato = new Gato();
		gato.setNome("Amora");
		gato.setRaca("Persa");
		gato.setTutor("Carla");

		System.out.println(
				"Nome do pet: " + gato.getNome() + "\nRaça: " + gato.getRaca() + "\nTutor: " + gato.getTutor());
		gato.comer();
		gato.emitirSom();

		System.out.println("");

		// Objeto Médico
		Medico medico = new Medico();
		medico.setCadastro(13456);
		medico.setNome("Fernando");
		medico.setEspecialidade("Clínico Geral");

		System.out.println("Médico: " + medico.getNome() + "\nCadastro: " + medico.getCadastro() + 
				"\nEspecialidade: " + medico.getEspecialidade());
		medico.emitirReceita();
		medico.consultar();

	}

}
