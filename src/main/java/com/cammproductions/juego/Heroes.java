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
public class Heroes extends Super_X {
    
    private int indice_bondad;
    
    public Heroes() {
    }

    public Heroes(String nombre, String pais_origen, String habilidad_ppal, int energia, int indice_bondad) {
        super(nombre, pais_origen, habilidad_ppal, energia);
        this.indice_bondad = indice_bondad;
    }

    public int getIndice_bondad() {
        return indice_bondad;
    }

    public void setIndice_bondad(int indice_bondad) {
        this.indice_bondad = indice_bondad;
    }
    
    //Métodos de ataque de Heroes    
    public int atacarHeroe_1() {        
        int golpe1;
        golpe1 = this.energia - 30;
        return golpe1;
    }
    
    public int atacarHeroe_2() {        
        int golpe2;
        golpe2 = this.energia - 10;
        return golpe2;
    }
    
    public int atacarHeroe_3() {        
        int golpe3;
        golpe3 = this.energia - 15;
        return golpe3;
    }
    
    public int atacarHeroe_4() {        
        int golpe4;
        golpe4 = this.energia - 5;
        return golpe4;
    }
     
}