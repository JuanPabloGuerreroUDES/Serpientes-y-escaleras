/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PAQUETE;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class InicioVista extends javax.swing.JFrame {
    

    /**
     * Creates new form GUI
     */
    public InicioVista() {
        initComponents();
        setLocationRelativeTo(null);
        this.cmbbxNumeroJugadoresActionPerformed(null);
        
        
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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNombreJ1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbbxFicha1 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        cmbbxNumeroJugadores = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtNombreJ2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbbxFicha2 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNombreJ3 = new javax.swing.JTextField();
        txtNombreJ4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cmbbxFicha4 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        cmbbxFicha3 = new javax.swing.JComboBox<>();
        cmbbxTipoJuego = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 48)); // NOI18N
        jLabel1.setText("SERPIENTES Y ESCALERAS");

        jButton1.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jButton1.setText("Iniciar Juego");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel2.setText("Jugador 1");

        jLabel4.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel4.setText("Nombre");

        jLabel6.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel6.setText("Ficha");

        cmbbxFicha1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "X", "O", "I", "H" }));
        cmbbxFicha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbxFicha1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel14.setText("Numero de jugadores");

        cmbbxNumeroJugadores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4" }));
        cmbbxNumeroJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbxNumeroJugadoresActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel3.setText("Jugador 2");

        jLabel5.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel5.setText("Nombre");

        jLabel7.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel7.setText("Ficha");

        cmbbxFicha2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "X", "O", "I", "H" }));
        cmbbxFicha2.setSelectedIndex(1);
        cmbbxFicha2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbxFicha2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel8.setText("Jugador 3");

        jLabel9.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel9.setText("Jugador 4");

        jLabel10.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel10.setText("Nombre");

        jLabel11.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel11.setText("Nombre");

        jLabel12.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel12.setText("Ficha");

        cmbbxFicha4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "X", "O", "I", "H" }));
        cmbbxFicha4.setSelectedIndex(3);
        cmbbxFicha4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbxFicha4ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel13.setText("Ficha");

        cmbbxFicha3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "X", "O", "I", "H" }));
        cmbbxFicha3.setSelectedIndex(2);
        cmbbxFicha3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbxFicha3ActionPerformed(evt);
            }
        });

        cmbbxTipoJuego.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10x10", "13x13", "15x15" }));
        cmbbxTipoJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbxTipoJuegoActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel15.setText("Tipo de Juego");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14)
                            .addComponent(cmbbxNumeroJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbbxTipoJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(100, 100, 100)
                                        .addComponent(jLabel2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel4)
                                            .addComponent(txtNombreJ1)
                                            .addComponent(jLabel6)
                                            .addComponent(cmbbxFicha1, 0, 130, Short.MAX_VALUE))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNombreJ2)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel7)
                                        .addComponent(cmbbxFicha2, 0, 130, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(jLabel3)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNombreJ3)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel13)
                                        .addComponent(cmbbxFicha3, 0, 130, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(jLabel8))))
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNombreJ4)
                                .addComponent(jLabel11)
                                .addComponent(jLabel12)
                                .addComponent(cmbbxFicha4, 0, 130, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel9)))))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(278, 278, 278))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbbxNumeroJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbbxTipoJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbbxFicha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreJ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbbxFicha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreJ3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbbxFicha3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreJ4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbbxFicha4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addComponent(jButton1)
                .addGap(25, 25, 25))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String numeroJugadores = (String) cmbbxNumeroJugadores.getSelectedItem();
        String tipoJuego = (String) cmbbxTipoJuego.getSelectedItem();

        Jugador jugador1 =new Jugador();
        Jugador jugador2 =new Jugador();
        Jugador jugador3 =new Jugador();
        Jugador jugador4 =new Jugador();
        String ficha1="0", ficha2="0", ficha3="0", ficha4="0";

        switch(numeroJugadores){
            case "2": 
                if(txtNombreJ1.getText().equals("")||txtNombreJ2.getText().equals("")){
                    JOptionPane.showMessageDialog(rootPane, "Debe asignar los nombres");
                }else if(txtNombreJ1.getText().equals(txtNombreJ2.getText())){
                    JOptionPane.showMessageDialog(rootPane, "Los nombres no pueden ser iguales");
                }else if(cmbbxFicha1.getSelectedItem().equals(cmbbxFicha2.getSelectedItem())){
                    JOptionPane.showMessageDialog(rootPane, "Las fichas no pueden ser iguales");
                }else{
                    jugador1.setNombre(txtNombreJ1.getText());
                    ficha1= (String) cmbbxFicha1.getSelectedItem();
                    jugador1.setFicha(ficha1);
                    
                    jugador2.setNombre(txtNombreJ2.getText());
                    ficha2= (String) cmbbxFicha2.getSelectedItem();
                    jugador2.setFicha(ficha2);
                    
                    switch(tipoJuego){
                        case "10x10":
                            Juego10X10 juego1 =new Juego10X10();
                            juego1.setJugadores2(jugador1, jugador2);
                            dispose();
                            juego1.setVisible(true);
                            break;
                        case "13x13":
                            Juego13x13 juego2 =new Juego13x13();
                            juego2.setJugadores2(jugador1, jugador2);
                            dispose();
                            juego2.setVisible(true);
                            break;
                        case "15x15":
                            Juego15x15 juego3 =new Juego15x15();
                            juego3.setJugadores2(jugador1, jugador2);
                            dispose();
                            juego3.setVisible(true);
                            break;
                    }
                    
                    
                }
                break;
            case "3":
                if(txtNombreJ1.getText().equals("")||txtNombreJ2.getText().equals("")||
                        txtNombreJ3.getText().equals("")){
                    JOptionPane.showMessageDialog(rootPane, "Debe asignar los nombres");
                }else if(txtNombreJ1.getText().equals(txtNombreJ2.getText())||
                        txtNombreJ1.getText().equals(txtNombreJ3.getText())||
                        txtNombreJ2.getText().equals(txtNombreJ3.getText())){
                    JOptionPane.showMessageDialog(rootPane, "Los nombres no pueden ser iguales");
                }else if(cmbbxFicha1.getSelectedItem().equals(cmbbxFicha2.getSelectedItem())||
                        cmbbxFicha1.getSelectedItem().equals(cmbbxFicha4.getSelectedItem())||
                        cmbbxFicha2.getSelectedItem().equals(cmbbxFicha4.getSelectedItem())){
                    JOptionPane.showMessageDialog(rootPane, "Las fichas no pueden ser iguales");
                }else{
                    jugador1.setNombre(txtNombreJ1.getText());
                    ficha1= (String) cmbbxFicha1.getSelectedItem();
                    jugador1.setFicha(ficha1);
                    
                    jugador2.setNombre(txtNombreJ2.getText()); 
                    ficha2= (String) cmbbxFicha2.getSelectedItem();
                    jugador2.setFicha(ficha2);
                    
                    jugador3.setNombre(txtNombreJ3.getText()); 
                    ficha3= (String) cmbbxFicha4.getSelectedItem();
                    jugador3.setFicha(ficha3);
                    
                    
                    
                    switch(tipoJuego){
                        case "10x10":
                            Juego10X10 juego1 =new Juego10X10();
                            juego1.setJugadores3(jugador1, jugador2, jugador3);
                            dispose();
                            juego1.setVisible(true);
                            break;
                        case "13x13":
                            Juego13x13 juego2 =new Juego13x13();
                            juego2.setJugadores3(jugador1, jugador2, jugador3);
                            dispose();
                            juego2.setVisible(true);
                            break;
                        case "15x15":
                            Juego15x15 juego3 =new Juego15x15();
                            juego3.setJugadores3(jugador1, jugador2, jugador3);
                            dispose();
                            juego3.setVisible(true);
                            break;
                    }
                
                }
                
                break;
            case "4":
                if(txtNombreJ1.getText().equals("")||txtNombreJ2.getText().equals("")||
                        txtNombreJ3.getText().equals("")||txtNombreJ4.getText().equals("")){
                    JOptionPane.showMessageDialog(rootPane, "Debe asignar los nombres");
                }else if(txtNombreJ1.getText().equals(txtNombreJ2.getText())||
                        txtNombreJ1.getText().equals(txtNombreJ3.getText())||
                        txtNombreJ2.getText().equals(txtNombreJ3.getText())||
                        txtNombreJ4.getText().equals(txtNombreJ1.getText())||
                        txtNombreJ4.getText().equals(txtNombreJ2.getText())||
                        txtNombreJ4.getText().equals(txtNombreJ3.getText())){
                    JOptionPane.showMessageDialog(rootPane, "Los nombres no pueden ser iguales");
                }else if(cmbbxFicha1.getSelectedItem()==(cmbbxFicha2.getSelectedItem())||
                        cmbbxFicha1.getSelectedItem()==(cmbbxFicha4.getSelectedItem())||
                        cmbbxFicha2.getSelectedItem()==(cmbbxFicha4.getSelectedItem())||
                        cmbbxFicha4.getSelectedItem()==(cmbbxFicha3.getSelectedItem())||
                        cmbbxFicha3.getSelectedItem()==(cmbbxFicha1.getSelectedItem())||
                        cmbbxFicha3.getSelectedItem()==(cmbbxFicha2.getSelectedItem())){
                    JOptionPane.showMessageDialog(rootPane, "Las fichas no pueden ser iguales");
                }else{
                    jugador1.setNombre(txtNombreJ1.getText()); 
                    ficha1= (String) cmbbxFicha1.getSelectedItem();
                    jugador1.setFicha(ficha1);

                    jugador2.setNombre(txtNombreJ2.getText()); 
                    ficha2= (String) cmbbxFicha2.getSelectedItem();
                    jugador2.setFicha(ficha2);

                    jugador3.setNombre(txtNombreJ3.getText()); 
                    ficha3= (String) cmbbxFicha3.getSelectedItem();
                    jugador3.setFicha(ficha3);

                    jugador4.setNombre(txtNombreJ4.getText()); 
                    ficha4= (String) cmbbxFicha4.getSelectedItem();
                    jugador4.setFicha(ficha4);
                    
                   
                }
                
                switch(tipoJuego){
                        case "10x10":
                            Juego10X10 juego1 =new Juego10X10();
                            juego1.setJugadores4(jugador1, jugador2, jugador3, jugador4);
                            dispose();
                            juego1.setVisible(true);
                            break;
                        case "13x13":
                            Juego13x13 juego2 =new Juego13x13();
                            juego2.setJugadores4(jugador1, jugador2, jugador3, jugador4);
                            dispose();
                            juego2.setVisible(true);
                            break;
                        case "15x15":
                            Juego15x15 juego3 =new Juego15x15();
                            juego3.setJugadores4(jugador1, jugador2, jugador3, jugador4);
                            dispose();
                            juego3.setVisible(true);
                            break;
                    }
                
                break;
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbbxFicha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbxFicha1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbbxFicha1ActionPerformed

    private void cmbbxFicha2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbxFicha2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbbxFicha2ActionPerformed

    private void cmbbxFicha4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbxFicha4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbbxFicha4ActionPerformed

    private void cmbbxFicha3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbxFicha3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbbxFicha3ActionPerformed

    private void cmbbxNumeroJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbxNumeroJugadoresActionPerformed

        // TODO add your handling code here:
        switch (this.cmbbxNumeroJugadores.getSelectedIndex()) {
            case 0:
                this.cambiarJ3(false);
                this.cambiarJ4(false);
                break;
            case 1:
                this.cambiarJ3(true);
                this.cambiarJ4(false);
                break;
            case 2:
                this.cambiarJ3(true);
                this.cambiarJ4(true);
                break;
            default:
                break;
        }
        
    }//GEN-LAST:event_cmbbxNumeroJugadoresActionPerformed

    private void cmbbxTipoJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbxTipoJuegoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbbxTipoJuegoActionPerformed

    private void cambiarJ3(boolean estado){
        this.jLabel8.setVisible(estado);
            this.jLabel10.setVisible(estado);
            this.txtNombreJ3.setVisible(estado);
            this.jLabel13.setVisible(estado);
            this.cmbbxFicha3.setVisible(estado);
    }
    private void cambiarJ4(boolean estado){
        this.jLabel9.setVisible(estado);
            this.jLabel11.setVisible(estado);
            this.txtNombreJ4.setVisible(estado);
            this.jLabel12.setVisible(estado);
            this.cmbbxFicha4.setVisible(estado);
    }
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
            java.util.logging.Logger.getLogger(InicioVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new InicioVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbbxFicha1;
    private javax.swing.JComboBox<String> cmbbxFicha2;
    private javax.swing.JComboBox<String> cmbbxFicha3;
    private javax.swing.JComboBox<String> cmbbxFicha4;
    private javax.swing.JComboBox<String> cmbbxNumeroJugadores;
    private javax.swing.JComboBox<String> cmbbxTipoJuego;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNombreJ1;
    private javax.swing.JTextField txtNombreJ2;
    private javax.swing.JTextField txtNombreJ3;
    private javax.swing.JTextField txtNombreJ4;
    // End of variables declaration//GEN-END:variables
}
