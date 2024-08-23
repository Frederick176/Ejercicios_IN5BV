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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
     public abstract double calcularArea();
     
     public String calcularArea(String mensaje);
    
}
