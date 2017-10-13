/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd1718.practica01.interfaces;


import bbdd1718.practica01.clases.AppFutbol;
import bbdd1718.practica01.clases.Arbitro;
import bbdd1718.practica01.clases.Equipo;
import bbdd1718.practica01.clases.Jugador;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class ListarTodo extends javax.swing.JFrame {
    
    /**
     * Creates new form ListarTodo
     */
    public ListarTodo() {
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

        labelTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labelSubTitulo = new javax.swing.JLabel();
        jButtonJugadores = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        jButtonJugadoresDisponibles = new javax.swing.JButton();
        jButtonArbitros = new javax.swing.JButton();
        jButtonEquipos = new javax.swing.JButton();
        jButtonEstadios = new javax.swing.JButton();
        jButtonPartidos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListDatos = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelTitulo.setText("App Futbol Menu");

        labelSubTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelSubTitulo.setText("Mostrar Datos del Sistema");

        jButtonJugadores.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonJugadores.setText("Jugadores");
        jButtonJugadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonJugadoresMouseClicked(evt);
            }
        });

        buttonCancel.setText("Menu");
        buttonCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCancelMouseClicked(evt);
            }
        });

        jButtonJugadoresDisponibles.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonJugadoresDisponibles.setText("Jugadores Disponibles");
        jButtonJugadoresDisponibles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonJugadoresDisponiblesMouseClicked(evt);
            }
        });

        jButtonArbitros.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonArbitros.setText("Arbitros");
        jButtonArbitros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonArbitrosMouseClicked(evt);
            }
        });

        jButtonEquipos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonEquipos.setText("Equipos");
        jButtonEquipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEquiposMouseClicked(evt);
            }
        });

        jButtonEstadios.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonEstadios.setText("Estadios");

        jButtonPartidos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonPartidos.setText("Partidos");

        jListDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListDatos);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Datos en el sistema:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 105, Short.MAX_VALUE)
                        .addComponent(labelSubTitulo)
                        .addGap(105, 105, 105))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(16, 16, 16)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(109, 109, 109)
                                                .addComponent(labelTitulo))
                                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(buttonCancel)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButtonJugadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(206, 206, 206)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonJugadoresDisponibles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonArbitros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonEquipos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonEstadios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonPartidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSubTitulo)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonJugadores)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonJugadoresDisponibles)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonArbitros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEquipos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEstadios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonPartidos))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(buttonCancel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCancelMouseClicked
        // Bottón para volver al menú

        this.dispose(); //Cerramos la ventana acutal.
        AppFutbol.iu.setVisible(true); //Mostramos el menu.
    }//GEN-LAST:event_buttonCancelMouseClicked

    private void jButtonJugadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonJugadoresMouseClicked
        // Boton para mostrar a los jugadores
        if(!AppFutbol.lJugadores.isEmpty()){
            DefaultListModel modelo = new DefaultListModel(); //Contendor
            for(Jugador ar: AppFutbol.lJugadores.values()){
                modelo.addElement(ar.id+": "+ar.nombre); //modelo.addElement(ju.nombre);
            }
            this.jListDatos.setModel(modelo); //Lo añaddimos al jList
            this.jListDatos.setToolTipText("id: nombre");
            AppFutbol.datosSistema[0] = 0; //Indicamos que es la lista de jugadores
            
        }else{//No hay jugadores en el sistema.
            JOptionPane.showMessageDialog(null, "No hay jugadores en el sistema ",
                        "AppFutbol",JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_jButtonJugadoresMouseClicked

    private void jListDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListDatosMouseClicked
        // TODO add your handling code here:
        
        String [] seleccion = this.jListDatos.getSelectedValue().split(":");
        short key = Short.parseShort(seleccion[0]);
        
        switch(AppFutbol.datosSistema[0]){
            case 0:
                //Listamos el jugador seleccionado
                AppFutbol.datosSistema[1] = key; //Indicamos el jugador seleccionado
                new MostrarJugador();
                break;
            case 1:
                //Listamos el jugador seleccionado
                AppFutbol.datosSistema[1] = key; //Indicamos el jugador disponible seleccionado
                new MostrarJugador();
                break;
            case 2:
                //Listamos el arbitro seleccionado
                AppFutbol.datosSistema[1] = key; //Indicamos el arbitro seleccionado
                new MostrarArbitro();
                break;
            case 3:
                //Listamos el equipo seleccionado
                AppFutbol.datosSistema[1] = key; //Indicamos el arbitro seleccionado
                new MostrarEquipo();
                break;
        }
    }//GEN-LAST:event_jListDatosMouseClicked

    private void jButtonJugadoresDisponiblesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonJugadoresDisponiblesMouseClicked
        // Boton para mostrar los jugadores disponibles
        if(!AppFutbol.lJugadoresDisponibles.isEmpty()){
            DefaultListModel modelo = new DefaultListModel(); //Contendor
            for(Jugador ar: AppFutbol.lJugadoresDisponibles.values()){
                modelo.addElement(ar.id+": "+ar.nombre); //modelo.addElement(ju.nombre);
            }
            this.jListDatos.setModel(modelo); //Lo añaddimos al jList
            this.jListDatos.setToolTipText("id: nombre");
            AppFutbol.datosSistema[0] = 1; //Indicamos que es la lista de jugadores disponibles
            
        }else{//No hay jugadores en el sistema.
            JOptionPane.showMessageDialog(null, "No hay jugadores disponibles en el sistema ",
                        "AppFutbol",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonJugadoresDisponiblesMouseClicked

    private void jButtonArbitrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonArbitrosMouseClicked
        // Boton para mostrar los arbitros
        if(!AppFutbol.lArbitros.isEmpty()){
            DefaultListModel modelo = new DefaultListModel(); //Contendor
            for(Arbitro ar: AppFutbol.lArbitros.values()){
                modelo.addElement(ar.id+": "+ar.nombre); //modelo.addElement(ju.nombre);
            }
            this.jListDatos.setModel(modelo); //Lo añaddimos al jList
            this.jListDatos.setToolTipText("id: nombre");
            AppFutbol.datosSistema[0] = 2; //Indicamos que es la lista de arbitros disponibles
            
        }else{//No hay jugadores en el sistema.
            JOptionPane.showMessageDialog(null, "No hay arbitros en el sistema ",
                        "AppFutbol",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonArbitrosMouseClicked

    private void jButtonEquiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEquiposMouseClicked
        // Boton para mostrar los equipos
        if(!AppFutbol.lEquipos.isEmpty()){
            DefaultListModel modelo = new DefaultListModel(); //Contendor
            for(Equipo ar: AppFutbol.lEquipos.values()){
                modelo.addElement(ar.getIdEquipo()+": "+ar.getNameEquipo()); //modelo.addElement(ju.nombre);
            }
            this.jListDatos.setModel(modelo); //Lo añaddimos al jList
            this.jListDatos.setToolTipText("id: nombre");
            AppFutbol.datosSistema[0] = 3; //Indicamos que es la lista de arbitros disponibles
            
        }else{//No hay jugadores en el sistema.
            JOptionPane.showMessageDialog(null, "No hay arbitros en el sistema ",
                        "AppFutbol",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonEquiposMouseClicked

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
            java.util.logging.Logger.getLogger(ListarTodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarTodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarTodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarTodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarTodo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton jButtonArbitros;
    private javax.swing.JButton jButtonEquipos;
    private javax.swing.JButton jButtonEstadios;
    private javax.swing.JButton jButtonJugadores;
    private javax.swing.JButton jButtonJugadoresDisponibles;
    private javax.swing.JButton jButtonPartidos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jListDatos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelSubTitulo;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
