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

    public Heroes(String nombre, String pais_origen, String habilidad_ppal, int indice_bondad) {
        super(nombre, pais_origen, habilidad_ppal);
        this.indice_bondad = indice_bondad;
    }

    public int getIndice_bondad() {
        return indice_bondad;
    }

    public void setIndice_bondad(int indice_bondad) {
        this.indice_bondad = indice_bondad;
    }
    
    
    public int atacarHeroe_1(){
       int golpe_PatadaDientes=10;
       int debilitar=this.getEnergia()-golpe_PatadaDientes;
       return debilitar;
    }
    
    public int atacarHeroe_2(){
       int golpe_DecibelesMortales=20;
       int debilitar=this.getEnergia()-golpe_DecibelesMortales;
       return debilitar;       
    }
        
    public int atacarHeroe_3(){
       int golpe_GuitarraDistorsionada=5; 
       int debilitar=this.getEnergia()-golpe_GuitarraDistorsionada;
       return debilitar;          
    }
     
    public int atacarHeroe_4(){
       int golpe_AcopleSangraOidos=15; 
       int debilitar=this.getEnergia()-golpe_AcopleSangraOidos;
       return debilitar;    
    }           
}
