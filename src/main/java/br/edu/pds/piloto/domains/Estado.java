package br.edu.pds.piloto.domains;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="estados")
public class Estado {

	public Estado() {
		
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	@NotBlank(message = "Preencha o campo Estado devidamente!!!")
	private String nome;
	@NotBlank(message = "Preencha o campo Sigla Estado devidamente!!!")
	@Size(min=2,max=2)
	private String sigla;

	
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
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	@Override
	public String toString() {
		return sigla + " - " + nome;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estado other = (Estado) obj;
		return Objects.equals(id, other.id);
	}	
}
