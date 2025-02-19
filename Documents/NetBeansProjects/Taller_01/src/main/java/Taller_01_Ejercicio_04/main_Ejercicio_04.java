
package Taller_01_Ejercicio_04;

import Taller_01_Ejercicio_02.CuentaBancaria;
import com.mycompany.taller_01_Ejercice_01.Libro;
import javax.swing.JOptionPane;
import taller_01_Ejercice_03.Estudiante;

public class main_Ejercicio_04 {
    
    public static void main(String[] args) {
        
         
        String titulo = JOptionPane.showInputDialog(" Ingrese el titulo del libro:");
        String autor = JOptionPane.showInputDialog("Ingrese el autor del libro:");
        int numeroPaginas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de paginas del libro:"));
        Libro libro = new Libro(titulo, autor, numeroPaginas);

      
        String numeroCuenta = JOptionPane.showInputDialog("Ingrese el numero de cuenta:");
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el saldo:"));
        String tipoCuenta = JOptionPane.showInputDialog("Ingrese el tipo de cuenta:");
        CuentaBancaria cuentaBancaria = new CuentaBancaria(numeroCuenta, (int) saldo, tipoCuenta);

        
        String nombre = JOptionPane.showInputDialog(" Ingrese el nombre del estudiante:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante:"));
        String curso = JOptionPane.showInputDialog("Ingrese el curso del estudiante:");
        Estudiante estudiante = new Estudiante(nombre, edad, curso);
        
       /*  // ESTO ES EN DADO CASO QUE YO LO QUIERA PONER  LOS DATOS DETERMINADO 
        
        Libro libro = new Libro("El zorro feliz", "Luka modric", 10);     
        CuentaBancaria cuentaBancaria = new CuentaBancaria("12345",15000 , "Corriente");
        Estudiante estudiante = new Estudiante("Sadir", 18, "3 semestre");
      */
            
        libro.mostrar();
        cuentaBancaria.Detalles();
        estudiante.mostrarDetalles();
    }
}

