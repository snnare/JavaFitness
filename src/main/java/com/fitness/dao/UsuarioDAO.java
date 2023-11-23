package com.fitness.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.fitness.modelo.Usuario;

public class UsuarioDAO {
	private Connection connection;


    // Método para verificar las credenciales del usuario en la base de datos
    public Usuario verificarCredenciales(String correo, String contrasena) {
        String query = "SELECT * FROM test.usuarios WHERE correo = ? AND password = ?";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
        	preparedStatement.setString(1, correo);
            preparedStatement.setString(2, contrasena);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsuario(resultSet.getInt("id"));
                usuario.setNombreCompleto(resultSet.getString("nombre"));
                usuario.setCorreoElectronico(resultSet.getString("correo"));
                usuario.setContrasenia(resultSet.getString("password"));       
                return usuario;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null; // Credenciales incorrectas o error en la base de datos
    }


 // Método para obtener todos los usuarios desde la tabla "usuarios"
    public List<Usuario> obtenerTodosLosUsuarios() {
        String query = "SELECT * FROM test.usuarios";
        List<Usuario> usuarios = new ArrayList<>();

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsuario(resultSet.getInt("id"));
                usuario.setNombreCompleto(resultSet.getString("nombre"));
                usuario.setCorreoElectronico(resultSet.getString("correo"));
                usuario.setContrasenia(resultSet.getString("password"));
                // Puedes cargar más atributos del usuario según tu esquema de base de datos
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuarios;
    }


}

