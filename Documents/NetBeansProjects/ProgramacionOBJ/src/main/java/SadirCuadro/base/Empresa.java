
package SadirCuadro.base;

import java.util.List;


public class Empresa {
  
  private String nit;
private String nombre;
private String telefino;
private String email;
private String tipo;
private String web;
private String direccion;
private List<Empleado> listaDeEmpleados;
private List<Proyecto> listaDeProyectos;


//Constructor por defecto no tiene parametros
public Empresa(){
    
}

  public Empresa(String nit, String nombre){
      
      this.nit = nit ;
      this.nombre = nombre ;
  }
}
