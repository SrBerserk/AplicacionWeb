package com.example.demo.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Usuarios;
import com.example.demo.repository.UsuariosRepository;
import com.example.demo.service.UsuariosService;

@Service("usuariosservice")
public class UsuariosServiceImpl implements UsuariosService{

	@Autowired
	@Qualifier("usuariosrepository")
	private UsuariosRepository usuariosRepository;
	
	
	@Override
	public Usuarios addUsuarios(Usuarios usuarios) {
		
		return usuariosRepository.save(usuarios);
	}


	@Override
	public List<Usuarios> ListAllUsuarios() {
		
		List<Usuarios> users = new ArrayList<>();
		users = usuariosRepository.findAll();
		return users;
	}

}
