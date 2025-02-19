package ejercicio;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class matrizDiagonal {

   public static void main(String[] args) {
        try {
            int F1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite numero de filas de la matriz 1"));
            int C1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite numero de columnas de la matriz 1"));

            if (F1 != C1) {
                JOptionPane.showMessageDialog(null, "El numero de filas y columnas deben ser iguales.");
            } else {
                int[][] Matriz = new int[F1][C1];
                for (int a = 0; a < F1; a++) {
                    for (int b = 0; b < C1; b++) {
                        Matriz[a][b] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el dato en la posicion ("+ "[" + ( a ) + "]"+"[" + ( b ) + "]"+") de la matriz"));
                    }
                }

                
                StringBuilder matrizString = new StringBuilder("Matriz ingresada:\n");
                for (int[] fila : Matriz) {
                    for (int valor : fila) {
                        matrizString.append(valor).append(", \t");
                        
                    }
                    matrizString.append("\n");
                }
                

                JOptionPane.showMessageDialog(null, matrizString.toString());
                int sumaDiagonalPrincipal = sumarDiagonalPrincipal(Matriz);
            int sumaDiagonalSecundaria = sumarDiagonalSecundaria(Matriz);

    
            JOptionPane.showMessageDialog(null, "La suma de la diagonal principal es: " + sumaDiagonalPrincipal +
                    "\nLa suma de la diagonal secundaria es: " + sumaDiagonalSecundaria);
                
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Asegurese de ingresar solo numeros enteros.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error inesperado: " + e.getMessage());
        }
    }
       public static int sumarDiagonalPrincipal(int[][] Matriz) {
        int suma = 0;
        for (int i = 0; i < Matriz.length; i++) {
            suma += Matriz[i][i];
        }
        return suma;
    }


        public static int sumarDiagonalSecundaria(int[][] Matriz) {
         int suma = 0;
         int n = Matriz.length; 
        for (int i = 0; i < n; i++) {
            suma += Matriz[i][n - 1 - i];
        }
        return suma;
    }
}