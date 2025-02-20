
package Taller_02_Ejercicio_02;

import javax.swing.JOptionPane;


public class Estudiante {
      
  String nombre;
  int edad;

    // Constructor por defecto 
    public Estudiante() {
        
    }

    // Constructor con parámetros
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void Estudiante() {
        String mensaje = "Estudiante: " + nombre + "\n Edad: " + edad;
        
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
