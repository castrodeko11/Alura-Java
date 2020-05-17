package br.com.aco.java.io.teste;

import java.io.Serializable;

/**
 * Classe que representa um cliente no ByteBank
 * 
 * @author castrodeko11
 * @version 0.1
 *
 */

public class Cliente implements Serializable {
	

	private static final long serialVersionUID = -7926176495569878884L;
	
	private String nome;
	private String cpf;
	private String profissao;
	
	public String getNomeCpf() {
		return nome + ", " + cpf;
	}
	
	public String getNomeCpfProf() {
		return nome + ", " + cpf + ", " + profissao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}
