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

    Heroes(int i, String puño_de_Hierro, String australia, String super_Puñetazo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIndice_bondad() {
        return indice_bondad;
    }

    public void setIndice_bondad(int indice_bondad) {
        this.indice_bondad = indice_bondad;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Heroes{" + "indice_bondad=" + indice_bondad + '}';
    }

    void getPais_origen(String australia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
    
    
}
