/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SadirCuadro.base;

import java.util.Date;
import java.util.List;

public class Tarea {
    
    // propiedades
    
  private String descripcion;
private String tipo;
private Date fechaInicioEstimado;
private Date fechalnicioReal;
private int duracionEstimada;
private int duracionReal;
private  List <Empleado> listaDeEmpleados;
private  Proyecto proyecto;
private  List<Documento> listaDeDecumentos;  

public Tarea (){
    
}
  public Tarea (String d , String t){
      descripcion = d ;
      tipo = t ;
    
}


}
