/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoalbum;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 05899165642
 */
public class DataLog {
    
    public String RetornaDataAtual (){
        SimpleDateFormat objData = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
        Date objAtual = new Date();
        return objData.format(objAtual);
    }
    
}

