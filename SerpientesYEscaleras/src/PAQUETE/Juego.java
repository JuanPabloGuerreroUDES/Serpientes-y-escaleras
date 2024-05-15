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

    
    public Juego() {
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }
    
    public void lanzarDado(){
        Random random =new Random();
        this.dado=random.nextInt(6)+1;
    }
    
}
