/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.DatosSimulacion;
import Clases.ResultadosSimulacion;
import java.awt.List;
import java.security.Principal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


public class Simulacion extends javax.swing.JFrame {
    
  //  private Animacion bola;
     
    int susceptibles, infectados, recuperados, fallecidos,noAfectados, vacunados,contagiados;
    private boolean bandera = false;
     
    ResultMenu result = new ResultMenu();
     
    public Simulacion() {
        initComponents();
        this.setLocationRelativeTo(null);
        //ejecutar();
       // bola = new Animacion(BLUE,100,200); 
         
    }
    
    

    
    @SuppressWarnings("unchecked")
   // public void paint(Graphics g){
    //  super.paint(g);
    
   // int poblacion, infectados, recuperados,fallecidos, susceptibles;
    double poblacion_total, personasInfectadas,tiempo,tasaInter,probabilidadCon,tasaRec ,tasaMor,duracionMed;
   
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelInfectadas = new javax.swing.JLabel();
        jLabelRecuperados = new javax.swing.JLabel();
        jButtonVolver = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelNoAfectadas = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JButton();
        jButtonGrafico = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabelVacunados = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelPoblacion = new javax.swing.JLabel();
        jLabelFallecidos = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        prueba1 = new Ventanas.Prueba();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1100, 700));
        setMinimumSize(new java.awt.Dimension(1100, 700));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1100, 700));
        setSize(new java.awt.Dimension(1100, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelInfectadas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelInfectadas.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInfectadas.setText("Infectados");
        getContentPane().add(jLabelInfectadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 180, 60));

        jLabelRecuperados.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelRecuperados.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRecuperados.setText("recuperados");
        getContentPane().add(jLabelRecuperados, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 260, 180, 40));

        jButtonVolver.setBackground(new java.awt.Color(0, 0, 153));
        jButtonVolver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonVolver.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVolver.setText("VOLVER");
        jButtonVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonVolverMouseClicked(evt);
            }
        });
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 2, 36)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Simulación");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 180, -1));

        jLabelNoAfectadas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelNoAfectadas.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNoAfectadas.setText("noAfectada");
        getContentPane().add(jLabelNoAfectadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 210, -1));

        jButtonSalir.setBackground(new java.awt.Color(204, 0, 0));
        jButtonSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("SALIR");
        jButtonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSalirMouseClicked(evt);
            }
        });
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 30, -1, -1));

        jButtonGrafico.setBackground(new java.awt.Color(0, 102, 255));
        jButtonGrafico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonGrafico.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGrafico.setText("COMPARADOR DE DATOS");
        jButtonGrafico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonGrafico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonGraficoMouseClicked(evt);
            }
        });
        jButtonGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGraficoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGrafico, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 630, 270, 40));

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("INICIAR");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 630, 180, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Población vacunada:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, -1, -1));

        jLabelVacunados.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelVacunados.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVacunados.setText("noAfectada");
        getContentPane().add(jLabelVacunados, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, 220, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Poblacion no afectada:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));

        jLabelPoblacion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelPoblacion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPoblacion.setText("Poblacion");
        getContentPane().add(jLabelPoblacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 190, -1));

        jLabelFallecidos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelFallecidos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFallecidos.setText("fallecidos");
        getContentPane().add(jLabelFallecidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 500, 180, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Recuperados");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 110, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Infectados");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Fallecidos");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 340, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Susceptibles");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));
        getContentPane().add(prueba1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 770, 230));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 72, 1100, 10));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 1100, 20));

        jLabel8.setBackground(new java.awt.Color(0, 0, 153));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo-azul.jpg"))); // NOI18N
        jLabel8.setText("Edi");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 330, 150, 40));

        jLabel12.setBackground(new java.awt.Color(0, 0, 153));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo-azul.jpg"))); // NOI18N
        jLabel12.setText("Susceptibles");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 1030, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Población inicial");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagen.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 690));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo-azul.jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(1280, 700));
        jLabel2.setMinimumSize(new java.awt.Dimension(1280, 700));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
       //ejecutar(); 
       initData();
       
    }//GEN-LAST:event_formWindowActivated

    private void jButtonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirMouseClicked

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
       
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButtonVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVolverMouseClicked
        RegisterDataMenu registro = new RegisterDataMenu();
        registro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVolverMouseClicked

    private void jButtonGraficoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGraficoMouseClicked
        // TODO add your handling code here:
        
        result.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonGraficoMouseClicked

    private void jButtonGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGraficoActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGraficoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        prueba1.inicio();
        ejecutar();
        //jButton1.setEnabled(false);
        //jButton2.setEnabled(true);
       // jButtonGrafico.setEnabled(true);
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Simulacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Simulacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonGrafico;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFallecidos;
    private javax.swing.JLabel jLabelInfectadas;
    private javax.swing.JLabel jLabelNoAfectadas;
    private javax.swing.JLabel jLabelPoblacion;
    private javax.swing.JLabel jLabelRecuperados;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelVacunados;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private Ventanas.Prueba prueba1;
    // End of variables declaration//GEN-END:variables

   
    private void initData(){
        if(bandera == false)
        {
        jLabelPoblacion.setText(0 + " personas(s)");
      // delayForFiveSecond();
       jLabelInfectadas.setText(0 + " personas(s)");
       //delayForFiveSecond();
       jLabelRecuperados.setText(0 + " persona(s)");
       //delayForFiveSecond();
       jLabelFallecidos.setText(0 + " personas(s)");
       //delayForFiveSecond();
       jLabelNoAfectadas.setText(0 + " personas(s)");
       jLabelVacunados.setText(0 + " persona (s)");
       
      
        jButtonGrafico.setEnabled(true);
       bandera = true;
        }
    }
    
    private void ejecutar (){
        
        DatosSimulacion datos = DatosSimulacion.getDatosSimulacion();
        ResultadosSimulacion resultados = ResultadosSimulacion.getResultadosSimulacion();
        
        poblacion_total = datos.getCantidadPoblacion();
        personasInfectadas = resultados.getTotalContagiados();
        recuperados = (int) resultados.getRecuperados();
        infectados = (int) resultados.getInfectados();
        fallecidos = (int) resultados.getFallecidos();
        noAfectados = (int) resultados.getNoAfectados();
        vacunados = (int) resultados.getVacunados();
        
//        poblacion_total = result.poblacion_total;
//        
//        //result.poblacion_total = poblacion_total;
//        result.personasInfectadas = personasInfectadas;
//        result.tiempo = tiempo ;
//        result.tasaInter = tasaInter;
//        result.probabilidadCon = probabilidadCon;
//        result.tasaRec = tasaRec;
//        result.tasaMor = tasaMor;
//        result.duracionMed = duracionMed;
       result.resultado();
          
       jLabelPoblacion.setText(Math.round(poblacion_total) + " personas(s)");
       jLabelInfectadas.setText(infectados + " personas(s)");
       //delayForFiveSecond();
       jLabelRecuperados.setText(recuperados + " persona(s)");
       //delayForFiveSecond();
       jLabelFallecidos.setText(fallecidos + " personas(s)");
       //delayForFiveSecond();
       jLabelNoAfectadas.setText(noAfectados + " personas(s)");
       
       jLabelVacunados.setText(vacunados + " persona (s)");
//        
//         recuperados = (int)Math.round(result.R);
//         infectados = (int)Math.round(result.infectados) + (int)Math.round(result.R) + (int)Math.round(result.F);
//         fallecidos = (int)Math.round(result.F);
//         noAfectados = (int)Math.round(result.susceptibles);
    }
    
    private static void delayForFiveSecond(){
    try {
         System.out.println("espere 5 segundos");
         Thread.sleep(5000);
         Thread.interrupted();
    }catch (java.lang.InterruptedException iex){
         System.out.println(iex);
    }
    }
    
  
}





