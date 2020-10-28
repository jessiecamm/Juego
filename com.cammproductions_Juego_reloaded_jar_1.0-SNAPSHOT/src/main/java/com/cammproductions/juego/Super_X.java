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

    public Super_X(String nombre, String pais_origen, String habilidad_ppal, int energia) {
        this.energia = energia;
        this.nombre = nombre;
        this.pais_origen = pais_origen;
        this.habilidad_ppal = habilidad_ppal;
    }

    public int getEnergia() {
        return energia;
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
        return ">>>> " + nombre + " es de " + pais_origen + 
                ", su principal habilidad es " + habilidad_ppal + '.';
    }

    //Método para generar número aleatorio
    /**
     *
     * @param minimo
     * @param maximo
     * @return
     */    
    public static int generarNumeroAleatorio(int minimo,int maximo) {        
        int num =(int)Math.floor(Math.random()*(maximo-minimo+1)+(minimo));
        return num;
    }
   

    //Método debilitar
    public int debilitar(int golpe) {       
        this.energia-= golpe;        
        return this.energia;
    }
}