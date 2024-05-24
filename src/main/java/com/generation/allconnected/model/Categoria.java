package com.generation.allconnected.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="tb_categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo Especificação é obrigatório!")
	@Size(min = 3, max = 100, message = "O atributo especificação deve ter no mínimo 3 caracteres e no máximo 100 caracteres.")
	private String especificacao;
	
	@NotBlank(message = "O atributo Tipo é obrigatório!")
	@Size(min = 3, max = 100, message = "O atributo tipo deve ter no mínimo 3 caracteres e no máximo 100 caracteres. ")
	private String tipo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEspecificacao() {
		return especificacao;
	}

	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
	
	


