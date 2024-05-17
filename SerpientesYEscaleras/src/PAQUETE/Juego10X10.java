/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PAQUETE;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author juang
 */
public class Juego10X10 extends javax.swing.JFrame {
   
    Juego juego=new Juego();
    
    Jugador[] jugadores;
    
    private Serpientes[] serpientes =new Serpientes[4];
    Serpientes serpiente1 =new Serpientes(30, 8);
    Serpientes serpiente2 =new Serpientes(54, 36);
    Serpientes serpiente3 =new Serpientes(90, 68);
    Serpientes serpiente4 =new Serpientes(97, 61);
    
    private Escaleras[] escaleras =new Escaleras[4];
    Escaleras escalera1 =new Escaleras(5, 26);
    Escaleras escalera2 =new Escaleras(40, 59);
    Escaleras escalera3 =new Escaleras(33, 69);
    Escaleras escalera4 =new Escaleras(76, 95);
    
    JLabel lbs[]=new JLabel[100];
    private int turno=0;
    private String valorDado;
    
    public Juego10X10() {
        initComponents();
        setLocationRelativeTo(null);
        
        juego.setEnJuego(true);
        
        //mostrar serpientes
        Icon mIcono = new ImageIcon(new ImageIcon(getClass().getResource("/icons/serpiente.png")).getImage()
                .getScaledInstance(lblSerpiente1.getWidth(), lblSerpiente1.getHeight(), 0));
        lblSerpiente1.setIcon(mIcono);
        
        Icon mIcono2 = new ImageIcon(new ImageIcon(getClass().getResource("/icons/serpiente.png")).getImage()
                .getScaledInstance(lblSerpiente2.getWidth(), lblSerpiente2.getHeight(), 0));
        lblSerpiente2.setIcon(mIcono2);
        
        Icon mIcono3 = new ImageIcon(new ImageIcon(getClass().getResource("/icons/serpiente.png")).getImage()
                .getScaledInstance(lblSerpiente3.getWidth(), lblSerpiente3.getHeight(), 0));
        lblSerpiente3.setIcon(mIcono3);
        
        Icon mIcono4 = new ImageIcon(new ImageIcon(getClass().getResource("/icons/serpiente.png")).getImage()
                .getScaledInstance(lblSerpiente4.getWidth(), lblSerpiente4.getHeight(), 0));
        lblSerpiente4.setIcon(mIcono4);
        
        
        
        //mostrar escaleras
        Icon mIcon5 = new ImageIcon(new ImageIcon(getClass().getResource("/icons/escalera.png")).getImage()
                .getScaledInstance(lblEscalera1.getWidth(), lblEscalera1.getHeight(), 0));
        lblEscalera1.setIcon(mIcon5);
        
        Icon mIcon6 = new ImageIcon(new ImageIcon(getClass().getResource("/icons/escalera.png")).getImage()
                .getScaledInstance(lblEscalera2.getWidth(), lblEscalera2.getHeight(), 0));
        lblEscalera2.setIcon(mIcon6);
        
        Icon mIcon7 = new ImageIcon(new ImageIcon(getClass().getResource("/icons/escalera.png")).getImage()
                .getScaledInstance(lblEscalera3.getWidth(), lblEscalera3.getHeight(), 0));
        lblEscalera3.setIcon(mIcon7);
        
        Icon mIcon8 = new ImageIcon(new ImageIcon(getClass().getResource("/icons/escalera.png")).getImage()
                .getScaledInstance(lblEscalera4.getWidth(), lblEscalera4.getHeight(), 0));
        lblEscalera4.setIcon(mIcon8);
        
        serpientes[0]=serpiente1;
        serpientes[1]=serpiente2;
        serpientes[2]=serpiente3;
        serpientes[3]=serpiente4;
        
        escaleras[0]=escalera1;
        escaleras[1]=escalera2;
        escaleras[2]=escalera3;
        escaleras[3]=escalera4;
        
        lbs[0]=jLabel1;
        lbs[1]=jLabel2;
        lbs[2]=jLabel3;
        lbs[3]=jLabel4;
        lbs[4]=jLabel5;
        lbs[5]=jLabel6;
        lbs[6]=jLabel7;
        lbs[7]=jLabel8;
        lbs[8]=jLabel9;
        lbs[9]=jLabel10;
        lbs[10]=jLabel11;
        lbs[11]=jLabel12;
        lbs[12]=jLabel13;
        lbs[13]=jLabel14;
        lbs[14]=jLabel15;
        lbs[15]=jLabel16;
        lbs[16]=jLabel17;
        lbs[17]=jLabel18;
        lbs[18]=jLabel19;
        lbs[19]=jLabel20;
        lbs[20]=jLabel21;
        lbs[21]=jLabel22;
        lbs[22]=jLabel23;
        lbs[23]=jLabel24;
        lbs[24]=jLabel25;
        lbs[25]=jLabel26;
        lbs[26]=jLabel27;
        lbs[27]=jLabel28;
        lbs[28]=jLabel29;
        lbs[29]=jLabel30;
        lbs[30]=jLabel31;
        lbs[31]=jLabel32;
        lbs[32]=jLabel33;
        lbs[33]=jLabel34;
        lbs[34]=jLabel35;
        lbs[35]=jLabel36;
        lbs[36]=jLabel37;
        lbs[37]=jLabel38;
        lbs[38]=jLabel39;
        lbs[39]=jLabel40;
        lbs[40]=jLabel41;
        lbs[41]=jLabel42;
        lbs[42]=jLabel43;
        lbs[43]=jLabel44;
        lbs[44]=jLabel45;
        lbs[45]=jLabel46;
        lbs[46]=jLabel47;
        lbs[47]=jLabel48;
        lbs[48]=jLabel49;
        lbs[49]=jLabel50;
        lbs[50]=jLabel51;
        lbs[51]=jLabel52;
        lbs[52]=jLabel53;
        lbs[53]=jLabel54;
        lbs[54]=jLabel55;
        lbs[55]=jLabel56;
        lbs[56]=jLabel57;
        lbs[57]=jLabel58;
        lbs[58]=jLabel59;
        lbs[59]=jLabel60;
        lbs[60]=jLabel61;
        lbs[61]=jLabel62;
        lbs[62]=jLabel63;
        lbs[63]=jLabel64;
        lbs[64]=jLabel65;
        lbs[65]=jLabel66;
        lbs[66]=jLabel67;
        lbs[67]=jLabel68;
        lbs[68]=jLabel69;
        lbs[69]=jLabel70;
        lbs[70]=jLabel71;
        lbs[71]=jLabel72;
        lbs[72]=jLabel73;
        lbs[73]=jLabel74;
        lbs[74]=jLabel75;
        lbs[75]=jLabel76;
        lbs[76]=jLabel77;
        lbs[77]=jLabel78;
        lbs[78]=jLabel79;
        lbs[79]=jLabel80;
        lbs[80]=jLabel81;
        lbs[81]=jLabel82;
        lbs[82]=jLabel83;
        lbs[83]=jLabel84;
        lbs[84]=jLabel85;
        lbs[85]=jLabel86;
        lbs[86]=jLabel87;
        lbs[87]=jLabel88;
        lbs[88]=jLabel89;
        lbs[89]=jLabel90;
        lbs[90]=jLabel91;
        lbs[91]=jLabel92;
        lbs[92]=jLabel93;
        lbs[93]=jLabel94;
        lbs[94]=jLabel95;
        lbs[95]=jLabel96;
        lbs[96]=jLabel97;
        lbs[97]=jLabel98;
        lbs[98]=jLabel99;
        lbs[99]=jLabel100;
    }
    
