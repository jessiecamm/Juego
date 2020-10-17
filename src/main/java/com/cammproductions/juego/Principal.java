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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Mortal Kombat 2.0");
        System.out.println("By Camm & Marto");
        System.out.println();
        System.out.println("Presentación de Personajes:");
        System.out.println();
        
        Heroes h1=new Heroes();
        h1.setPais_origen("Australia");
        h1.setNombre("Puño de Hierro");
        h1.setHabilidad_ppal("Super Puñetazo");
        h1.setIndice_bondad(10);
        Heroes h2=new Heroes(100,8, "Halcón del desierto","Nueva Zelanda", "Ojos láser");
        h2.setIndice_bondad(8);
        
        System.out.println("HEROES:");
        System.out.println(h1.getNombre() + " es de " + h1.getPais_origen() + 
                ", su principal habilidad es el " + h1.getHabilidad_ppal() + ".");
        System.out.println("Índice de Bondad > "+ h1.getIndice_bondad());
        System.out.println();
                
        System.out.println(h2.toString());
        System.out.println("Índice de Bondad > "+ h2.getIndice_bondad());
        System.out.println();
        
        Villanos v1=new Villanos();
        v1.setNombre("Cruela");
        v1.setPais_origen("Italia");
        v1.setHabilidad_ppal("vuela muy alto");
        v1.setIndice_maldad(10);
        Villanos v2=new Villanos(100, 8, "Destructor", "Nueva York", "Fuerza extrema");
        v2.setIndice_maldad(9);
        
        System.out.println();      
        System.out.println("VILLANOS:");
        System.out.println(v1.getNombre() + " es de " + v1.getPais_origen() + 
                ", como principal habilidad tiene " + v1.getHabilidad_ppal() + ".");
        System.out.println("Índice de Maldad > "+ v1.getIndice_maldad());
        System.out.println();
              
        System.out.println(v2.getNombre() + " es de " + v2.getPais_origen() + 
                ", su principal habilidad es que " + v2.getHabilidad_ppal() + ".");
        System.out.println("Índice de Maldad > "+ v2.getIndice_maldad());
        System.out.println();               
        
    }   
}
