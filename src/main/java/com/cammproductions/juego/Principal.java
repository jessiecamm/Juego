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
        System.out.println("PRESENTACIÓN DE PERSONAJES:");
        System.out.println();
        
        Heroes h1=new Heroes();

        h1.setEnergia(100);
        h1.setPais_origen("Inglaterra");
        h1.setNombre("Rober-Tone");
        h1.setHabilidad_ppal("Decibeles Mortales");
        h1.setIndice_bondad(9);
        Heroes h2=new Heroes("Halcón del desierto","Nueva Zelanda", "Ojos láser", 100, 8);        
                
        System.out.println("HEROES:");
        System.out.println(h1.toString());
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
        System.out.println(v1.toString());
        System.out.println("Índice de Maldad > "+ v1.getIndice_maldad());
        System.out.println();
              
        System.out.println(v2.toString());
        System.out.println("Índice de Maldad > "+ v2.getIndice_maldad());
        System.out.println();
        
        System.out.println("QUÉ COMIENCE EL JUEGO!");
        System.out.println("Hoy se enfrentan: " + h1.getNombre() + " vs. " + v1.getNombre());
        System.out.println("LET'S FIGHT!");
        System.out.println();
        
        System.out.println(h1.getNombre() + " comienza el encuentro con una energía del "+h1.getEnergia() +  ("%."));
        System.out.println(v1.getNombre() + " comienza el encuentro con una energía del "+v1.getEnergia() +  ("%."));
        System.out.println();
        while (h1.getEnergia()>0 && v1.getEnergia()>0) {
        int minimo = 1;
        int maximo = 4;
        int golpeHeroes = Super_X.generarNumeroAleatorio(minimo, maximo);
        int golpe;
        golpe=0;
        int energia_actual_Heroes=h1.debilitar(golpe);
        
        switch(golpeHeroes) {
            case 1:
                golpe = h1.debilitar(v1.atacarVillano_1());                             
                System.out.println("A " + h1.getNombre() + " le queda " +golpe +  "% de energía.");
                break;
            case 2:
                golpe = h1.debilitar(v1.atacarVillano_2());                
                System.out.println("A " + h1.getNombre() + " le queda " +golpe +  "% de energía.");
                break;
            case 3:
                golpe = h1.debilitar(v1.atacarVillano_3());
                System.out.println("A " + h1.getNombre() + " le queda " +golpe +  "% de energía.");
                break;
            case 4:
                golpe = h1.debilitar(v1.atacarVillano_4());                
                System.out.println("A " + h1.getNombre() + " le queda " +golpe +  "% de energía.");
                break;
            default:
                break;                
        }
       
        int golpeVillanos = Super_X.generarNumeroAleatorio(minimo, maximo);
        golpe=0;
        int energia_actual_Villanos=v1.debilitar(golpe);
        
        switch(golpeVillanos) {
            case 1:
                golpe = v1.debilitar(h1.atacarHeroe_1());                             
                System.out.println("A " + v1.getNombre() + " le queda " +golpe +  "% de energía.");
                break;
            case 2:
                golpe = v1.debilitar(h1.atacarHeroe_2());                
                System.out.println("A " + v1.getNombre() + " le queda " +golpe +  "% de energía.");
                break;
            case 3:
                golpe = v1.debilitar(h1.atacarHeroe_3());
                System.out.println("A " + v1.getNombre() + " le queda " +golpe +  "% de energía.");
                break;
            case 4:
                golpe = v1.debilitar(h1.atacarHeroe_4());                
                System.out.println("A " + v1.getNombre() + " le queda " +golpe +  "% de energía.");
                break;
            default:
                break;                
        }
        
            if ((v1.getEnergia() < h1.getEnergia() && h1.getEnergia()>=0)){
                System.out.println(h1.getNombre()+ " ha vencido a " + v1.getNombre() + "!! "
                    + v1.getNombre() + " ha muerto." + " May the forth be with her.");
            } else if ((v1.getEnergia() > h1.getEnergia() && v1.getEnergia() >=0)){
                System.out.println(v1.getNombre()+ " ha vencido a " + h1.getNombre() + "!! "
                    + h1.getNombre() + " ha muerto." + " May the forth be with him.");
            } else {
                System.out.println("Ambos son PERDEDORES, han muerto!!!!");
            }
            
      } 
    }   
}
