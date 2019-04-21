package aep;

import java.io.ObjectInputStream.GetField;

public class App {

	public static void main(String[] args) {
		RepositorioDeAvaliações repo = new RepositorioDeAvaliações();
		Disciplina programacao = new Disciplina("programação");
		Disciplina matematica = new Disciplina("matematica");
		
		Aluno aluno = new Aluno(12, "adriano");
		Avaliação avaliação = new Avaliação(aluno, programacao, 40.0);
		repo.adicionar(avaliação);
		aluno = new Aluno(82, "ana");
		avaliação = new Avaliação(aluno, programacao, 60.0);
		repo.adicionar(avaliação);
		aluno = new Aluno(8, "beatriz");
		avaliação = new Avaliação(aluno, programacao, 80.0);
		repo.adicionar(avaliação);
		aluno = new Aluno(53, "bruno");
		avaliação = new Avaliação(aluno, matematica, 80.0);
		repo.adicionar(avaliação);
		aluno = new Aluno(41, "jose");
		avaliação = new Avaliação(aluno, matematica, 40.0);
		repo.adicionar(avaliação);
		aluno = new Aluno(21, "rodrigo");
		avaliação = new Avaliação(aluno, matematica, 70.0);
		repo.adicionar(avaliação);
		
		int cont = 0;
		System.out.println("Lista dos aprovados em "+ programacao.getNome());
		do {
			System.out.println(repo.obterAprovados(programacao)[cont].getNome());
			cont++;
		} while(cont < repo.getTamanhoDaLista());
		
		System.out.println("");
		
		cont = 0;
		System.out.println("Lista dos aprovados em "+ matematica.getNome());
		do {
			System.out.println(repo.obterAprovados(matematica)[cont].getNome());
			cont++;
		} while(cont < repo.getTamanhoDaLista());
		
	}

}
