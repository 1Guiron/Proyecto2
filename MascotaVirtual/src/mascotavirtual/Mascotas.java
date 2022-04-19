/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotavirtual;

/**
 *
 * @author Colop
 */
public class Mascotas {
    private int no;
    private String apodo;
    private int nivel;
    
    public Mascotas(int no, String apodo, int nivel){
       this.no=no;
       this.apodo=apodo;
       this.nivel=nivel;
    }
    @Override
    public String toString(){
      return String.format(
         "No. Mascota: %s, Apodo: %s, Nivel: %s",
          no,
          apodo,
          nivel);
    }
    public int obtenerNo(){
        return no;
    }
     public String obtenerApodo(){
        return apodo;
    }
      public int obtenerNivel(){
        return nivel;
    }
    
}
