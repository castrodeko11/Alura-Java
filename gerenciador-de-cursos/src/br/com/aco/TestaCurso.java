package br.com.aco;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Curso javaColecoes = new Curso("Dominando as coleções", "André Oliviera");

//		List<Aula> aulas = javaColecoes.getAulas();
//		System.out.println(aulas);

//		javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayLista",21));
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayLista", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com Coleções", 22));

//		System.out.println(aulas);
		List<Aula> aulas = javaColecoes.getAulas();

		System.out.println(javaColecoes.getAulas());

//		System.out.println(aulas == javaColecoes.getAulas());

	}

}
