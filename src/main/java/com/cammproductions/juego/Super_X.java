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
public class Super_X {
    
    private int energia;
    private String nombre;
    private String pais_origen;
    private String habilidad_ppal;

    public Super_X() {
    }

    public Super_X(String nombre, String pais_origen, String habilidad_ppal) {
        this.energia = 100;
        this.nombre = nombre;
        this.pais_origen = pais_origen;
        this.habilidad_ppal = habilidad_ppal;
    }

      public int getEnergia() {
        return energia=100;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais_origen() {
        return pais_origen;
    }

    public void setPais_origen(String pais_origen) {
        this.pais_origen = pais_origen;
    }

    public String getHabilidad_ppal() {
        return habilidad_ppal;
    }

    public void setHabilidad_ppal(String habilidad_ppal) {
        this.habilidad_ppal = habilidad_ppal;
    }

    @Override
    public String toString() {
        return "Super X >>> " + nombre + " - Pais de origen: " + pais_origen + 
                " - Habilidad principal: " + habilidad_ppal + '.';
    }   
    

    public int debilitar(int ataque){       
       //int acumulador = 0;
       this.energia = this.energia - ataque;       
       return energia;
    }