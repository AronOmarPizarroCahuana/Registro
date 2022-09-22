/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;


/**
 *
 * @author Aron
 */
public class estudiante {
    private String Nombre;
    private String Codigo;
    private String parcial1;
    private String parcial2;
    private String parcial3;
  
    public int tamaño;
   
    public estudiante(String Nombre, String Codigo,String parcial1,String parcial2, String parcial3) {
      this.Codigo=Codigo;
      this.Nombre=Nombre;
      this.parcial1=parcial1;
      this.parcial2=parcial2;
      this.parcial3=parcial3;

    }

   
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getParcial1() {
        return parcial1;
    }

    public void setParcial1(String parcial1) {
        this.parcial1 = parcial1;
    }

    public String getParcial2() {
        return parcial2;
    }

    public void setParcial2(String parcial2) {
        this.parcial2 = parcial2;
    }

    public String getParcial3() {
        return parcial3;
    }

    public void setParcial3(String parcial3) {
        this.parcial3 = parcial3;
    }

    

    
}

       

       
       
       
    
    

   
