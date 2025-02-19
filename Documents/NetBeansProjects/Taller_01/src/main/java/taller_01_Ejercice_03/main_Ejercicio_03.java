
package taller_01_Ejercice_03;

import javax.swing.JOptionPane;

public class main_Ejercicio_03 {
     public static void main(String[] args) {
        /*//este sirve si se quiere pedir los datos al usuario pero de momemnto lo dejaremos ya determinados 
         
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante:"));
        String curso = JOptionPane.showInputDialog("Ingrese el curso del estudiante:");
         */
        // Crear objeto y mostrar detalles
        Estudiante std = new Estudiante("sadir", 18, "3");
        std.mostrarDetalles();
    }
}
