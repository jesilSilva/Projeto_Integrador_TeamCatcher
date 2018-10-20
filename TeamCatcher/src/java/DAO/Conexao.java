package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jesiel
 */
public class Conexao {

    public static Connection getConexao() {

        try {
            String driverName = "com.mysql.jdbc.Driver";
            Connection con = null;
            Class.forName(driverName);
            String url = "jdbc:mysql://localhost:3306/teamcatcher";
            String usuario = "root";
            String senha = "";
            con = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Sucesso na Conexão !");
            return con;
        } catch (ClassNotFoundException e) {
            System.out.println("O driver especificado não foi encontrado. " + e.getMessage());
            return null;
        } catch (SQLException e) {
            System.out.println("Não foi possível conectar ao Banco de Dados. " + e.getMessage());
            return null;
        }
    }
}
