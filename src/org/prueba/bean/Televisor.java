package org.prueba.bean;

public class Televisor extends Dispositivo{
    private int tamañoPantalla;
    
    public Televisor(){
    
    }
    
    public Televisor(String marca, String modelo, int anio, int tamañoPantalla){
        super(marca, modelo, anio);
        this.tamañoPantalla = tamañoPantalla;
        
    }
    
}
