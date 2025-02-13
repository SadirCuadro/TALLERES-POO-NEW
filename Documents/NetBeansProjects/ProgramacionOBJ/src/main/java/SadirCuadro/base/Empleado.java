
package SadirCuadro.base;

import java.util.Date;
import java.util.List;

public class Empleado {
    
    // propiedades
protected String dni;
protected String nombre;
protected String apellidos;
protected String dirección;
protected String teléfono;
protected String email;
protected Date fechaContrato;
protected Empresa empresa ;
protected  List<Proyecto> listaDeProyectos;
protected List<Tarea> listaDeTareas;

// CONSTRUCTOR POR DEFECTO 
  public Empleado (){
      
  }
  
  // CONSTRUCTOR CON PARAMETROS
   public Empleado (String nombre , String apellido){
       this.nombre = nombre ;
       this.apellidos = apellido;
      
  }
  
}
