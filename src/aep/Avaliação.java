package aep;

public class Avalia��o {
	private double nota;
	Disciplina disciplina;
	Aluno aluno;
	
	public Avalia��o(Aluno aluno,Disciplina disciplina,double nota) {
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
