package org.example.agenciaViajes.DAO;

import org.example.agenciaViajes.Domain.Usuario;
import org.example.*;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class usuarioDAO {

    private Connection conexion;

    public void conectar() throws ClassNotFoundException, SQLException, IOException {
        String host = configuration.getProperty(configuration.da);
        String port = configuration.getProperty("port");
        String name = configuration.getProperty("name");
        String username = configuration.getProperty("username");
        String password = configuration.getProperty("password");

        Class.forName("com.mysql.cj.jdbc.Driver");
        conexion = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + name + "?serverTimezone=UTC",
                username, password);
    }
    public static int crearUsuario(Usuario usuario) {
        int filasAfectadas = 0;
        try {
            String sql = "INSERT INTO usuarios (email, contraseña) VALUES (?, ?)";

            PreparedStatement sentencia = con.prepareStatement(sql);
            sentencia.setString(1, usuario.getNombre());
            sentencia.setString(2, usuario.getContrasena());

            sentencia.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;


        }
    }
}
