package com.fitness.controlador;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.fitness.controlador.*;
import com.fitness.modelo.*;

import java.io.IOException;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Obtiene los parámetros del formulario (nombre de usuario y contraseña)
        String correo = request.getParameter("correo");
        String contrasena = request.getParameter("password");

        // Crea instancias de UsuarioService y UsuarioDAO (ajusta la configuración de la base de datos)
        UsuarioService usuarioService = new UsuarioService();
        //UsuarioDAO usuarioDAO = new UsuarioDAO(connection);

        // Verifica las credenciales del usuario (puedes usar UsuarioDAO para verificar en la base de datos)
        Usuario usuario = usuarioService.iniciarSesion(correo, contrasena);

        if (usuario != null) {
            // Inicio de sesión exitoso
            // Puedes establecer la sesión del usuario aquí si es necesario
            //request.getSession().setAttribute("usuario", usuario);

            // Redirige a la página de bienvenida o a otra página después del inicio de sesión
            response.sendRedirect("bienvenido.jsp");
        } else {
            // Credenciales incorrectas
            // Puedes mostrar un mensaje de error en la página de inicio de sesión
            response.sendRedirect("login.jsp?error=1"); // Agrega un parámetro "error" para mostrar un mensaje de error	
	
		doGet(request, response);
        }

	}
}
