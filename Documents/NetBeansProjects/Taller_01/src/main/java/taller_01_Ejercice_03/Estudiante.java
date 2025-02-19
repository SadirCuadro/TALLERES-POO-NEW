
package taller_01_Ejercice_03;
import javax.swing.JOptionPane;

public class Estudiante {
 String nombre;
 int edad;
 String curso;

    // Constructor por defecto
    public Estudiante() {
   
    }

    // Constructor con dos parámetros
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = "ya asignado";
    }

    // Constructor con tres parámetros usando this()
    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad);
        this.curso = curso;
    }

    
    public void mostrarDetalles() {
        String mensaje = "Estudiante\nNombre: " + nombre + "\nEdad: " + edad + "\nCurso: " + curso;
        JOptionPane.showMessageDialog(null, mensaje);
    }

   
}

