/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cammproductions.juego;

import Vista.rePantalla;

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
        
        rePantalla pantalla1=new rePantalla();
        pantalla1.setVisible(true); 
    }    
    
    
    /*
    TEXTO ORIGINAL CON WHILE QUE LOOPEA
        texto_resultado.setText("Mortal Kombat 2.0");        
        texto_resultado.append("\nBy Camm & Marto");
                
        
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
        
        texto_resultado.append("\n\nPRESENTACIÓN DE PERSONAJES:"); 
        
        
        //Lista de luchadores
        String [] lista = new String [4];
        
        lista[0]= "HEROES: \n"+h1.toString() + " Indice de Bondad: "+h1.getIndice_bondad();
        lista[1]= h2.toString() + " Indice de Bondad: "+h2.getIndice_bondad()+"\n";        
        lista[2]= "VILLANOS: \n"+v1.toString() + " Indice de Maldad: "+v1.getIndice_maldad();
        lista[3]= v2.toString() + " Indice de Maldad: "+v2.getIndice_maldad();
        
        //Recorro la lista
        for (int i=0; i<4; i++) {                                      
            texto_resultado.append("\n\n"+lista[i]);                 
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
        
        texto_resultado.append("\n\nQUE COMIENCE EL JUEGO!");     
        texto_resultado.append("\nHoy se enfrentan..."); 
        
        int luchUnoEnergia = 0;
        int luchDosEnergia = 0;
        
        switch(luch1) {
            case 1:                
                texto_resultado.append(h1.getNombre());                
                luchUnoEnergia = h1.getEnergia();
                break;
            case 2:                
                texto_resultado.append(h2.getNombre());
                luchUnoEnergia = h2.getEnergia();
                break;                
            case 3:                
                texto_resultado.append(v1.getNombre());
                luchUnoEnergia = v1.getEnergia();
                break;
            case 4:                
                texto_resultado.append(v2.getNombre());
                luchUnoEnergia = v2.getEnergia();
                break;
            default:
                texto_resultado.append("¡Error!");
                break;                
        }       
        
        switch(luch2) {
            case 1:                
                texto_resultado.append(" vs. "+h1.getNombre());
                luchDosEnergia = h1.getEnergia();
                break;

            case 2:                
                texto_resultado.append(" vs. "+h2.getNombre());
                luchDosEnergia = h2.getEnergia();
                break;                
            case 3:                
                texto_resultado.append(" vs. "+v1.getNombre());
                luchDosEnergia = v1.getEnergia();
                break;
            case 4:                
                texto_resultado.append(" vs. "+v2.getNombre());
                luchDosEnergia = v2.getEnergia();
                break;
            default:
                texto_resultado.append("¡Error!");
                break;                
        }                
        
        texto_resultado.append("Luch1: "+luch1+" vs. "+"Luch2: "+luch2);
        System.out.println();
        texto_resultado.append("\n\nAmbos luchadores comienzan el encuentro con una energía del 100%");
        texto_resultado.append("LET'S FIGHT!");                               
        
        
        
        //while ((h1.getEnergia() > 0) || (v1.getEnergia() > 0) || (h2.getEnergia() > 0) || (v2.getEnergia() > 0)) {
        while ((luchUnoEnergia > 0) && (luchDosEnergia > 0)) {
            int minimo = 1;
            int maximo = 4;
            int golpeHeroes = Super_X.generarNumeroAleatorio(minimo, maximo);
            int golpeVillanos = Super_X.generarNumeroAleatorio(minimo, maximo);
            int golpe;
            
            switch(golpeHeroes) {
                case 1:
                    golpe = h1.debilitar(v1.atacarVillano_1());
                    texto_resultado.append("----- A " + h1.getNombre() + " le queda " +golpe +  "% de energía.");
                    break;
                case 2:
                    golpe = h1.debilitar(v1.atacarVillano_2());
                    texto_resultado.append("----- A " + h1.getNombre() + " le queda " +golpe +  "% de energía.");
                    break;
                case 3:
                    golpe = h1.debilitar(v1.atacarVillano_3());
                    texto_resultado.append("----- A " + h1.getNombre() + " le queda " +golpe +  "% de energía.");
                    break;
                case 4:
                    golpe = h1.debilitar(v1.atacarVillano_4());
                    texto_resultado.append("----- A " + h1.getNombre() + " le queda " +golpe +  "% de energía.");
                    break;
                default:
                    break;
            }
            switch(golpeVillanos) {
                case 1:
                    golpe = v1.debilitar(h1.atacarHeroe_1());
                    texto_resultado.append("----- A " + v1.getNombre() + " le queda " +golpe +  "% de energía.");
                    texto_resultado.append("***************************************************************************");
                    break;
                case 2:
                    golpe = v1.debilitar(h1.atacarHeroe_2());
                    texto_resultado.append("----- A " + v1.getNombre() + " le queda " +golpe +  "% de energía.");
                    texto_resultado.append("***************************************************************************");
                    break;
                case 3:
                    golpe = v1.debilitar(h1.atacarHeroe_3());
                    texto_resultado.append("----- A " + v1.getNombre() + " le queda " +golpe +  "% de energía.");
                    texto_resultado.append("***************************************************************************");
                    break;
                case 4:
                    golpe = v1.debilitar(h1.atacarHeroe_4());
                    texto_resultado.append("----- A " + v1.getNombre() + " le queda " +golpe +  "% de energía.");
                    texto_resultado.append("***************************************************************************");
                    break;
                default:
                    break;
            }
            
            int energia_actual_Villanos=v1.getEnergia();
            int energia_actual_Heroes=h1.getEnergia();
            if ((energia_actual_Villanos <= 0) && (energia_actual_Heroes > 0)) {
                texto_resultado.append(h1.getNombre()+ " ha vencido a " + v1.getNombre() + "!! "
                + v1.getNombre() + " ha muerto." + " May the forth be with her.");
            }
            else if ((energia_actual_Heroes <= 0) && (energia_actual_Villanos > 0)) {
                texto_resultado.append(v1.getNombre()+ " ha vencido a " + h1.getNombre() + "!! "
                + h1.getNombre() + " ha muerto." + " May the forth be with him.");
            }
            else if((energia_actual_Villanos <=0) && (energia_actual_Heroes <=0)) {
                texto_resultado.append("Ambos son PERDEDORES, han muerto!!!!"
                + " Ahora pelean para el más allá. Bienvenidos al mundo ZOMBIE.");
            }
        }
    */
}