
package Ventana;
import Clases.Escanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import org.omg.CORBA.Object;


public class VistaAnalizador extends javax.swing.JFrame {
    
public static List <String> palabrasReservadas;
public static List<String> operadores;

  
    
    public VistaAnalizador() {
        initComponents();
        inicializar();
    }
   private void inicializar(){
       
      palabrasReservadas = new ArrayList();
      palabrasReservadas.add("public");
      palabrasReservadas.add("class");
      palabrasReservadas.add("extends");    
      palabrasReservadas.add("private");
      palabrasReservadas.add("boolean");
      palabrasReservadas.add("break");
      palabrasReservadas.add("case");
      palabrasReservadas.add("abstract"); 
      palabrasReservadas.add("char");
      palabrasReservadas.add("class");
      palabrasReservadas.add("default");
      palabrasReservadas.add("do");
      palabrasReservadas.add("double");
      palabrasReservadas.add("else");   
      palabrasReservadas.add("enum");
      palabrasReservadas.add("void");
      palabrasReservadas.add("final");
      palabrasReservadas.add("finally"); 
      palabrasReservadas.add("float");       
      palabrasReservadas.add("for");     
      palabrasReservadas.add("goto");     
      palabrasReservadas.add("implements");
      palabrasReservadas.add("if");     
      palabrasReservadas.add("import");      
      palabrasReservadas.add("instanceof");
      palabrasReservadas.add("int");
      palabrasReservadas.add("long");
      palabrasReservadas.add("new");
      palabrasReservadas.add("package");
      palabrasReservadas.add("protected");
      palabrasReservadas.add("return");
      palabrasReservadas.add("static");
      palabrasReservadas.add("switch");
      palabrasReservadas.add("this");
      palabrasReservadas.add("while");
      palabrasReservadas.add("assert");
      palabrasReservadas.add("byte");
      palabrasReservadas.add("native");
      palabrasReservadas.add("try");
      palabrasReservadas.add("long");
      palabrasReservadas.add("this");
      palabrasReservadas.add("switch");
      palabrasReservadas.add("interface");
      
  
 operadores = new ArrayList();
 operadores.add("+");   
        
   
 }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        BtnDescargarArchivo = new javax.swing.JButton();
        BtnAnalizar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane2.setViewportView(txtArea);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 23, 280, 96);

        BtnDescargarArchivo.setText("DescargarArchivo");
        BtnDescargarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDescargarArchivoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnDescargarArchivo);
        BtnDescargarArchivo.setBounds(350, 30, 117, 23);

        BtnAnalizar.setText("Analizar");
        BtnAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAnalizarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAnalizar);
        BtnAnalizar.setBounds(360, 83, 110, 30);

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Fila", "col", "Lexema", "Tipo"
            }
        ));
        jScrollPane3.setViewportView(Tabla);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(20, 170, 540, 160);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnDescargarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDescargarArchivoActionPerformed
       
  JFileChooser fileChooser = new JFileChooser();
  fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int result = fileChooser.showOpenDialog(this); 
  if (result == JFileChooser.CANCEL_OPTION) return;  
         File name = fileChooser.getSelectedFile();
  if (name.exists() && name.isFile()){
    
   try {
           
   BufferedReader input = new BufferedReader (new FileReader (name) );  
      StringBuffer buffer = new StringBuffer();
      String text;
      txtArea.setText("");
          while ((text=input.readLine()) !=null){  
      txtArea.append(text + "\n");
    
            
            }
            
        }
            catch (Exception e) {
         
             e.printStackTrace();
        }
    }
    
    
  
  
  
    }//GEN-LAST:event_BtnDescargarArchivoActionPerformed

    private void BtnAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAnalizarActionPerformed
        
      Escanner escanner = new Escanner();  
      escanner.analizar(txtArea.getText());
    
    }//GEN-LAST:event_BtnAnalizarActionPerformed

    
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
            java.util.logging.Logger.getLogger(VistaAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
          
            public void run() {
                new VistaAnalizador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAnalizar;
    private javax.swing.JButton BtnDescargarArchivo;
    public static javax.swing.JTable Tabla;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
