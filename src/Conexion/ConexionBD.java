package Conexion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Lenovo
 */
public class ConexionBD {
    public static Connection getConexion() {
        Connection con = null;
        try {
            // Tu compañero cambiará esto por el nombre de SU base de datos y SU contraseña
            String url = "jdbc:mysql://localhost:3306/control_escolar"; 
            String user = "root";
            String pass = "monsalvo950590"; 
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.out.println("Esperando conexión real: " + e.getMessage());
        }
        return con;
    }
}
