package com.mycompany.proyectomatriz;

import java.util.Scanner;

public class ProyectoMatriz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite el numero de filas: ");
        int filas = sc.nextInt();
        System.out.print("Digite el numero de columnas: ");
        int columnas = sc.nextInt();
        
        if (filas != columnas) {
            System.out.println("Error: El numero de filas y columnas debe ser igual. La matriz debe ser cuadrada.");
            return; 
        }


        int[][] matriz1 = new int[filas][columnas];
        int[][] matriz2 = new int[filas][columnas];
        int[][] suma = new int[filas][columnas];
        int[][] resta = new int[filas][columnas];

      
        System.out.println("\nIngrese los elementos de la primera matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz1[i][j] = sc.nextInt();
            }
        }

   
        System.out.println("\nIngrese los elementos de la segunda matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
                resta[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }

       
        System.out.println("\nPrimera Matriz:");
        imprimirMatriz(matriz1);

        System.out.println("\nSegunda Matriz:");
        imprimirMatriz(matriz2);

        System.out.println("\nMatriz Suma:");
        imprimirMatriz(suma);

        System.out.println("\nMatriz Resta:");
        imprimirMatriz(resta);

        sc.close();
    }

   
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print("[" + elemento + "]");
            }
            System.out.println();
        }
    }
}
