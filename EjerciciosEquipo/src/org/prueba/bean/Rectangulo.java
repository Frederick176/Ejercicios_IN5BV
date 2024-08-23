package org.prueba.bean;

/**
 *
 * @author informatica
 */
public class Rectangulo extends Forma{
    private double largo;
    private double ancho;

    public Rectangulo() {
    }

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return (largo * ancho);
    }

    @Override
    public double calcularArea(double ajuste) {
        return calcularArea() + ajuste;
    }
    
    
}
