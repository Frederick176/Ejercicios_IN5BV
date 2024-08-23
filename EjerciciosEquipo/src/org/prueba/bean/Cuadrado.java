package org.prueba.bean;

/**
 *
 * @author informatica
 */
public class Cuadrado extends Forma {
    private double base;
    private double altura;

    public Cuadrado() {
    }

    public Cuadrado(String color , double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
       return base * altura;
    }

    @Override
    public double calcularArea(double ajuste) {
        return calcularArea() + ajuste;
    }
}