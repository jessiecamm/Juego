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

    public Heroes(int indice_bondad, int energia, String nombre, String pais_origen, String habilidad_ppal) {
        super(energia, nombre, pais_origen, habilidad_ppal);
        this.indice_bondad = indice_bondad;
    }

    public int getIndice_bondad() {
        return indice_bondad;
    }

    public void setIndice_bondad(int indice_bondad) {
        this.indice_bondad = indice_bondad;
    }
    
     
}
