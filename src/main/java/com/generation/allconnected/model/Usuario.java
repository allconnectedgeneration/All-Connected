package com.generation.allconnected.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo nome é obrigatório!")
	@Size(min = 3, max = 100, message = "O campo nome precisa ter entre 3 à 100 caracteres")
	private String nome;
	
	@Schema(example = "email@email.com.br")
	@NotBlank(message = "O atributo e-mail é obrigatório!")
	@Size(min = 3, max = 100, message = "O campo e-mail precisa ter entre 3 à 100 caracteres")
	private String usuario;
	
	@NotBlank(message = "O atributo senha é obrigatório!")
	@Size(min = 3, max = 100, message = "O campo senha precisa ter entre 3 à 100 caracteres")
	private String senha;
	
	@Size(max = 5000)
	private String foto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	

	
	
	
}
