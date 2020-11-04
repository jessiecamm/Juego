/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cammproductions.juego;

import Modelo.Villanos;
import Modelo.Super_X;
import Modelo.Heroes;
import Vista.Pantalla;

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
        /*
        Pantalla pantalla1=new Pantalla();
        pantalla1.setVisible(true);*/
        
        //Esto lo deje acá porque es lo que después quiero que veamos como hacer que se vea siempre
        System.out.println("Mortal Kombat 2.0");
        System.out.println("By Camm & Marto");
        System.out.println();        
        
        //Creación de Heroes
        Heroes h1=new Heroes();
        h1.setEnergia(100);
        h1.setPais_origen("Inglaterra");
        h1.setNombre("Rober-Tone");
        h1.setHabilidad_ppal("Decibeles Mortales");
        h1.setIndice_bondad(9);
        
        Heroes h2=new Heroes("Halcón del desierto","Nueva Zelanda", "Ojos láser", 100, 8);        
        
        //Creación de Villanos
        Villanos v1=new Villanos();
        v1.setEnergia(100);
        v1.setNombre("Cruela");
        v1.setPais_origen("Italia");
        v1.setHabilidad_ppal("Vuela muy alto");
        v1.setIndice_maldad(10);
        
        Villanos v2=new Villanos("Destructor", "Nueva York", "Fuerza extrema",100, 9);        
        
        System.out.println("PRESENTACIÓN DE PERSONAJES:\n");        
        
        //Lista de luchadores
        String [] lista = new String [4];
        
        lista[0]= "HEROES: \n"+h1.toString() + " Indice de Bondad: "+h1.getIndice_bondad();
        lista[1]= h2.toString() + " Indice de Bondad: "+h2.getIndice_bondad()+"\n";        
        lista[2]= "VILLANOS: \n"+v1.toString() + " Indice de Maldad: "+v1.getIndice_maldad();
        lista[3]= v2.toString() + " Indice de Maldad: "+v2.getIndice_maldad();
        
        //Recorro la lista
        for (int i=0; i<4; i++) {                                      
            System.out.println(lista[i]);                 
        }                        
                
        //Elección al azar de los luchadores
        int numMin = 1;     //el indice minimo de la lista
        int numMax = 4;    //el indice maximo de la lista        
        int luch1 = (int)Math.floor(Math.random()*(numMax - numMin +1)+(numMin));            
        int luch2 = (int)Math.floor(Math.random()*(numMax - numMin +1)+(numMin));
        
        //Validar para no repetir personajes
        if (luch2 == luch1) {
            luch2 = (int)Math.floor(Math.random()*(numMax - numMin +1)+(numMin));                
        }
        System.out.println();
        System.out.println("QUE COMIENCE EL JUEGO!");     
        System.out.println("Hoy se enfrentan...\n"); 
        
        int luchUnoEnergia = 0;
        int luchDosEnergia = 0;
        
        switch(luch1) {
            case 1:                
                System.out.print(h1.getNombre());                
                luchUnoEnergia = h1.getEnergia();
                break;
            case 2:                
                System.out.print(h2.getNombre());
                luchUnoEnergia = h2.getEnergia();
                break;                
            case 3:                
                System.out.print(v1.getNombre());
                luchUnoEnergia = v1.getEnergia();
                break;
            case 4:                
                System.out.print(v2.getNombre());
                luchUnoEnergia = v2.getEnergia();
                break;
            default:
                System.out.println("¡Error!");
                break;                
        }       
        
        switch(luch2) {
            case 1:                
                System.out.println(" vs. "+h1.getNombre());
                luchDosEnergia = h1.getEnergia();
                break;

            case 2:                
                System.out.println(" vs. "+h2.getNombre());
                luchDosEnergia = h2.getEnergia();
                break;                
            case 3:                
                System.out.println(" vs. "+v1.getNombre());
                luchDosEnergia = v1.getEnergia();
                break;
            case 4:                
                System.out.println(" vs. "+v2.getNombre());
                luchDosEnergia = v2.getEnergia();
                break;
            default:
                System.out.println("¡Error!");
                break;                
        }                
        
        System.out.println("Luch1: "+luch1+" vs. "+"Luch2: "+luch2);
        System.out.println();
        System.out.println("Ambos luchadores comienzan el encuentro con una energía del 100%");
        System.out.println("LET'S FIGHT!\n");                               
        
        
        /*
        while ((h1.getEnergia() > 0) || (v1.getEnergia() > 0) || (h2.getEnergia() > 0) || (v2.getEnergia() > 0)) {
        //while ((luchUnoEnergia > 0) && (luchDosEnergia > 0)) {
            int minimo = 1;
            int maximo = 8;
            int golpeHeroes = Super_X.generarNumeroAleatorio(minimo, maximo);
            int golpeVillanos = Super_X.generarNumeroAleatorio(minimo, maximo);
            int golpe;
            
            switch(golpeHeroes) {
                case 1:
                    golpe = h1.debilitar(v1.atacarVillano_1());
                    System.out.println("----- A " + h1.getNombre() + " le queda " +golpe +  "% de energía.");
                    break;
                case 2:
                    golpe = h1.debilitar(v1.atacarVillano_2());
                    System.out.println("----- A " + h1.getNombre() + " le queda " +golpe +  "% de energía.");
                    break;
                case 3:
                    golpe = h1.debilitar(v1.atacarVillano_3());
                    System.out.println("----- A " + h1.getNombre() + " le queda " +golpe +  "% de energía.");
                    break;
                case 4:
                    golpe = h1.debilitar(v1.atacarVillano_4());
                    System.out.println("----- A " + h1.getNombre() + " le queda " +golpe +  "% de energía.");
                    break;
                default:
                    break;
            }
            switch(golpeVillanos) {
                case 1:
                    golpe = v1.debilitar(h1.atacarHeroe_1());
                    System.out.println("----- A " + v1.getNombre() + " le queda " +golpe +  "% de energía.");
                    System.out.println("***************************************************************************");
                    break;
                case 2:
                    golpe = v1.debilitar(h1.atacarHeroe_2());
                    System.out.println("----- A " + v1.getNombre() + " le queda " +golpe +  "% de energía.");
                    System.out.println("***************************************************************************");
                    break;
                case 3:
                    golpe = v1.debilitar(h1.atacarHeroe_3());
                    System.out.println("----- A " + v1.getNombre() + " le queda " +golpe +  "% de energía.");
                    System.out.println("***************************************************************************");
                    break;
                case 4:
                    golpe = v1.debilitar(h1.atacarHeroe_4());
                    System.out.println("----- A " + v1.getNombre() + " le queda " +golpe +  "% de energía.");
                    System.out.println("***************************************************************************");
                    break;
                default:
                    break;
            }
            
            int energia_actual_Villanos=v1.getEnergia();
            int energia_actual_Heroes=h1.getEnergia();
            if ((energia_actual_Villanos <= 0) && (energia_actual_Heroes > 0)) {
                System.out.println(h1.getNombre()+ " ha vencido a " + v1.getNombre() + "!! "
                + v1.getNombre() + " ha muerto." + " May the forth be with her.");
            }
            else if ((energia_actual_Heroes <= 0) && (energia_actual_Villanos > 0)) {
                System.out.println(v1.getNombre()+ " ha vencido a " + h1.getNombre() + "!! "
                + h1.getNombre() + " ha muerto." + " May the forth be with him.");
            }
            else if((energia_actual_Villanos <=0) && (energia_actual_Heroes <=0)) {
                System.out.println("Ambos son PERDEDORES, han muerto!!!!"
                + " Ahora pelean para el más allá. Bienvenidos al mundo ZOMBIE.");
            }
        }*/
    }
}