/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.prueba.bean;

/**
 *
 * @author informatica
 */
public class Triangulo extends Forma{
    private double base;
    private double altura;

    public Triangulo() {
    }

    public Triangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura)/2;
    }

    @Override
    public double calcularArea(double ajuste) {
       return calcularArea() + ajuste;
    } 
}