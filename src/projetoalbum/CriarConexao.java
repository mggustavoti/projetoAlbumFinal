
package projetoalbum;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CriarConexao {
    static int teste;
    public static Connection getConexao() throws SQLException{
        try {
            //Linha abaixo carregando o driver
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CriarConexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Linha abaixo retornando um objeto Connection
        return DriverManager.getConnection("jdbc:mysql://172.16.40.133/projetoalbum", "projeto", "projeto");
        
    }
}