    public void setJugadores2(Jugador jugador1, Jugador jugador2){
        this.jugadores=new Jugador[2];
        this.jugadores[0]=jugador1;
        this.jugadores[1]=jugador2;
        
        
        lblJugador1.setText(this.jugadores[0].getNombre()+": "+this.jugadores[0].getFicha());
        lblJugador2.setText(this.jugadores[1].getNombre()+": "+this.jugadores[1].getFicha());
        lblJugador3.setVisible(false);
        lblJugador4.setVisible(false);
    }
    
    public void setJugadores3(Jugador jugador1, Jugador jugador2, Jugador jugador3){
        this.jugadores=new Jugador[3];
        this.jugadores[0]=jugador1;
        this.jugadores[1]=jugador2;
        this.jugadores[2]=jugador3;
        
        lblJugador1.setText(this.jugadores[0].getNombre()+": "+this.jugadores[0].getFicha());
        lblJugador2.setText(this.jugadores[1].getNombre()+": "+this.jugadores[1].getFicha());
        lblJugador3.setText(this.jugadores[2].getNombre()+": "+this.jugadores[2].getFicha());
        lblJugador4.setVisible(false);
    }
    
    public void setJugadores4(Jugador jugador1, Jugador jugador2, Jugador jugador3, Jugador jugador4){
        this.jugadores=new Jugador[4];
        this.jugadores[0]=jugador1;
        this.jugadores[1]=jugador2;
        this.jugadores[2]=jugador3;
        this.jugadores[3]=jugador4;
        
        lblJugador1.setText(this.jugadores[0].getNombre()+": "+this.jugadores[0].getFicha());
        lblJugador2.setText(this.jugadores[1].getNombre()+": "+this.jugadores[1].getFicha());
        lblJugador3.setText(this.jugadores[2].getNombre()+": "+this.jugadores[2].getFicha());
        lblJugador4.setText(this.jugadores[3].getNombre()+": "+this.jugadores[3].getFicha());
    }
    
