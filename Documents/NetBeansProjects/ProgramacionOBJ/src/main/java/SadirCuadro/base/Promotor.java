
package SadirCuadro.base;

import java.util.List;

public class Promotor extends Empleado {
    
    private List<Proyecto> listaDeProyectos;
    
    //CONSTRUCTORES
    public Promotor (){
        super (); // LLAMA AL CONSTRUCTOR DE Empleado
    }
    public Promotor(String n , String a){
      super(n,a);
    }
}
