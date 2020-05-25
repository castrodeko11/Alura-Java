package br.com.aco;

import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções", "André Oliviera");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayLista", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com Coleções", 24));

		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Cristiane Oliviera", 37525);
		Aluno a3 = new Aluno("Felipe Oliviera", 39400);

		javaColecoes.matricular(a1);
		javaColecoes.matricular(a2);
		javaColecoes.matricular(a3);

		System.out.println("Todos os alunos matriculados nesse curso ");

		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterator = alunos.iterator();
		iterator.hasNext();

		while (iterator.hasNext()) {
			Aluno proximo = iterator.next();
			System.out.println(proximo);
		}

		Vector<Aluno> vetor = new Vector<>();

//		javaColecoes.getAlunos().forEach(a -> {
//			System.out.println(a);
//		});

		System.out.println("O aluno " + a1 + " está matriculado");
		System.out.println(javaColecoes.estaMatriculado(a1));

		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		System.out.println("E esse Turini, está matriculado ? ");
		System.out.println(javaColecoes.estaMatriculado(turini));

		System.out.println("O a1 é equals ao Turini?");
		System.out.println(a1.equals(turini));

		// Obrigatóriamente o seguinte é true:
		System.out.println(a1.hashCode() == turini.hashCode());
	}
}
