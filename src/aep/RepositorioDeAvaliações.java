package aep;

import java.util.ArrayList;

public class RepositorioDeAvalia��es {
	ArrayList<Avalia��o> listaDeAlunos = new ArrayList<Avalia��o>();
	Aluno[] aluno;
	public int tamanhoDaLista = 0;
	
	public void adicionar(Avalia��o avalia��o) {
		listaDeAlunos.add(avalia��o);
	}
	
	
	
	public Aluno[] obterAprovados(Disciplina disciplina) {
		aluno = new Aluno[listaDeAlunos.size()];
		int tamanho = 0;
		for(int cont = 0;cont < listaDeAlunos.size();cont++) {
			if(listaDeAlunos.get(cont).getNota() >= 60.0 && listaDeAlunos.get(cont).getDisciplina() == disciplina ) {
				aluno[tamanho] = listaDeAlunos.get(cont).getAluno();
				tamanho++;
			} 
		}
		this.tamanhoDaLista = tamanho;
		return aluno;
	}
	
	public int getTamanhoDaLista() {
		return tamanhoDaLista;
	}
}
