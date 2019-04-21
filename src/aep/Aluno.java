package aep;

public class Aluno {
	private String nome;
	private int ra;
	
	public Aluno(int ra,String nome) {
		this.nome = nome;
		this.ra = ra;
	}
	public String getNome() {
		return nome;
	}
	public int getRa() {
		return ra;
	}
}
