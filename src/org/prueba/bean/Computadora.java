package org.prueba.bean;

public class Computadora extends Dispositivo{
    private String sistemaOperativo;
    
    public Computadora(){
    
    }
    
    public Computadora(String marca, String modelo, int anio, String sistemaOperativo){
        super(marca, modelo, anio);
        this.sistemaOperativo = sistemaOperativo;
        
    }
    
    @Override
    public void encender(){
        System.out.println("Enciendo la computadora con " + sistemaOperativo + "...");
        
    }
    
    public void encender(String clave){
        System.out.println("Encendiendo la computadora con la clave: " + clave);
        
    }
}
