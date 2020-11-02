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
        v1.setHabilidad_ppal("Vuela muy alto");
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
        System.out.println();
        
        //Lista de luchadores
        String [] lista = new String [4];
        
        lista[0]="Rober-Tone";
        lista[1]="Halcon Del Desierto";        
        lista[2]="Cruela";
        lista[3]="Destructor";
        
        System.out.println("Presentando a los Luchadores:\n");
        for (int i=0; i<4; i++) {                                      
            System.out.println((i+1) + " "+lista[i]);
        }
                
        //Elección al azar de los luchadores
        int numMin = 1;     //el indice minimo de la lista
        int numMax = 4;    //el indice maximo de la lista        
        int luch1 = (int)Math.floor(Math.random()*(numMax - numMin +1)+(numMin));            
        int luch2 = (int)Math.floor(Math.random()*(numMax - numMin +1)+(numMin));
        
        //Validar para no repetir personajes
        if (luch1 == luch2) {
            luch2 = (int)Math.floor(Math.random()*(numMax - numMin +1)+(numMin));                
        }
        System.out.println();
        System.out.println("QUÉ COMIENCE EL JUEGO!");     
        System.out.println("Hoy se enfrentan...");                 
        
        switch(luch1) {
            case 1:
                System.out.print("Combate: "+lista[0]);                
                lista[0]=h1.getNombre();                
                break;
            case 2:
                System.out.print("Combate: "+lista[1]);
                lista[1]=h2.getNombre();
                break;                
            case 3:
                System.out.print("Combate: "+lista[2]);
                lista[2]=v1.getNombre();
                break;
            case 4:
                System.out.print("Combate: "+lista[3]);
                lista[3]=v2.getNombre();
                break;
            default:
                System.out.println("¡Error!");
                break;                
        }       
        
        switch(luch2) {
            case 1:
                System.out.println(" vs. "+lista[0]);
                lista[0]=h1.getNombre();
                break;
            case 2:
                System.out.println(" vs. "+lista[1]);
                lista[1]=h2.getNombre();
                break;                
            case 3:
                System.out.println(" vs. "+lista[2]);
                lista[2]=v1.getNombre();
                break;
            case 4:
                System.out.println(" vs. "+lista[3]);
                lista[3]=v2.getNombre();
                break;
            default:
                System.out.println("¡Error!");
                break;                
        }
        
        
        
        /*System.out.println("QUÉ COMIENCE EL JUEGO!");     
        System.out.print("Hoy se enfrentan: ");
        int minimo = 1;
        int maximo = 2;        
        
        int luchador1 = Heroes.generarNumeroAleatorio(minimo, maximo);
        switch(luchador1) {
            case 1:
                System.out.print(h1.getNombre()+ " vs. ");                              
                break;
            case 2:
                System.out.print(h2.getNombre()+ " vs. ");                
                break;
            default:
                break;            
        }
        
        int luchador2 = Villanos.generarNumeroAleatorio(minimo, maximo);
        switch(luchador2)  {
            case 1:
                System.out.print(v1.getNombre());                
                break;
            case 2:
                System.out.print(v2.getNombre());
                break;
            default:
                break;
        }        
        
        System.out.println();                        
        System.out.println("LET'S FIGHT!");
        System.out.println();
        
        System.out.println(h1.getNombre() + " comienza el encuentro con una energía del "+h1.getEnergia() +  ("%."));
        System.out.println(v1.getNombre() + " comienza el encuentro con una energía del "+v1.getEnergia() +  ("%."));
        System.out.println();
         
        
        while ((h1.getEnergia() > 0) && (v1.getEnergia() > 0)) {            
            minimo = 1;
            maximo = 4;
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