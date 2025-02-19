import java.lang.reflect.Array;
import java.util.Arrays;
import javax.swing.JOptionPane;
public class Practico2 {
    

    public static void main(String[] args) {
        int FI = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de filas de la matriz:"));
        int CO = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de columnas de la matriz:"));

        if (FI != CO) {
            JOptionPane.showMessageDialog(null, "El número de filas y columnas deben ser iguales.");
        } else {
            int[][] calculo = new int[FI][CO];

            for (int F1 = 0; F1 < FI; F1++) {
                for (int C1 = 0; C1 < CO; C1++) {
                    calculo[F1][C1] = Integer.parseInt(JOptionPane.showInputDialog("Digite los números a guardar en la posición "
                            + "[" + F1 + "][" + C1 + "]:"));
                }
            }

            StringBuilder matrizString = new StringBuilder("La matriz es:\n");
            for (int a = 0; a < FI; a++) {
                for (int b = 0; b < CO; b++) {
                    JOptionPane.showMessageDialog(null, Arrays.deepToString(calculo));
                }
                matrizString.append("\n"); 
            }

            
        }
        
    }
}


