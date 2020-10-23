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

        h1.setEnergia(100);
        h1.setPais_origen("Inglaterra");
        h1.setNombre("Rober-Tone");
        h1.setHabilidad_ppal("Decibeles Mortales");
        h1.setIndice_bondad(9);
        Heroes h2=new Heroes("Halcón del desierto","Nueva Zelanda", "Ojos láser", 100, 8);        
                
        System.out.println("HEROES:");
        System.out.println(h1.getNombre() + " es de " + h1.getPais_origen() + 
                ", su principal habilidad es " + h1.getHabilidad_ppal() + ".");
        System.out.println("Índice de Bondad > "+ h1.getIndice_bondad());
        System.out.println();
                
        System.out.println(h2.toString());
        System.out.println("Índice de Bondad > "+ h2.getIndice_bondad());
        System.out.println();
        
        Villanos v1=new Villanos();
        v1.setEnergia(100);
        v1.setNombre("Cruela");
        v1.setPais_origen("Italia");
        v1.setHabilidad_ppal("vuela muy alto");
        v1.setIndice_maldad(10);

        Villanos v2=new Villanos("Destructor", "Nueva York", "Fuerza extrema",100, 9);
        
 
        System.out.println();      
        System.out.println("VILLANOS:");
        System.out.println(v1.getNombre() + " es de " + v1.getPais_origen() + 
                ", su principal habilidad es que " + v1.getHabilidad_ppal() + ".");
        System.out.println("Índice de Maldad > "+ v1.getIndice_maldad());
        System.out.println();
              
        System.out.println(v2.getNombre() + " es de " + v2.getPais_origen() + 
                ", su principal habilidad es la " + v2.getHabilidad_ppal() + ".");
        System.out.println("Índice de Maldad > "+ v2.getIndice_maldad());
        System.out.println();
        
        System.out.println("Enfrentamiento: " + h1.getNombre() + " vs. " + v1.getNombre() + " - Fight!");
        System.out.println();
        
        System.out.println("Energia Heroe: "+h1.energia);
        int minimo = 1;
        int maximo = 4;
        int golpeHeroe = Super_X.generarNumeroAleatorio(minimo, maximo);
        System.out.println("Nro Generado: "+golpeHeroe);
        int golpe;
        
        switch(golpeHeroe) {
            case 1:
                golpe = h1.debilitar(v1.atacarVillano_1());                             
                System.out.println("Energia Golpe: "+h1.getEnergia());
                System.out.println("Energia Restante >>> "+golpe);
                break;
            case 2:
                golpe = h1.debilitar(v1.atacarVillano_2());                
                System.out.println("Energia Golpe: "+h1.getEnergia());
                System.out.println("Energia Restante >>> "+golpe);
                break;
            case 3:
                golpe = h1.debilitar(v1.atacarVillano_3());
                System.out.println("Energia Golpe: "+h1.getEnergia());
                System.out.println("Energia Restante >>> "+golpe);
                break;
            case 4:
                golpe = h1.debilitar(v1.atacarVillano_4());                
                System.out.println("Energia Golpe: "+h1.getEnergia());
                System.out.println("Energia Restante >>> "+golpe);
                break;
            default:
                break;                
        }        
        
    }   
}
