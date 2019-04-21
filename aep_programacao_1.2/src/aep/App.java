package aep;

import java.io.ObjectInputStream.GetField;

public class App {

	public static void main(String[] args) {
		RepositorioDeAvalia��es repo = new RepositorioDeAvalia��es();
		Disciplina programacao = new Disciplina("programa��o");
		Disciplina matematica = new Disciplina("matematica");
		
		Aluno aluno = new Aluno(12, "adriano");
		Avalia��o avalia��o = new Avalia��o(aluno, programacao, 40.0);
		repo.adicionar(avalia��o);
		aluno = new Aluno(82, "ana");
		avalia��o = new Avalia��o(aluno, programacao, 60.0);
		repo.adicionar(avalia��o);
		aluno = new Aluno(8, "beatriz");
		avalia��o = new Avalia��o(aluno, programacao, 80.0);
		repo.adicionar(avalia��o);
		aluno = new Aluno(53, "bruno");
		avalia��o = new Avalia��o(aluno, matematica, 80.0);
		repo.adicionar(avalia��o);
		aluno = new Aluno(41, "jose");
		avalia��o = new Avalia��o(aluno, matematica, 40.0);
		repo.adicionar(avalia��o);
		aluno = new Aluno(21, "rodrigo");
		avalia��o = new Avalia��o(aluno, matematica, 70.0);
		repo.adicionar(avalia��o);
		
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
