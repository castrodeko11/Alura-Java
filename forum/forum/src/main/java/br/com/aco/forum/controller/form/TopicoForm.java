package br.com.aco.forum.controller.form;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.aco.forum.modelo.Curso;
import br.com.aco.forum.modelo.Topico;
import br.com.aco.forum.repository.CursoRepository;

public class TopicoForm {
	
	@NotNull(message = "Name cannot be null.") @NotEmpty @NotBlank
	private String titulo;
	private String mensagem;
	private String nomeCurso;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public Topico converter(CursoRepository cursoRespository) {
		// TODO Auto-generated method stub
		Curso curso  = cursoRespository.findByNome(nomeCurso);
		return new Topico(titulo, mensagem, curso);
	}

}
