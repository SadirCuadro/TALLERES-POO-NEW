
package Taller_01_Ejercicio_02;


import javax.swing.JOptionPane;
public class CuentaBancaria {
    String numeroCuenta;
    int saldo;
    String tipoCuenta;

   
    public CuentaBancaria() {
     
    }

    // Constructor con dos parámetros
    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
        this.tipoCuenta = tipoCuenta;
    }

    // Constructor sobrecargado con tres parámetros
    public CuentaBancaria(String numeroCuenta, int saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    // Método para mostrar detalles de la cuenta usando JOptionPane
    public void Detalles() {
String mensaje = "Cuenta Bancaria\n" + "Numero de Cuenta: " + numeroCuenta + "\n" + "Saldo: $" + saldo + "\n" + "Tipo de Cuenta: " + tipoCuenta;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}

