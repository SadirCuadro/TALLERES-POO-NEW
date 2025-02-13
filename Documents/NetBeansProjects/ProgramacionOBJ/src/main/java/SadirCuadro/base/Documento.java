
package SadirCuadro.base;

import java.util.List;


public class Documento {
    
 private String codigo;
 private String descripcion;
 private String tipo;
 private Tarea tarea;
 private List<Version> listaDeVersiones;
 
 
//    CONSTRUCTORES
   public Documento (){
   
   }
   
   //CONSTRUCTOR CON PARAMETROS
    public Documento (String codigo , String desc){
        
        this.codigo = codigo ;
        this.descripcion = desc;
   
   }

}
