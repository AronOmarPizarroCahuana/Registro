
package proyecto;

import static proyecto.agregaralumno.codigos;
import static proyecto.agregaralumno.contenedor;
import static proyecto.student.recibe;
public class gestion {
    
public static boolean gestionalumno(String Codigo){
        boolean existe=false;
        int tamaLista = contenedor.size();
        for (int i=0;i<tamaLista;i++){
            if (codigos.get(i).equals(Codigo)){
                existe=true;
                break;
            }
        }
        return existe;
    
    }

public static boolean comprobar(String recibe){
     int pos=0;
  
      int tamaLista = codigos.size();
      estudiante e;
      boolean comprobar=false;
       for (int i=0;i<tamaLista;i++){
           if (codigos.get(i).equals(recibe)){
                pos=i;
                comprobar=true;
                break;
            }
       }
    
    return comprobar;
    
    
}
}
 

    
    

