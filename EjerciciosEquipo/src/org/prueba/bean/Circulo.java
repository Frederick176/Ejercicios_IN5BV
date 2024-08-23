package org.prueba.bean;

/**
 *
 * @author informatica
 */
public class Circulo extends Forma{
    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
    
    @Override
    public double calcularArea(double ajuste) {
        return calcularArea() + ajuste;
    }  
}
