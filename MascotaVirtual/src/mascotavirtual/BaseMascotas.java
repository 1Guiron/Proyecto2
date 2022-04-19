
package mascotavirtual;

import javax.swing.ImageIcon;

/**
 *
 * @author Colop
 */
public class BaseMascotas {
   static Mascotas[] misMascotas = new Mascotas[10];
   static Peticion[] peticionMascotas=new Peticion[10];
    public int TeamMascotas(int no,String apodo, int nivel){
        int x=0;
        for(Mascotas ir: misMascotas){
            if(ir!=null){
                x++;
            }
        }
        if(x==10){
            return 0;
        }
        else{
            misMascotas[x]=new Mascotas(no,apodo,nivel);
            return 1;
        }
    }
    public void peticionesTeamMascotas(int peticionComida,int peticionPaseo, int peticionLimpieza){
        int x=0;
        for(Peticion ir: peticionMascotas){
            if(ir!=null){
                x++;
            }
        }
        if(x==10){
           
        }
        else{
            peticionMascotas[x]=new Peticion(peticionComida,peticionPaseo,peticionLimpieza);
          
        }
    }
    public Mascotas mascotas(int b){
        Mascotas[] misMascotas = new Mascotas[151];
        for(int x=0;x<151;x++){
             misMascotas[x]= new Mascotas((x+1),"sin apodo",1);
        }
        return misMascotas[b];
    }

   
}
