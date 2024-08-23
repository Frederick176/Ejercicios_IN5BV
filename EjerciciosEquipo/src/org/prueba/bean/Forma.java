package org.prueba.bean;
/**
 *
 * @author informatica
 */
public abstract class Forma {
    private String color;

    public Forma() {
    }

    public Forma(String color) {
        this.color = color;
    }
     public abstract double calcularArea();
     
     public double calcularArea(String mensaje){
         System.out.println(mensaje);
         return calcularArea();
     }
     
     public abstract double calcularArea(double ajuste);
    
}
