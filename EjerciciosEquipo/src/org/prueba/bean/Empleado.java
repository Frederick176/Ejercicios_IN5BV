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
public abstract class Empleado {
    // atributos:  nombre, edad, salario
    private String nombre;
    private int edad;
    private double salario;
    
     // Método abstracto trabajar
    abstract void trabajar();
    
    // metodo normal 
    void trabajar(int horas) {
        System.out.println("horas trabajadas.");
    }
}
