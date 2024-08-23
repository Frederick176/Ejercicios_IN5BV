package org.prueba.bean;

public class Telefono extends Dispositivo {
    private String tipo;
    
    public Telefono(){
    
    }

    public Telefono(String marca, String modelo, int anio, String tipo) {
        super(marca, modelo, anio);
        this.tipo = tipo;
        
    }   
    
    @Override
    public void encender(){
        System.out.println("Encendiendo el telefono " + tipo + "...");
        
    }
    
    public void encender(String codigo){
        System.out.println("Encendiendo el telefono con codigo de bloqueo: " + codigo);
        
    }
}
