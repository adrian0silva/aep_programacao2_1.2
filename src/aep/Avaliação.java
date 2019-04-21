package aep;

public class Avaliação {
	private double nota;
	Disciplina disciplina;
	Aluno aluno;
	
	public Avaliação(Aluno aluno,Disciplina disciplina,double nota) {
		this.aluno = aluno;
		this.disciplina = disciplina;
		this.nota = nota;
	}
	
	public Disciplina getDisciplina() {
		return disciplina;
	}
	
	public Aluno getAluno() {
		return aluno;
	}
	
	public double getNota() {
		return nota;
	}
}
