/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Jessie
 */
public class Heroes extends Super_X {
    
    private int indice_bondad;
    
    public Heroes() {
    }

    public Heroes(String nombre, String pais_origen, String habilidad_ppal, int energia, int indice_bondad) {
        super(nombre, pais_origen, habilidad_ppal, energia);
        this.indice_bondad = indice_bondad;
    }

    public int getIndice_bondad() {
        return indice_bondad;
    }

    public void setIndice_bondad(int indice_bondad) {
        this.indice_bondad = indice_bondad;
    }
    
    //Métodos de ataque de Heroes    
    public int atacarHeroe_1() {
        if (super.getEnergia() > 0) {
            System.out.println(super.getNombre()+ " lo ataca con sus DECIBELES MORTALES"
                + ", le roba 30 puntos de energia a su oponente.");
            int golpe1;
            golpe1= 30;
            if (this.indice_bondad>8) {
                golpe1+=5;
                System.out.println("BONUS: Por indice de bondad, le roba 5 puntos más!");
            }               
            return golpe1;
        }
        System.out.println(super.getNombre()+" YOU'RE SO FUCKIN' DEAD DUDE!!");
        return 0;        
    }
    
    public int atacarHeroe_2() {        
        if (super.getEnergia() > 0) {
            System.out.println(super.getNombre()+ " lo ataca con su GUITARRA ULTRA DISTORSIONADA"
                    + ", le roba 10 puntos de energia a su oponente.");
            int golpe2;
            golpe2 = 10;        
            return golpe2;
        }
        System.out.println(super.getNombre()+" YOU'RE SO FUCKIN' DEAD DUDE!!");
        return 0;
    }
    
    public int atacarHeroe_3() {    
        if (super.getEnergia() > 0) {
            System.out.println(super.getNombre()+ " lo ataca con una PATADA EN LOS DIENTES"
                + ", le roba 15 puntos de energia a su oponente.");
            int golpe3;
            golpe3 = 15;        
            return golpe3;
        }
        System.out.println(super.getNombre()+" YOU'RE SO FUCKIN' DEAD DUDE!!");
        return 0;
    }
    
    public int atacarHeroe_4() {    
        if (super.getEnergia() > 0) {
            System.out.println(super.getNombre()+ " lo ataca con su ACOPLE SANGRA OIDOS"
                + ", le roba 5 puntos de energia a su oponente.");
            int golpe4;
            golpe4 = 5;        
            return golpe4;
        }
        System.out.println(super.getNombre()+" YOU'RE SO FUCKIN' DEAD DUDE!!");
        return 0;   
    }
    
        public int atacarHeroe_5() {
        if (super.getEnergia() > 0) {
            System.out.println(super.getNombre()+ " lo lanza en CAIDA LIBRE"
                + ", le roba 10 puntos de energia a su oponente.");
            int golpe5;
            golpe5= 10;
            if (this.indice_bondad>8) {
                golpe5+=5;
                System.out.println("BONUS: Por indice de bondad, le roba 5 puntos más!");
            }               
            return golpe5;
        }
        System.out.println(super.getNombre()+" YOU'RE SO FUCKIN' DEAD DUDE!!");
        return 0;        
    }
    
    public int atacarHeroe_6() {        
        if (super.getEnergia() > 0) {
            System.out.println(super.getNombre()+ " lo ataca tomándolo entre sus GARRAS"
                    + ", le roba 5 puntos de energia a su oponente.");
            int golpe6;
            golpe6 = 5;        
            return golpe6;
        }
        System.out.println(super.getNombre()+" YOU'RE SO FUCKIN' DEAD DUDE!!");
        return 0;
    }
    
    public int atacarHeroe_7() {    
        if (super.getEnergia() > 0) {
            System.out.println(super.getNombre()+ " lo ataca con su PICO DESGARRADOR"
                + ", le roba 15 puntos de energia a su oponente.");
            int golpe7;
            golpe7 = 15;        
            return golpe7;
        }
        System.out.println(super.getNombre()+" YOU'RE SO FUCKIN' DEAD DUDE!!");
        return 0;
    }
    
    public int atacarHeroe_8() {    
        if (super.getEnergia() > 0) {
            System.out.println(super.getNombre()+ " lo ataca con sus OJOS LÁSER"
                + ", le roba 25 puntos de energia a su oponente.");
            int golpe8;
            golpe8 = 25;        
            return golpe8;
        }
        System.out.println(super.getNombre()+" YOU'RE SO FUCKIN' DEAD DUDE!!");
        return 0;   
    }    
}