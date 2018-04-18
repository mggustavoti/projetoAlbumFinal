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
    
    public void CriaLogLogado(String usuario) throws IOException{
        File diretorioLogado = new File("c:/Diretorio Logado");
        diretorioLogado.mkdir();
        
        DataLog data = new DataLog();
        
        File arquivoLogado = new File("c:/Diretorio Logado/arquivo logado.txt");
        //arquivoLogado.createNewFile();
        
        FileWriter objEscrita = new FileWriter(arquivoLogado, true);
        BufferedWriter objEscrever = new BufferedWriter(objEscrita);
        
        objEscrever.write(data.RetornaDataAtual());
        objEscrever.newLine();
        objEscrever.close();
        objEscrita.close();
        
        FileReader objLeitura = new FileReader(arquivoLogado);
        BufferedReader objLer = new BufferedReader(objLeitura);
        String Linha;
        Linha = objLer.readLine();     
        
        
        
        while(Linha != null){
            System.out.println(usuario + " logou no sistema - " + Linha);
            Linha = objLer.readLine();       
        }
             
        
                
    }
    
    public void CriaLogCriador(String usuario) throws IOException{
        File diretorioLogado = new File("c:/Diretorio Logado");
        diretorioLogado.mkdir();
        
        DataLog data = new DataLog();
        
        File arquivoLogado = new File("c:/Diretorio Logado/criador de users.txt");
        //arquivoLogado.createNewFile();
        
        FileWriter objEscrita = new FileWriter(arquivoLogado);
        BufferedWriter objEscrever = new BufferedWriter(objEscrita);
        
        
        objEscrever.write(usuario);
        objEscrever.close();
        objEscrita.close();
        
        
        
                
    }
   
    
}
