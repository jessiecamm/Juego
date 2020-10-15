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

    public Villanos(int indice_maldad, int energia, String nombre, String pais_origen, String habilidad_ppal) {
        super(energia, nombre, pais_origen, habilidad_ppal);
        this.indice_maldad = indice_maldad;
    }

    public int getIndice_maldad() {
        return indice_maldad;
    }

    public void setIndice_maldad(int indice_maldad) {
        this.indice_maldad = indice_maldad;
    }
    
    @Override
    public String toString() {
        return "Villanos{" + "indice_maldad=" + indice_maldad + '}';
    }
    
}
