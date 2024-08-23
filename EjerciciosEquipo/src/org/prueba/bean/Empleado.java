/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.prueba.bean;

/**
 *
 * Nombre : Johan Miguel Tojin Acabal
 * Grado:   5to Perito Informatica
 * Seccion: IN5BV
 * Carnet:  2020591
 */
public abstract class Empleado {
    // atributos:  nombre, edad, salario
    private String nombre;
    private int edad;
    private double salario;

    
    // constructor vacio 
    public Empleado() {
    }

    
    // constructor lleno
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
     // Método abstracto trabajar
    public abstract void trabajar();
    
    // metodo normal 
    public void trabajar(int horas) {
        System.out.println("horas trabajadas." + horas);
    }
    
    
}
