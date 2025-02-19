
package com.mycompany.taller_01_Ejercice_01;

import javax.swing.JOptionPane;

public class Libro {
      String titulo;
      String autor;
      int numeroPaginas;

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void mostrar() {
         String mensaje = "Titulo: " + titulo + "\n" + "Autor: " + autor + "\n" + "Numero de paginas: " + numeroPaginas;
    
   JOptionPane.showMessageDialog(null, mensaje);
    }
}