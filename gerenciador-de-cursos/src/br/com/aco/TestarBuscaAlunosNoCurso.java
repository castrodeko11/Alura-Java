package br.com.aco;

public class TestarBuscaAlunosNoCurso {
	
	public static void main(String[] args) {
		

		Curso javaColecoes = new Curso("Dominando as coleções", "André Oliviera");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayLista", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com Coleções", 24));

		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Cristiane Oliviera", 37525);
		Aluno a3 = new Aluno("Felipe Oliviera", 39400);
		Aluno a4 = new Aluno("André Oliviera", 37525);

		javaColecoes.matricular(a1);
		javaColecoes.matricular(a2);
		javaColecoes.matricular(a3);
		javaColecoes.matricular(a4);
		
		System.out.println("Quem é o aluno com matricula 37525?");
		Aluno aluno = javaColecoes.buscaMatriculado(37525);
		System.out.println("aluno : " + aluno);
	}

}
