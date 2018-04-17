package projetoalbum;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oi
 */
public class LogDeLogado {
    
    public void CriaLogLogado() throws IOException{
        File diretorioLogado = new File("c:/Diretorio Logado");
        diretorioLogado.mkdir();
        
        DataAtual data = new DataAtual();
        
        File arquivoLogado = new File("c:/Diretorio Logado/arquivo logado.txt");
        //arquivoLogado.createNewFile();
        
        FileWriter objEscrita = new FileWriter(arquivoLogado, true);
        BufferedWriter objEscrever = new BufferedWriter(objEscrita);
        
        objEscrever.write(data.retornaDataAtual());
        objEscrever.newLine();
        objEscrever.close();
        objEscrita.close();
        
        FileReader objLeitura = new FileReader(arquivoLogado);
        BufferedReader objLer = new BufferedReader(objLeitura);
        String Linha;
        Linha = objLer.readLine();     
        
        VerificacaoDados objNomeLogado = null;
        try {
            objNomeLogado = new VerificacaoDados();
        } catch (SQLException ex) {
            Logger.getLogger(LogDeLogado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        while(Linha != null){
           System.out.println(objNomeLogado.nomedologado + " logou no sistema - " + Linha);
           Linha = objLer.readLine();
        }      
        
    }
   
    
}