    private void comprobarSerpientes(Jugador jugadores){
        for(int i=0; i<serpientes.length; i++){
            if(jugadores.getPosicion()==serpientes[i].getInicio()){
                jugadores.setPosicion(serpientes[i].getFin());
                JOptionPane.showMessageDialog(rootPane, jugadores.getNombre()+" ha caido en una serpiente, su ficha se movera a la posicion: "+jugadores.getPosicion());
            }
        }
    }
    
    private void comprobarEscaleras(Jugador jugadores){
         for(int i=0; i<escaleras.length; i++){
            if(jugadores.getPosicion()==escaleras[i].getInicio()){
                jugadores.setPosicion(escaleras[i].getFin());
                JOptionPane.showMessageDialog(rootPane, jugadores.getNombre()+" ha caido en una escalera, su ficha se movera a la posicion: "+jugadores.getPosicion());
            }
        }
    }
    
    private void comprobarGanador(){
        if(jugadores[turno].getPosicion()==100){
            JOptionPane.showMessageDialog(rootPane, "Felicidades "+jugadores[turno].getNombre()+", has ganado!");
            juego.setEnJuego(false);
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

        JLabelTurnoDado3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblDado = new javax.swing.JLabel();
        JLabelTurnoDado2 = new javax.swing.JLabel();
        btnLanzarDado = new javax.swing.JButton();
        lblJugador1 = new javax.swing.JLabel();
        lblJugador4 = new javax.swing.JLabel();
        lblJugador3 = new javax.swing.JLabel();
        lblJugador2 = new javax.swing.JLabel();
        btnReiniciar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        lblSerpiente1 = new javax.swing.JLabel();
        lblSerpiente2 = new javax.swing.JLabel();
        lblSerpiente3 = new javax.swing.JLabel();
        lblSerpiente4 = new javax.swing.JLabel();
        lblEscalera1 = new javax.swing.JLabel();
        lblEscalera2 = new javax.swing.JLabel();
        lblEscalera3 = new javax.swing.JLabel();
        lblEscalera4 = new javax.swing.JLabel();

        JLabelTurnoDado3.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        JLabelTurnoDado3.setText("Dado:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Serpientes y escaleras");
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(0, 104, 108));

        lblDado.setFont(new java.awt.Font("Eras Demi ITC", 0, 36)); // NOI18N
        lblDado.setText("6");

        JLabelTurnoDado2.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        JLabelTurnoDado2.setText("Dado:");

        btnLanzarDado.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        btnLanzarDado.setText("Lanzar dado");
        btnLanzarDado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanzarDadoActionPerformed(evt);
            }
        });

        lblJugador1.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        lblJugador1.setText("Jugador1:");

        lblJugador4.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        lblJugador4.setText("Jugador4:");

        lblJugador3.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        lblJugador3.setText("Jugador3:");

        lblJugador2.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        lblJugador2.setText("Jugador2:");

        btnReiniciar.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(lblDado)
                            .addGap(108, 108, 108))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(JLabelTurnoDado2)
                            .addGap(87, 87, 87)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLanzarDado)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(btnReiniciar)))
                        .addGap(50, 50, 50))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblJugador4)
                    .addComponent(lblJugador2)
                    .addComponent(lblJugador3)
                    .addComponent(lblJugador1))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblJugador1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblJugador2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblJugador3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblJugador4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLabelTurnoDado2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLanzarDado)
                .addGap(37, 37, 37)
                .addComponent(btnReiniciar)
                .addGap(25, 25, 25))
        );

        jPanel3.setBackground(new java.awt.Color(0, 104, 108));

        jLabel51.setBackground(new java.awt.Color(250, 217, 40));
        jLabel51.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel51.setOpaque(true);

        jLabel52.setBackground(new java.awt.Color(255, 153, 21));
        jLabel52.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel52.setOpaque(true);

        jLabel73.setBackground(new java.awt.Color(250, 217, 40));
        jLabel73.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel73.setOpaque(true);

        jLabel74.setBackground(new java.awt.Color(255, 153, 21));
        jLabel74.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel74.setOpaque(true);

        jLabel75.setBackground(new java.awt.Color(250, 217, 40));
        jLabel75.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel75.setOpaque(true);

        jLabel76.setBackground(new java.awt.Color(255, 153, 21));
        jLabel76.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel76.setOpaque(true);

        jLabel77.setBackground(new java.awt.Color(250, 217, 40));
        jLabel77.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel77.setOpaque(true);

        jLabel78.setBackground(new java.awt.Color(255, 153, 21));
        jLabel78.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel78.setOpaque(true);

        jLabel79.setBackground(new java.awt.Color(250, 217, 40));
        jLabel79.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel79.setOpaque(true);

        jLabel53.setBackground(new java.awt.Color(250, 217, 40));
        jLabel53.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel53.setOpaque(true);

        jLabel80.setBackground(new java.awt.Color(255, 153, 21));
        jLabel80.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel80.setOpaque(true);

        jLabel54.setBackground(new java.awt.Color(255, 153, 21));
        jLabel54.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel54.setOpaque(true);

        jLabel81.setBackground(new java.awt.Color(250, 217, 40));
        jLabel81.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel81.setOpaque(true);

        jLabel55.setBackground(new java.awt.Color(250, 217, 40));
        jLabel55.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel55.setOpaque(true);

        jLabel82.setBackground(new java.awt.Color(255, 153, 21));
        jLabel82.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel82.setOpaque(true);

        jLabel56.setBackground(new java.awt.Color(255, 153, 21));
        jLabel56.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel56.setOpaque(true);

        jLabel57.setBackground(new java.awt.Color(250, 217, 40));
        jLabel57.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel57.setOpaque(true);

        jLabel58.setBackground(new java.awt.Color(255, 153, 21));
        jLabel58.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel58.setOpaque(true);

        jLabel59.setBackground(new java.awt.Color(250, 217, 40));
        jLabel59.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel59.setOpaque(true);

        jLabel60.setBackground(new java.awt.Color(255, 153, 21));
        jLabel60.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel60.setOpaque(true);

        jLabel61.setBackground(new java.awt.Color(250, 217, 40));
        jLabel61.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel61.setOpaque(true);

        jLabel62.setBackground(new java.awt.Color(255, 153, 21));
        jLabel62.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel62.setOpaque(true);

        jLabel83.setBackground(new java.awt.Color(250, 217, 40));
        jLabel83.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel83.setOpaque(true);

        jLabel84.setBackground(new java.awt.Color(255, 153, 21));
        jLabel84.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel84.setOpaque(true);

        jLabel85.setBackground(new java.awt.Color(250, 217, 40));
        jLabel85.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel85.setOpaque(true);

        jLabel86.setBackground(new java.awt.Color(255, 153, 21));
        jLabel86.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel86.setOpaque(true);

        jLabel87.setBackground(new java.awt.Color(250, 217, 40));
        jLabel87.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel87.setOpaque(true);

        jLabel88.setBackground(new java.awt.Color(255, 153, 21));
        jLabel88.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel88.setOpaque(true);

        jLabel89.setBackground(new java.awt.Color(250, 217, 40));
        jLabel89.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel89.setOpaque(true);

        jLabel90.setBackground(new java.awt.Color(255, 153, 21));
        jLabel90.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel90.setOpaque(true);

        jLabel91.setBackground(new java.awt.Color(250, 217, 40));
        jLabel91.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel91.setOpaque(true);

        jLabel92.setBackground(new java.awt.Color(255, 153, 21));
        jLabel92.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel92.setOpaque(true);

        jLabel93.setBackground(new java.awt.Color(250, 217, 40));
        jLabel93.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel93.setOpaque(true);

        jLabel94.setBackground(new java.awt.Color(255, 153, 21));
        jLabel94.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel94.setOpaque(true);

        jLabel95.setBackground(new java.awt.Color(250, 217, 40));
        jLabel95.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel95.setOpaque(true);

        jLabel96.setBackground(new java.awt.Color(255, 153, 21));
        jLabel96.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel96.setOpaque(true);

        jLabel97.setBackground(new java.awt.Color(250, 217, 40));
        jLabel97.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel97.setOpaque(true);

        jLabel98.setBackground(new java.awt.Color(255, 153, 21));
        jLabel98.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel98.setOpaque(true);

        jLabel99.setBackground(new java.awt.Color(250, 217, 40));
        jLabel99.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel99.setOpaque(true);

        jLabel100.setBackground(new java.awt.Color(255, 153, 21));
        jLabel100.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel100.setToolTipText("1");
        jLabel100.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel100.setOpaque(true);

        jLabel1.setBackground(new java.awt.Color(250, 217, 40));
        jLabel1.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(255, 153, 21));
        jLabel2.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(250, 217, 40));
        jLabel3.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel3.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(255, 153, 21));
        jLabel4.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel4.setOpaque(true);

        jLabel5.setBackground(new java.awt.Color(250, 217, 40));
        jLabel5.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel5.setOpaque(true);

        jLabel6.setBackground(new java.awt.Color(255, 153, 21));
        jLabel6.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel6.setOpaque(true);

        jLabel7.setBackground(new java.awt.Color(250, 217, 40));
        jLabel7.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel7.setOpaque(true);

        jLabel8.setBackground(new java.awt.Color(255, 153, 21));
        jLabel8.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel8.setOpaque(true);

        jLabel9.setBackground(new java.awt.Color(250, 217, 40));
        jLabel9.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel9.setOpaque(true);

        jLabel10.setBackground(new java.awt.Color(255, 153, 21));
        jLabel10.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel10.setOpaque(true);

        jLabel11.setBackground(new java.awt.Color(250, 217, 40));
        jLabel11.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel11.setOpaque(true);

        jLabel12.setBackground(new java.awt.Color(255, 153, 21));
        jLabel12.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel12.setOpaque(true);

        jLabel13.setBackground(new java.awt.Color(250, 217, 40));
        jLabel13.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel13.setOpaque(true);

        jLabel14.setBackground(new java.awt.Color(255, 153, 21));
        jLabel14.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel14.setOpaque(true);

        jLabel15.setBackground(new java.awt.Color(250, 217, 40));
        jLabel15.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel15.setOpaque(true);

        jLabel16.setBackground(new java.awt.Color(255, 153, 21));
        jLabel16.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel16.setOpaque(true);

        jLabel17.setBackground(new java.awt.Color(250, 217, 40));
        jLabel17.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel17.setOpaque(true);

        jLabel18.setBackground(new java.awt.Color(255, 153, 21));
        jLabel18.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel18.setOpaque(true);

        jLabel19.setBackground(new java.awt.Color(250, 217, 40));
        jLabel19.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel19.setOpaque(true);

        jLabel20.setBackground(new java.awt.Color(255, 153, 21));
        jLabel20.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel20.setOpaque(true);

        jLabel21.setBackground(new java.awt.Color(250, 217, 40));
        jLabel21.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel21.setOpaque(true);

        jLabel22.setBackground(new java.awt.Color(255, 153, 21));
        jLabel22.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel22.setOpaque(true);

        jLabel23.setBackground(new java.awt.Color(250, 217, 40));
        jLabel23.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel23.setOpaque(true);

        jLabel24.setBackground(new java.awt.Color(255, 153, 21));
        jLabel24.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel24.setOpaque(true);

        jLabel25.setBackground(new java.awt.Color(250, 217, 40));
        jLabel25.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel25.setOpaque(true);

        jLabel26.setBackground(new java.awt.Color(255, 153, 21));
        jLabel26.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel26.setOpaque(true);

        jLabel27.setBackground(new java.awt.Color(250, 217, 40));
        jLabel27.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel27.setOpaque(true);

        jLabel28.setBackground(new java.awt.Color(255, 153, 21));
        jLabel28.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel28.setOpaque(true);

        jLabel29.setBackground(new java.awt.Color(250, 217, 40));
        jLabel29.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel29.setOpaque(true);

        jLabel30.setBackground(new java.awt.Color(255, 153, 21));
        jLabel30.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel30.setOpaque(true);

        jLabel31.setBackground(new java.awt.Color(250, 217, 40));
        jLabel31.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel31.setOpaque(true);

        jLabel32.setBackground(new java.awt.Color(255, 153, 21));
        jLabel32.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel32.setOpaque(true);

        jLabel33.setBackground(new java.awt.Color(250, 217, 40));
        jLabel33.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel33.setOpaque(true);

        jLabel34.setBackground(new java.awt.Color(255, 153, 21));
        jLabel34.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel34.setOpaque(true);

        jLabel35.setBackground(new java.awt.Color(250, 217, 40));
        jLabel35.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel35.setOpaque(true);

        jLabel36.setBackground(new java.awt.Color(255, 153, 21));
        jLabel36.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel36.setOpaque(true);

        jLabel37.setBackground(new java.awt.Color(250, 217, 40));
        jLabel37.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel37.setOpaque(true);

        jLabel38.setBackground(new java.awt.Color(255, 153, 21));
        jLabel38.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel38.setOpaque(true);

        jLabel39.setBackground(new java.awt.Color(250, 217, 40));
        jLabel39.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel39.setOpaque(true);

        jLabel40.setBackground(new java.awt.Color(255, 153, 21));
        jLabel40.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel40.setOpaque(true);

        jLabel41.setBackground(new java.awt.Color(250, 217, 40));
        jLabel41.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel41.setOpaque(true);

        jLabel42.setBackground(new java.awt.Color(255, 153, 21));
        jLabel42.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel42.setOpaque(true);

        jLabel63.setBackground(new java.awt.Color(250, 217, 40));
        jLabel63.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel63.setOpaque(true);

        jLabel64.setBackground(new java.awt.Color(255, 153, 21));
        jLabel64.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel64.setOpaque(true);

        jLabel65.setBackground(new java.awt.Color(250, 217, 40));
        jLabel65.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel65.setOpaque(true);

        jLabel66.setBackground(new java.awt.Color(255, 153, 21));
        jLabel66.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel66.setOpaque(true);

        jLabel67.setBackground(new java.awt.Color(250, 217, 40));
        jLabel67.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel67.setOpaque(true);

        jLabel68.setBackground(new java.awt.Color(255, 153, 21));
        jLabel68.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel68.setOpaque(true);

        jLabel69.setBackground(new java.awt.Color(250, 217, 40));
        jLabel69.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel69.setOpaque(true);

        jLabel43.setBackground(new java.awt.Color(250, 217, 40));
        jLabel43.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel43.setOpaque(true);

        jLabel70.setBackground(new java.awt.Color(255, 153, 21));
        jLabel70.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel70.setOpaque(true);

        jLabel44.setBackground(new java.awt.Color(255, 153, 21));
        jLabel44.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel44.setOpaque(true);

        jLabel71.setBackground(new java.awt.Color(250, 217, 40));
        jLabel71.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel71.setOpaque(true);

        jLabel45.setBackground(new java.awt.Color(250, 217, 40));
        jLabel45.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel45.setOpaque(true);

        jLabel72.setBackground(new java.awt.Color(255, 153, 21));
        jLabel72.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel72.setOpaque(true);

        jLabel46.setBackground(new java.awt.Color(255, 153, 21));
        jLabel46.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel46.setOpaque(true);

        jLabel47.setBackground(new java.awt.Color(250, 217, 40));
        jLabel47.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel47.setOpaque(true);

        jLabel48.setBackground(new java.awt.Color(255, 153, 21));
        jLabel48.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel48.setOpaque(true);

        jLabel49.setBackground(new java.awt.Color(250, 217, 40));
        jLabel49.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel49.setOpaque(true);

        jLabel50.setBackground(new java.awt.Color(255, 153, 21));
        jLabel50.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel50.setOpaque(true);

        lblSerpiente1.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N

        lblSerpiente2.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N

        lblSerpiente3.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N

        lblSerpiente4.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N

        lblEscalera1.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N

        lblEscalera2.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N

        lblEscalera3.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N

        lblEscalera4.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N

        jLayeredPane1.setLayer(jLabel51, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel52, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel73, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel74, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel75, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel76, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel77, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel78, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel79, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel53, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel80, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel54, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel81, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel55, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel82, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel56, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel57, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel58, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel59, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel60, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel61, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel62, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel83, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel84, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel85, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel86, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel87, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel88, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel89, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel90, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel91, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel92, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel93, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel94, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel95, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel96, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel97, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel98, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel99, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel100, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel23, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel24, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel25, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel26, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel27, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel28, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel29, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel30, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel31, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel32, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel33, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel34, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel35, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel36, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel37, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel38, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel39, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel40, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel41, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel42, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel63, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel64, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel65, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel66, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel67, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel68, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel69, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel43, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel70, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel44, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel71, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel45, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel72, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel46, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel47, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel48, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel49, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel50, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblSerpiente1, javax.swing.JLayeredPane.POPUP_LAYER);
        jLayeredPane1.setLayer(lblSerpiente2, javax.swing.JLayeredPane.POPUP_LAYER);
        jLayeredPane1.setLayer(lblSerpiente3, javax.swing.JLayeredPane.POPUP_LAYER);
        jLayeredPane1.setLayer(lblSerpiente4, javax.swing.JLayeredPane.POPUP_LAYER);
        jLayeredPane1.setLayer(lblEscalera1, javax.swing.JLayeredPane.POPUP_LAYER);
        jLayeredPane1.setLayer(lblEscalera2, javax.swing.JLayeredPane.POPUP_LAYER);
        jLayeredPane1.setLayer(lblEscalera3, javax.swing.JLayeredPane.POPUP_LAYER);
        jLayeredPane1.setLayer(lblEscalera4, javax.swing.JLayeredPane.POPUP_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                                .addComponent(lblEscalera4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(lblEscalera3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSerpiente3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSerpiente4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(lblEscalera2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(lblSerpiente1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(lblEscalera1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addComponent(lblSerpiente2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                            .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                            .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                            .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                            .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(12, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(lblSerpiente1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblEscalera1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblEscalera4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(0, 51, Short.MAX_VALUE)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblSerpiente3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addComponent(lblSerpiente2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblEscalera2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(33, 33, 33)
                                .addComponent(lblSerpiente4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(lblEscalera3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLanzarDadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanzarDadoActionPerformed
        
        if (jugadores[turno].getPosicion() > 0) {
            lbs[jugadores[turno].getPosicion() - 1].setText("");
        }
        
        //dado
        juego.lanzarDado();
        int valorDado = juego.getDado();
        lblDado.setText(String.valueOf(valorDado));
        
        //Movimiento del jugador
        for (int i = 0; i < valorDado; i++) {
            if(juego.isEnJuego()==true){
                jugadores[turno].AumentarPosicion();
                comprobarGanador();
            }
        }
        //comprobar si ha caido en serpientes o escaleras
        comprobarSerpientes(jugadores[turno]);
        comprobarEscaleras(jugadores[turno]);
        

        // Cambiar posicion
        lbs[jugadores[turno].getPosicion() - 1].setText(" "+jugadores[turno].getFicha());

        // Cambia el turno al siguiente jugador
        turno = turno + 1;
        if (turno >= jugadores.length) {
            turno = 0;
        }
    }//GEN-LAST:event_btnLanzarDadoActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas reiniciar? se perderá el progreso actual", "Reiniciar", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            for(int i =0; i<lbs.length;i++){
                lbs[i].setText("");
            }
            
            juego.setEnJuego(true);
            juego.setTurno(0);
            for(int i=0;i<jugadores.length;i++){
                jugadores[i].setPosicion(0);
            }
        }
    }//GEN-LAST:event_btnReiniciarActionPerformed

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
            java.util.logging.Logger.getLogger(Juego10X10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego10X10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego10X10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego10X10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego10X10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelTurnoDado2;
    private javax.swing.JLabel JLabelTurnoDado3;
    private javax.swing.JButton btnLanzarDado;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblDado;
    private javax.swing.JLabel lblEscalera1;
    private javax.swing.JLabel lblEscalera2;
    private javax.swing.JLabel lblEscalera3;
    private javax.swing.JLabel lblEscalera4;
    private javax.swing.JLabel lblJugador1;
    private javax.swing.JLabel lblJugador2;
    private javax.swing.JLabel lblJugador3;
    private javax.swing.JLabel lblJugador4;
    private javax.swing.JLabel lblSerpiente1;
    private javax.swing.JLabel lblSerpiente2;
    private javax.swing.JLabel lblSerpiente3;
    private javax.swing.JLabel lblSerpiente4;
    // End of variables declaration//GEN-END:variables
}
