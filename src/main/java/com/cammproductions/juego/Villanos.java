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

    public Villanos(String nombre, String pais_origen, String habilidad_ppal, int indice_maldad) {
        super(nombre, pais_origen, habilidad_ppal);
        this.indice_maldad = indice_maldad;
    }

    public int getIndice_maldad() {
        return indice_maldad;
    }

    public void setIndice_maldad(int indice_maldad) {
        this.indice_maldad = indice_maldad;
    }
    
    public int atacarVillano_1(){
       int golpe_LazoSpaguetti=28;
       int debilitar=this.getEnergia()-golpe_LazoSpaguetti;
       return debilitar;
    }
    
    public int atacarVillano_2(){
       int golpe_PizzaBoomerang=12;
       int debilitar=this.getEnergia()-golpe_PizzaBoomerang;
       return debilitar;       
    }
        
    public int atacarVillano_3(){
       int golpe_VuelaAlto=11; 
       int debilitar=this.getEnergia()-golpe_VuelaAlto;
       return debilitar;          
    }
     
    public int atacarVillano_4(){
       int golpe_BalaTunas=35; 
       int debilitar=this.getEnergia()-golpe_BalaTunas;
       return debilitar; 
    }

    void debilitar(int atacarHeroe_1) {
       
    }
    
}
