package org.prueba.bean;

public class Televisor extends Dispositivo{
    private int tamañoPantalla;
    
    public Televisor(){
    
    }
    
    public Televisor(String marca, String modelo, int anio, int tamañoPantalla){
        super(marca, modelo, anio);
        this.tamañoPantalla = tamañoPantalla;
        
    }
    
    @Override
    public void encender() {
        System.out.println("Encendiendo televisor de " + tamañoPantalla + " pulgadas...");
        
    }
    
    public void encender(int volumen) {
        System.out.println("Encendiendo televisor con volumen: " + volumen);
        
    }
}
