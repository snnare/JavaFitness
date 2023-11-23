package com.fitness.controlador;

import com.fitness.dao.*;
import com.fitness.modelo.*;

public class UsuarioService {
	private UsuarioDAO usuarioDAO;
	
	public UsuarioService() {
		this.usuarioDAO = new UsuarioDAO();
	}
	
	//Método para verificar las credenciales del usuario y 
	//devolver un objeto de usuario si son correctas
	public Usuario iniciarSesion(String nombreUsuario, String contrasena) {
		return usuarioDAO.verificarCredenciales(nombreUsuario, contrasena);
	}

}
