package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Usuarios;

@Controller
@RequestMapping("/usuarios")
public class UsuariosController {
	
	@GetMapping("/usersform")
	public String UsersForm(Model model) {
		model.addAttribute("usuarios", new Usuarios());
		return "usersform";
		
	}
	
	@PostMapping("/addusuarios")
	public String addUsuarios(@ModelAttribute(name="usuarios") Usuarios usuarios) {	
		return "users";
	}
	
	
}
