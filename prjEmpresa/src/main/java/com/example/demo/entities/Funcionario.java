package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Funcionario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String funNome;
	private String funNascimento;
	private String funSalario;

	@OneToOne
	@JoinColumn(name = "departamento_id")
	private Departamento departamento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFunNome() {
		return funNome;
	}

	public void setFunNome(String funNome) {
		this.funNome = funNome;
	}

	public String getFunNascimento() {
		return funNascimento;
	}

	public void setFunNascimento(String funNascimento) {
		this.funNascimento = funNascimento;
	}

	public String getFunSalario() {
		return funSalario;
	}

	public void setFunSalario(String funSalario) {
		this.funSalario = funSalario;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
}
