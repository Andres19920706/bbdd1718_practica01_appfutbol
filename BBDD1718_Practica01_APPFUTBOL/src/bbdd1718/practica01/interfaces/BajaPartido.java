/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd1718.practica01.interfaces;


import bbdd1718.practica01.clases.AppFutbol;
import bbdd1718.practica01.clases.Partido;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class BajaPartido extends javax.swing.JFrame {

    /**
     * Creates new form BajaPartido
     */
    public BajaPartido() {
        initComponents();
        this.setLocationRelativeTo(null);//centramos.
        this.setTitle("App Futbol -> Eliminar Partido");
        //Inicializamos las listas
            //Lista de arbitros disponibles
        DefaultListModel modeloArbitro = new DefaultListModel(); //Contendor
        for (Map.Entry<Integer, Partido> entry : AppFutbol.lPartidos.entrySet()) {
            modeloArbitro.addElement(entry.getKey()+": Fecha- "+entry.getValue().getFecha()+", "+entry.getValue().getEq1().getNameEquipo()+" VS "+entry.getValue().getEq2().getNameEquipo()+", IDA= "+entry.getValue().getIda()); //modelo.addElement(ju.nombre);
        }
        this.jListPartidos.setModel(modeloArbitro); //Lo añaddimos al jList de Arbitros
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        labelSubTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListPartidos = new javax.swing.JList<>();
        buttonCancel = new javax.swing.JButton();
        buttonBajaOn = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelTitulo.setText("App Futbol Menu");

        labelSubTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelSubTitulo.setText("Baja de Partido");

        jListPartidos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListPartidos.setToolTipText("ID: FECHA,EQUIPO1 vs EQUIPO2, IDA");
        jScrollPane1.setViewportView(jListPartidos);

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Lista de jugadores dados de alta:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(labelTitulo))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(labelSubTitulo))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonBajaOn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonCancel)))))
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
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancel)
                    .addComponent(buttonBajaOn))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonBajaOnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBajaOnMouseClicked
        // Borrar un partido
        if(this.jListPartidos.getSelectedIndex() == -1){
           JOptionPane.showMessageDialog(null,"No has seleccionado ningun partido",
                   "AppFutbol",JOptionPane.ERROR_MESSAGE);
        }else{
            String []seleccion = this.jListPartidos.getSelectedValue().split(":");
            int keyIntPartido = Integer.parseInt(seleccion[0]);
            if(AppFutbol.BajaPartido(keyIntPartido)){
                this.dispose();
                AppFutbol.iu.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null,"Error al dar de baja el partido",
                   "AppFutbol",JOptionPane.ERROR_MESSAGE);
            }
        }
        /*
        if(this.jListPartidos.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(null, "No has seleccionado ningun arbitro",
                "AppFutbol",JOptionPane.INFORMATION_MESSAGE);
        }else{
            String [] selection = this.jListPartidos.getSelectedValue().split(": ");
            int i=-1;
            try{
                i = Integer.parseInt(selection[0]);
            }catch(Exception e){
                i=-1;
            }finally{
                if(AppFutbol.BajaJugador(i)){ //Exito al dar de baja al jugador
                    JOptionPane.showMessageDialog(null, "Jugador dado de baja",
                        "AppFutbol",JOptionPane.INFORMATION_MESSAGE);
                    //Cerramos ventna
                    this.dispose();
                    ventana.setVisible(true);
                }else{//Error al dar de baja al jugador
                    JOptionPane.showMessageDialog(null, "Jugador no dado de baja",
                        "AppFutbol",JOptionPane.ERROR_MESSAGE);
                }
            }
        }*/

    }//GEN-LAST:event_buttonBajaOnMouseClicked

    private void buttonBajaOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBajaOnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonBajaOnActionPerformed

    private void buttonCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCancelMouseClicked
        // Bottón para volver al menú

        this.dispose(); //Cerramos la ventana acutal.
        AppFutbol.iu.setVisible(true); //Mostramos el menu.
    }//GEN-LAST:event_buttonCancelMouseClicked

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
            java.util.logging.Logger.getLogger(BajaPartido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BajaPartido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BajaPartido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BajaPartido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BajaPartido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton buttonBajaOn;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jListPartidos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelSubTitulo;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}