/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoalbum;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author 05437802609
 */
public class LogDeLogado {
    
    public void CriaLogLogado() throws IOException{
        File diretorioLogado = new File("c:/Diretorio Logado");
        diretorioLogado.mkdir();
        
        File arquivoLogado = new File("c:/Diretorio Logado/arquivo logado.txt");
        
        FileWriter objEscrever = new FileWriter(arquivoLogado, true);
        //BufferedWriter objEscrever = new BufferedWriter(writer)
        
        
        
    }
   
    
    
}
