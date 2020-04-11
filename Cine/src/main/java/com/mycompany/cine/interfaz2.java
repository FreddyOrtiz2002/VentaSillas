package com.mycompany.cine;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class interfaz2 extends javax.swing.JFrame {
public int filas,columnas,funciones,CpedidaPrecios;
public boolean preciosiguales;
    public interfaz2(int filas, int columnas, int funciones, boolean preciosiguales) {
        this.filas = filas;
        this.columnas = columnas;
        this.funciones = funciones;
        this.preciosiguales=preciosiguales;
        CpedidaPrecios=funciones-1;
        DefaultTableModel modelo=new DefaultTableModel(filas,2);
        initComponents();
        this.setBounds(100, 100, 620, 500);
        this.setLocationRelativeTo(this);
        tabla.setModel(modelo);
        for(int i=0;i<filas;i++)
        {
            tabla.setValueAt("fila"+(i+1), i, 0);
        }
        
    }

    public interfaz2() {
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        definirPrecios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel1.setText("Digite el valor de los puestos de cada una de las filas:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 30, 311, 17);

        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(46, 91, 520, 170);

        definirPrecios.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        definirPrecios.setText("Definir precios");
        definirPrecios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                definirPreciosActionPerformed(evt);
            }
        });
        getContentPane().add(definirPrecios);
        definirPrecios.setBounds(210, 300, 190, 80);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void definirPreciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_definirPreciosActionPerformed
        boolean completos = true;
        for(int i=0;i<filas;i++)
        {
            if(tabla.getValueAt(i, 0)==null)
            {
                completos=false;
                JOptionPane.showMessageDialog(null, "hay precios sin haber sido ingresados");
                break;
            }else
            {
                completos=true;
            }
        }
        if(completos==true && CpedidaPrecios==0)
        {
            float[] precios=new float[filas];
            for(int i=0;i<filas;i++)
            {
                precios[i]=(float) tabla.getValueAt(i, 1);
            }
            
            
            
        }else if(completos==true && CpedidaPrecios>0)
        {
            
            
        }


    }//GEN-LAST:event_definirPreciosActionPerformed

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
            java.util.logging.Logger.getLogger(interfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton definirPrecios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}