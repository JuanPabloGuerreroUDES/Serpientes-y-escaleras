/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PAQUETE;

import java.util.Random;

/**
 *
 * @author USER
 */
public class Juego {
    private int dado;
    private int turno=0;

    
    public Juego() {
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }
    
    public void lanzarDado(){
        Random random =new Random();
        this.dado=random.nextInt(6)+1;
    }
    
    
    
}
