
package Taller_02_Ejercicio_01;

import javax.swing.JOptionPane;


public class Producto {
     
  
    String nombre;
    int precio;


  
    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

   
    public void Producto() {
        String mensaje = "Producto: " + nombre + "\n Precio: $" + precio ;
        
        JOptionPane.showMessageDialog(null, mensaje);
    }

  

}
