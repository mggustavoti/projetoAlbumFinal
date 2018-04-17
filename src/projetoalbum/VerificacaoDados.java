
package projetoalbum;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class VerificacaoDados {
    
    private Connection conexao;
    ArrayList<Usuario> recebeDados = new ArrayList();
     
    public VerificacaoDados() throws SQLException{
        this.conexao = CriarConexao.getConexao();
    }
    
    public int VerificarUsuario(String nome, String senha) throws SQLException{
        String sql = "Select nomeusuario, senhausuario from usuario where nomeusuario like'" + nome + "'and senhausuario like MD5('"+ senha +"')";
        
        int chave = 0;
        
        PreparedStatement stmt = conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        
        while(rs.next()){
            Usuario objUsuario = new Usuario();
            objUsuario.setNomeusuario(rs.getString("nomeusuario"));
            objUsuario.setSenhausuario(rs.getString("senhausuario"));
            
            recebeDados.add(objUsuario);
            chave = 1;                
         }
        
        if(recebeDados.size() == 0){
            JOptionPane.showMessageDialog(null, "Usuário e/ou Senha incorretos!");
        }
        else{
            /*
            for(int i = 0; i< recebeDados.size(); i++){
                System.out.println("Usuario: " + recebeDados.get(i).getNomeusuario());
                System.out.println("Senha: " + recebeDados.get(i).getSenhausuario());
            
                if ( !((recebeDados.get(i).getNomeusuario()).equals(nome)) || !((recebeDados.get(i).getSenhausuario()).equals(senha) ) ){
                    JOptionPane.showMessageDialog(null, "Usuário e/ou Senha incorretos!");    
                }else{*/
                
                new InterfacePrincipal().setVisible(true);
            }
           
        rs.close();
        stmt.close();
        
        return chave;
    }
    
    
    
}
