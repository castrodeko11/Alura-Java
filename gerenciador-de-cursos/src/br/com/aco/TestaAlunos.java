package br.com.aco;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {

	public static void main(String[] args) {
		Collection<String> alunos = new HashSet<>();

		alunos.add("André Oliveira");
		alunos.add("Felipe Castro de Oliveira");
		alunos.add("Manoel Oliveira");
		alunos.add("Maria Oliveira");
		alunos.add("Cristiane Oliveira");
		alunos.add("Rex Oliveira");
		alunos.add("André Oliveira");
		
		boolean andreEstaMatriculado = alunos.contains("André Oliveira");
		alunos.remove("Rex Oliveira");
		
		
		System.out.println(andreEstaMatriculado);
		System.out.println(alunos.size());
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println(alunos);
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
		
		

	}

}
