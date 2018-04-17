/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoalbum;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author 05437802609
 */
public class MusicaInterface extends javax.swing.JFrame {
    private Player ply;
    private boolean pl;
    private String[] musicas = new String[4];
    private int cont = 0;
    
            
    public MusicaInterface() {
        initComponents();
        
        musicas[0] = "01 Ana Carolina - Rosas";
        musicas[1] = "02 Kid Abelha - Chuva";
        musicas[2] = "03 Pitty - Deja Vu";
        musicas[3] = "04 Tom Jobim - WAVE";
        
        jb_Stop.setEnabled(false);
        jb_Voltar.setEnabled(false);
        jb_Avancar.setEnabled(false);
        
        
    }
    
    class GerenciaMusica extends Thread{
        public void run(){
            InputStream input = this.getClass().getResourceAsStream("/musicas/" + musicas[cont] + ".mp3");
            try {
                
                ply = new Player(input);
                ply.play();
                
            } catch (JavaLayerException ex) {
                Logger.getLogger(MusicaInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lb_Musica = new javax.swing.JLabel();
        jb_Play = new javax.swing.JButton();
        jb_Stop = new javax.swing.JButton();
        jb_Voltar = new javax.swing.JButton();
        jb_Avancar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Player");

        lb_Musica.setText("Música:");

        jb_Play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/play.png"))); // NOI18N
        jb_Play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_PlayActionPerformed(evt);
            }
        });

        jb_Stop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/stop.png"))); // NOI18N
        jb_Stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_StopActionPerformed(evt);
            }
        });

        jb_Voltar.setText("<<");
        jb_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_VoltarActionPerformed(evt);
            }
        });

        jb_Avancar.setText(">>");
        jb_Avancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_AvancarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(lb_Musica, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jb_Play)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_Stop)
                        .addGap(56, 56, 56)
                        .addComponent(jb_Voltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_Avancar)))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lb_Musica, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_Voltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jb_Play)
                        .addComponent(jb_Stop))
                    .addComponent(jb_Avancar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_VoltarActionPerformed
        cont--;
        lb_Musica.setText("Música: " + musicas[cont]);
        
        if(pl == true){
            ply.close();
            GerenciaMusica mp3 = new GerenciaMusica();
            mp3.start();
        }
        
        if(cont == 0){
            jb_Voltar.setEnabled(false);
        }
        
        if(cont <3){
            jb_Avancar.setEnabled(true);
        }
    }//GEN-LAST:event_jb_VoltarActionPerformed

    private void jb_AvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_AvancarActionPerformed
        jb_Voltar.setEnabled(true);
        cont++;
        lb_Musica.setText("Música: " + musicas[cont]);
        
        if(pl == true){
            ply.close();
            GerenciaMusica mp3 = new GerenciaMusica();
            mp3.start();
        }
        
        if(cont == 3){
            jb_Avancar.setEnabled(false);
        }
        
                
    }//GEN-LAST:event_jb_AvancarActionPerformed

    private void jb_PlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_PlayActionPerformed
        GerenciaMusica mp3 = new GerenciaMusica();
        mp3.start();
        lb_Musica.setText("Música: " + musicas[cont]);
        jb_Play.setEnabled(false);
        jb_Stop.setEnabled(true);
        jb_Avancar.setEnabled(true);
        pl = true;
        
    }//GEN-LAST:event_jb_PlayActionPerformed

    private void jb_StopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_StopActionPerformed
        ply.close();
        jb_Play.setEnabled(true);
        jb_Stop.setEnabled(false);
    }//GEN-LAST:event_jb_StopActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MusicaInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusicaInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusicaInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusicaInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusicaInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jb_Avancar;
    private javax.swing.JButton jb_Play;
    private javax.swing.JButton jb_Stop;
    private javax.swing.JButton jb_Voltar;
    private javax.swing.JLabel lb_Musica;
    // End of variables declaration//GEN-END:variables
}
