package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Departamento {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String depNome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDepNome() {
		return depNome;
	}

	public void setDepNome(String depNome) {
		this.depNome = depNome;
	}

}
