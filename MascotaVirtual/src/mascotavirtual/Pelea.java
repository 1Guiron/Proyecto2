/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotavirtual;

import java.util.Random;
import javax.swing.JLabel;

/**
 *
 * @author Colop
 */
public class Pelea extends javax.swing.JFrame {

    private JLabel[] imagen;
   
    public Pelea() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 486, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 381, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pelea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pelea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pelea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pelea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pelea().setVisible(true);
            }
        });
    }
     public void CrearLabels (int noLabels){
       imagen = new JLabel[noLabels];
       
       AjustarImagen conectar = new AjustarImagen();
        int min = 1;
        int max =151;
        int e = 0,a=0;
        int[] noImagenes= new int[ noLabels];
        int aux=0;
        int posicionUsada[]= new int[noLabels];
        int posicionImagen[] = new int[noLabels];
        Random random = new Random();
        int nose=noLabels-1;
         String cadena;    
         int x=0,q;
        for (int i = 0; i < noLabels; i++) {
           imagen[i]= new JLabel();
           
           if(i>=noLabels/2){
                imagen[i].setBounds(e*100,180,92,85);
                e++;
           }
           else{
                imagen[i].setBounds(i*100,50,92,85);
           }
           add(imagen[i]);
        } 
         for (int i = 0; i < noLabels/2; i++) {
             noImagenes[i] = random.nextInt(max + min) + min;
         }
         
         posicionUsada[x]=(int)(Math.random()*noLabels);
        for(x=1;x<noLabels;x++){
             posicionUsada[x]=(int)(Math.random()*noLabels);
           
              for (int i = 0; i <x; i++) {
                 if(posicionUsada[x]==posicionUsada[i]){
                     x--;
                 }
            }
        } 
        
        int kr=0;
        int contador=0;
        int pt=0;
         posicionImagen[kr]=(int)(Math.random()*noLabels/2+1);
         
         for ( kr = 1; kr < noLabels; kr++) {
             posicionImagen[kr]=(int)(Math.random()*noLabels/2+1);
              for ( pt = 0; pt <=kr; pt++) {
                 if(posicionImagen[kr]==posicionImagen[pt]){
                    contador++;
                    if(contador>2){
                        kr--;
                        contador=0;
                    }
                 }
            }
         }
        
         for (int i = 0; i <noLabels; i++) {
             conectar.ajustar(imagen[posicionUsada[i]], conectar.Imagen(posicionImagen[i]));
         }
        
     }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}