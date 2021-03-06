/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd1718.practica01.interfaces;


import bbdd1718.practica01.clases.AppFutbol;
import bbdd1718.practica01.clases.Equipo;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class BajaEquipo extends javax.swing.JFrame {

    /**
     * Creates new form BajaEquipo
     */
    public BajaEquipo() {
        initComponents();
        this.setLocationRelativeTo(null);//centramos.
        this.setTitle("Baja Equipo");
        //Lista de Jugadores Disponibles
        DefaultListModel modelo = new DefaultListModel(); //Contendor
        for (Map.Entry<Integer, Equipo> entry : AppFutbol.lEquipos.entrySet()) {
            modelo.addElement(entry.getKey()+": "+entry.getValue().getNameEquipo()); //modelo.addElement(ju.nombre);
        }
        this.equiposActivos.setModel(modelo); //Lo añaddimos al jList
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonCancel = new javax.swing.JButton();
        buttonBajaOn = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        equiposActivos = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        labelSubTitulo = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        buttonCancel.setText("Menu");
        buttonCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCancelMouseClicked(evt);
            }
        });

        buttonBajaOn.setText("Dar Baja");
        buttonBajaOn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonBajaOnMouseClicked(evt);
            }
        });
        buttonBajaOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBajaOnActionPerformed(evt);
            }
        });

        equiposActivos.setToolTipText("ID: Nombre");
        jScrollPane1.setViewportView(equiposActivos);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Lista de equipos dados de alta:");

        labelSubTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelSubTitulo.setText("Baja de Equipo");

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelTitulo.setText("App Futbol Menu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(buttonBajaOn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonCancel))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(109, 109, 109)
                            .addComponent(labelTitulo))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(128, 128, 128)
                            .addComponent(labelSubTitulo))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSubTitulo)
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonBajaOn)
                    .addComponent(buttonCancel))
                .addGap(0, 29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCancelMouseClicked
        // Bottón para volver al menú

        this.dispose(); //Cerramos la ventana acutal.
        AppFutbol.iu.setVisible(true); //Mostramos el menu.
    }//GEN-LAST:event_buttonCancelMouseClicked

    private void buttonBajaOnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBajaOnMouseClicked
        // Borrar a un equipo
        if(this.equiposActivos.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(null, "No has seleccionado ningun equipo",
                            "AppFutbol",JOptionPane.INFORMATION_MESSAGE);
        }else{            
            String [] selection = this.equiposActivos.getSelectedValue().split(": ");
            int i=-1;
            try{
                i = Integer.parseInt(selection[0]);
            }catch(Exception e){
                i=-1;
            }finally{
                if(AppFutbol.BajaEquipo(i)){ //Exito al dar de baja al jugador
                    JOptionPane.showMessageDialog(null, "Equipo dado de baja",
                        "AppFutbol",JOptionPane.INFORMATION_MESSAGE);
                    //Cerramos ventna
                    this.dispose();
                    AppFutbol.iu.setVisible(true);
                }else{//Error al dar de baja al jugador
                    JOptionPane.showMessageDialog(null, "Equipo no dado de baja",
                        "AppFutbol",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
    }//GEN-LAST:event_buttonBajaOnMouseClicked

    private void buttonBajaOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBajaOnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonBajaOnActionPerformed

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
            java.util.logging.Logger.getLogger(BajaEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BajaEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BajaEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BajaEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BajaEquipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton buttonBajaOn;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JList<String> equiposActivos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelSubTitulo;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
