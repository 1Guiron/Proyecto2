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
public class MascotaVirtual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MascotaVirtuaF juego = new  MascotaVirtuaF();
        juego.setVisible(true);
        Tiempo conectar = new Tiempo(1000,juego);
        conectar.run();
    }
    
}
