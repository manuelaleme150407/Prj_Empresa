package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Funcionario;
import com.example.demo.entities.Departamento;
import com.example.demo.repositories.FuncionarioRepository;
import com.example.demo.repositories.DepartamentoRepository;

@Service
public class FuncionarioService {
	
	private final FuncionarioRepository funcionarioRepository;
	private final DepartamentoRepository departamentoRepository;
	
	@Autowired
	public FuncionarioService(DepartamentoRepository departamentoRepository, FuncionarioRepository funcionarioRepository) {
		this.funcionarioRepository = funcionarioRepository;
		this.departamentoRepository = departamentoRepository;
	}
	
	public Funcionario salvarFuncionario(Funcionario funcionario) {
		if (funcionario.getDepartamento() !=null && funcionario.getDepartamento().getId() !=null ) {
			Optional<Departamento> departamento = departamentoRepository.findById(funcionario.getDepartamento().getId());
			if(departamento.isPresent()) {
				funcionario.setDepartamento(departamento.get());
				return funcionarioRepository.save(funcionario);
			} else {
				throw new RuntimeException("Funcionário não encontrado");
			}
			} else {
				throw new RuntimeException("Funcionário encontrado");
			}
	}
	
	public Funcionario buscarFuncionarioPorId(Long Id) {
		return funcionarioRepository.findById(Id).orElse(null);
	}
	
	public List<Funcionario> buscarTodosFuncionarios(){
		return funcionarioRepository.findAll();
	}

	
}
