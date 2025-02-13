
package SadirCuadro.base;

import java.util.Date;


public class ManoDeObra {
    
    //propiedades
 private  Empleado trabajador;
 private Proyecto proyecto;
 private  Date FechaInicio;
 private  Date FechaFin;
 private String rol;
 
 //CONSTRUCTOR POR DEFECTO
 public ManoDeObra(){
 
 }
 //CONSTRUCTOR CON PARAMETROS
 public ManoDeObra(Empleado e , Proyecto p){
     trabajador = e ;
     proyecto = p ;
     
 
 }
 
 
}
