package br.com.aco;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
//	private Set<Aluno> alunos = new LinkedHashSet<>();
//	private Set<Aluno> alunos = new TreeSet<>();
	private Map<Integer, Aluno> matriculadoParaAluno = new HashMap<>();

	public Curso(String nome, String instrutor) {
		super();
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);

	}

	public int geTempoTotal() {
//		int tempoTotal = 0;
//		for (Aula aula : aulas) {
//			tempoTotal += aula.getTempo();
//
//		}
//		return tempoTotal;
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Curso: " + nome + ", Tempo total: " + this.geTempoTotal() + "," + "aulas: " + this.aulas + "]";
	}

	public void matricular(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculadoParaAluno.put(aluno.getNumeroMatricula(), aluno);

	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatriculado(int numero) {
//		for (Aluno aluno : alunos) {
//			if (aluno.getNumeroMatricula() == numero) {
//				return aluno;
//			}
//		}
//		throw new NoSuchElementException("Matricula não encontrada" + numero);

		if (!matriculadoParaAluno.containsKey(numero))
			throw new NoSuchElementException();
		return matriculadoParaAluno.get(numero);

	}
}
