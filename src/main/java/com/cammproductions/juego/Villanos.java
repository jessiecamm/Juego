/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cammproductions.juego;

/**
 *
 * @author Jessie
 */
public class Villanos extends Super_X {
    
    private int indice_maldad;

    public Villanos() {
    }

    public Villanos(String nombre, String pais_origen, String habilidad_ppal, int energia, int indice_maldad) {
        super(nombre, pais_origen, habilidad_ppal, energia);
        this.indice_maldad = indice_maldad;
    }

    public int getIndice_maldad() {
        return indice_maldad;
    }

    public void setIndice_maldad(int indice_maldad) {
        this.indice_maldad = indice_maldad;
    }
    
    //Métodos de ataque de Villanos
    
    public int atacarVillano_1() {        
        int golpe1;
        golpe1 = this.energia -28;
        return golpe1;
    }
    
    public int atacarVillano_2() {        
        int golpe2;
        golpe2 = this.energia -12;
        return golpe2;
    }
    
    public int atacarVillano_3() {        
        int golpe3;
        golpe3 = this.energia -11;
        return golpe3;
    }
    
    public int atacarVillano_4() {        
        int golpe4;
        golpe4 = this.energia -35;
        return golpe4;
    }   
    
}
