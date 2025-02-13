
package SadirCuadro.base;

import java.io.File;

import java.util.Date;


public class Version {
    
    //propiedades
    
  private Date fecha;
  private String descripcion;
  private File archivo;
  private Documento documento;
  
  public Version (){
      
  }
   public Version (Date fecha , String d ){
       this.fecha = fecha ;
       descripcion  = d ;
      
  }
  
  
}

