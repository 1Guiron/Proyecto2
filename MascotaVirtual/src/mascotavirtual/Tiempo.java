/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotavirtual;

import java.util.Random;
import static mascotavirtual.MascotaVirtuaF.Tiempo;
import static mascotavirtual.MascotaVirtuaF.a;
import static mascotavirtual.MascotaVirtuaF.pasear;

/**
 *
 * @author Colop
 */
public class Tiempo extends Thread {
    private int sleep;
    private MascotaVirtuaF form;
    public Tiempo(int sleep, MascotaVirtuaF form) {
        this.sleep = sleep;
        this.form = form;
    }
    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
           
            form.tiempoJuego(i);
            form.a=i;
            
            if(pasear==true && a==Tiempo+5){
           
            int min = 1;
            int max = 100;
            Random random = new Random();
            int value = random.nextInt(max + min) + min;
            
            if(value<=90){ 
                form.irAPelear();
                pasear=false; 
                form.dispose();
            }
            else{
                 Tiempo=Tiempo+5;
            }
        }
            try{ System.out.println(i);
                Thread.sleep(sleep);
            }catch(InterruptedException e){
                System.out.println("Valio");
            }
        }
    }
}
