
package mascotavirtual;

import java.util.Random;

/**
 *
 * @author Colop
 */
public class PeleaDatos {
    private int nivel;
    private int nivelEnemigo;
    private int parejas;
    public PeleaDatos(int nivel) {
        this.nivel = nivel;
    }
    public int probabilidadNivelEnemigo(){
        int min = 1;
        int max = 100;
        Random random = new Random();
        int value = random.nextInt(max + min) + min;
	if(value<=34){
           return 1;
        }
        else if(value >34 && value<=67){
           return 2;
        }
        else{
          return 3;
        }
    }
    public int nivelEnemigo(int num){
        if(num==1){
          nivelEnemigo=nivel-1;
        }
        else if(num==2){
          nivelEnemigo=nivel+1;
        }
        else{
          nivelEnemigo=nivel+2;
        }
      return nivelEnemigo;
    }
    public int noParejas(int enemigo){
        switch(enemigo){
            case 0:
                parejas=4;
                break;
            case 1:
                 parejas=6;
                break;
            case 2:
                 parejas=8;
                break;
            case 3:
                 parejas=10;
                break;
            case 4:
                 parejas=12;
                break;
            case 5:
                 parejas=14;
                break;
            case 6:
                 parejas=16;
                break;
            case 7:
                 parejas=20;
                break;
            default:
                break;
        }
        return parejas;
    }
}
