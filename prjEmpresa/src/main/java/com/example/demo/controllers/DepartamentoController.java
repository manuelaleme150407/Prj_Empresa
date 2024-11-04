package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Departamento;
import com.example.demo.services.DepartamentoService;

@RestController
@RequestMapping("/departamentos")
public class DepartamentoController {

	private final DepartamentoService departamentoservice;

	@Autowired
	public DepartamentoController(DepartamentoService departamentoservice) {
		this.departamentoservice = departamentoservice;
	}

	@PostMapping
	public Departamento createDepartamento(@RequestBody Departamento departamento) {
		return departamentoservice.saveDepartamento(departamento);
	}

	@GetMapping
	public List<Departamento> getAllDepartamento() {
		return departamentoservice.getAllDepartamento();
	}

	@GetMapping("/{id}")
	public Departamento getDepartamento(@PathVariable Long id) {
		return departamentoservice.getDepartamentoById(id);
	}

}
