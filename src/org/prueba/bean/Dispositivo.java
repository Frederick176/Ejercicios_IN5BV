package org.prueba.bean;

public abstract class Dispositivo {
    private String marca;
    private String modelo;
    private int anio;
    
    public Dispositivo(){
    
    }
    
    public Dispositivo(String marca, String modelo, int anio){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio; 
        
    }
    
    public abstract void encender();
    
    public void encender(int voltaje){
        System.out.println("Encender el dispositivo a " + voltaje + "voltios" );
        
    }
    
    public void mostrarInformacion(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo " + modelo);
        System.out.println("Anio: " + anio);
        
    }
}
