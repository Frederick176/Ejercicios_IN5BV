
package org.prueba.bean;

/**
 *
 * Nombre : Johan Miguel Tojin Acabal
 * Grado:   5to Perito Informatica
 * Seccion: IN5BV
 * Carnet:  2020591
 */
public class Desarrollador extends Empleado {
    private String lenguajeProgramacion;

    // Constructor lleno
    public Desarrollador(String nombre, int edad, double salario, String lenguajeProgramacion) {
        super(nombre, edad, salario);  
        // Llama al constructor de la clase base
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    // Getter para lenguajeProgramacion
    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    // Setter para lenguajeProgramacion
    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    // Implementación del método abstracto trabajar()
    @Override
    public void trabajar() {
        System.out.println("Desarrollador trabajando con el lenguaje: " + lenguajeProgramacion);
    }

    // Sobrecarga del método trabajar(int horas) si es necesario
    @Override
    public void trabajar(int horas) {
        super.trabajar(horas);  // Llama al método trabajar(int horas) de la clase base
        System.out.println("Desarrollador ha trabajado " + horas + " horas en el lenguaje: " + lenguajeProgramacion);
    }
}
