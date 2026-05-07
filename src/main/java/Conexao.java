/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author gabri
 */
public class Conexao {

    // AJUSTE AQUI: Nome do seu banco e sua senha do MySQL
    private static final String URL = "jdbc:mysql://localhost:3306/seu_banco_aqui";
    private static final String USER = "root";
    private static final String PASS = "1234";

    public static Connection conectar() {
   
    try {
        // Verifique se a URL, usuário e senha estão corretos
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/seu_banco_aqui", "root", "1234");
    } catch (SQLException e) {
        System.out.println("Erro na conexão: " + e.getMessage());
        return null; // É aqui que o 'null' está sendo gerado
    }
}
    }


