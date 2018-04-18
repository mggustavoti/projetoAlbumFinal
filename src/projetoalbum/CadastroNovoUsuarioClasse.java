
package projetoalbum;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.DirStateFactory;
import javax.swing.JOptionPane;


public class CadastroNovoUsuarioClasse {

    private Connection conexao;
    String nomeuser;

    public CadastroNovoUsuarioClasse() {
        try {
            this.conexao = CriarConexao.getConexao();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroNovoUsuarioClasse.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public int verificausuario(String nomeusuario) {
        String sql;
        sql = "Select nomeusuario from usuario where nomeusuario like '" + nomeusuario + "' ";
        int chave = 0;

        try {
            PreparedStatement stmt;
            stmt = conexao.prepareCall(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                JOptionPane.showMessageDialog(null, "Usuário já cadastrado, gentileza usar outro nome");
                chave = 1;

            }
            stmt.close();
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(CadastroNovoUsuarioClasse.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chave;

    }

    public int verificaemail(String email) {
        String sql;
        sql = "Select email from usuario where email like '" + email + "' ";
        int chave2 = 0;

        try {
            PreparedStatement stmt;
            stmt = conexao.prepareCall(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                JOptionPane.showMessageDialog(null, "Email já cadastrado, gentileza usar outro email");
                chave2 = 1;

            }
            stmt.close();
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(CadastroNovoUsuarioClasse.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chave2;
    }

    public void inserirusuario(String nome, String email, String senhausuario) {
        String sql;
        sql = "Insert into usuario (nomeusuario, email, senhausuario) values ('" + nome + "', '" + email + "', MD5('" + senhausuario + "'))";
        this.nomeuser = nome;
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.execute();
            stmt.close();

        } catch (SQLException ex) {
            Logger.getLogger(CadastroNovoUsuarioClasse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void listarusuario() {
        String sql;
        sql = "Select * from usuario";

        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(CadastroNovoUsuarioClasse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public void logEvento (){
        //File objDiretorio = new File("c:/Diretorio Logado/");
        //objDiretorio.mkdir();
        
        
        try {
            //File objArquivo = new File("c:/Diretorio Logado/criador de users.txt");
            DataLog date = new DataLog();
            
            FileReader objLer = new FileReader("c:/Diretorio Logado/criador de users.txt");
            BufferedReader objLerB = new BufferedReader(objLer);
            String linha;
            linha = objLerB.readLine();
            
            while (linha != null){
                System.out.println(linha + " criou usuário: " + nomeuser + " " + date.RetornaDataAtual());
                linha = objLerB.readLine();
            }
                


        } catch (IOException ex) {
            Logger.getLogger(CadastroNovoUsuarioClasse.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
        
        
    }
    
    

}





