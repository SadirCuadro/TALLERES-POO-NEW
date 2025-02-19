package com.mycompany.matriz;
import javax.swing.*;
import java.util.*;
public class matrizJ {

    public static void main(String[] args) {
        
       
        try {
        int F1 =Integer.parseInt(JOptionPane.showInputDialog(null, "Digite numero de filas de la matriz 1")) ;
        int C1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite numero de columnas de la matriz 1"));
        
        if (F1 != C1){
            JOptionPane.showMessageDialog(null, "el numero de filas y columnas deben ser iguales");
            
        }else{
            int[][] Matriz = new int [F1][C1];
             for (int a = 0; a < F1; a++){
            for(int b = 0 ; b < C1; b++ ){
            Matriz [a][b]= Integer.parseInt(JOptionPane.showInputDialog(null, "dijite el datos de la parte " + (a+1) +" de la matriz")) ;
            JOptionPane.showMessageDialog(null, Arrays.deepToString(Matriz));
            }
             
            }
             
              }
        
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Asegúrese de ingresar solo números enteros.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error inesperado: " + e.getMessage());
        }
          
    }
    
}