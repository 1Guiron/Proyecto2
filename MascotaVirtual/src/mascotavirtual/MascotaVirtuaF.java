
package mascotavirtual;

import java.util.Random;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.DocumentEvent;
import javax.swing.JTextField;


/**
 *
 * @author Colop
 */
public class MascotaVirtuaF extends javax.swing.JFrame {
   private JLabel label1;
   static boolean pasear=false;
   static int Tiempo=0;
   static int a=0;
   int no ;
   int contadorComprarComida=0;
   int contadorComprarCura=0;
    public MascotaVirtuaF() {
        initComponents();
        AjustarImagen ir = new AjustarImagen();
        ir.ajustar(LabelImagen,ir.Imagen(1));
        desactivarPokemon();
        Numeros.setEnabled(false);
        BtnPasear.setEnabled(false);
        BtnLimpiar.setEnabled(false);
        listaDesplegable1();
    }
    String[] Numero = new String[10];
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnFarmacia = new javax.swing.JButton();
        BtnPokemons = new javax.swing.JButton();
        TxtMonedas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        BtnPasear = new javax.swing.JButton();
        LabelApodo = new javax.swing.JLabel();
        LabelPeticionComida = new javax.swing.JLabel();
        LabelPeticionDefecar = new javax.swing.JLabel();
        LabelPeticionPasear = new javax.swing.JLabel();
        LabelNivel = new javax.swing.JLabel();
        jTxtApodo1 = new javax.swing.JTextField();
        jTxtNivel = new javax.swing.JTextField();
        jTxtPeticionDefecar = new javax.swing.JTextField();
        jTxtPeticionComida1 = new javax.swing.JTextField();
        jTxtPeticionPasear = new javax.swing.JTextField();
        LabelEstadoPokemon = new javax.swing.JLabel();
        BtnLimpiar = new javax.swing.JButton();
        LabelImagen = new javax.swing.JLabel();
        JSpinerNo = new javax.swing.JSpinner();
        BtnComprar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        TxtApodo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TxtTiempo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Numeros = new javax.swing.JComboBox<>();
        Comidas = new javax.swing.JComboBox<>();
        Numeros2 = new javax.swing.JComboBox<>();
        ComprarComida = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        ComprarCura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 498));

        BtnFarmacia.setText("Farmacia");
        BtnFarmacia.setName("BtnFarmacia"); // NOI18N
        BtnFarmacia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFarmaciaActionPerformed(evt);
            }
        });

        BtnPokemons.setText("Pokemons");
        BtnPokemons.setName("BtnPokemon"); // NOI18N
        BtnPokemons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPokemonsActionPerformed(evt);
            }
        });

        TxtMonedas.setEditable(false);
        TxtMonedas.setText("50");
        TxtMonedas.setToolTipText("");
        TxtMonedas.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TxtMonedas.setName("TxtMonedas"); // NOI18N
        TxtMonedas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtMonedasActionPerformed(evt);
            }
        });

        jLabel1.setText("Monedas");

        BtnPasear.setText("Pasear");
        BtnPasear.setName("BtnPasear"); // NOI18N
        BtnPasear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPasearActionPerformed(evt);
            }
        });

        LabelApodo.setText("Apodo");

        LabelPeticionComida.setText("Petición Comida");

        LabelPeticionDefecar.setText("Petición Defecar");

        LabelPeticionPasear.setText("Petición Pasear");

        LabelNivel.setText("Nivel");

        jTxtApodo1.setEditable(false);

        jTxtNivel.setEditable(false);

        jTxtPeticionDefecar.setEditable(false);
        jTxtPeticionDefecar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtPeticionDefecarActionPerformed(evt);
            }
        });

        jTxtPeticionComida1.setEditable(false);

        jTxtPeticionPasear.setEditable(false);

        LabelEstadoPokemon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.setName("BtnPasear"); // NOI18N
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelPeticionComida)
                    .addComponent(LabelPeticionPasear)
                    .addComponent(jTxtPeticionPasear, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtPeticionComida1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelPeticionDefecar)
                    .addComponent(jTxtPeticionDefecar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelEstadoPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtApodo1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnPasear)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(LabelNivel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxtNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LabelApodo)
                    .addComponent(BtnLimpiar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(LabelEstadoPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNivel)
                    .addComponent(jTxtNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelApodo)
                .addGap(2, 2, 2)
                .addComponent(jTxtApodo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelPeticionComida)
                .addGap(1, 1, 1)
                .addComponent(jTxtPeticionComida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelPeticionDefecar)
                .addGap(1, 1, 1)
                .addComponent(jTxtPeticionDefecar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelPeticionPasear)
                .addGap(1, 1, 1)
                .addComponent(jTxtPeticionPasear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnPasear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnLimpiar)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        LabelImagen.setToolTipText("");
        LabelImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        JSpinerNo.setModel(new javax.swing.SpinnerNumberModel(1, 1, 151, 1));
        JSpinerNo.setName("SpinnerPokemon"); // NOI18N
        JSpinerNo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                JSpinerNoStateChanged(evt);
            }
        });

        BtnComprar.setText("Comprar");
        BtnComprar.setName("BtnComprar"); // NOI18N
        BtnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnComprarActionPerformed(evt);
            }
        });

        jLabel3.setText("No.");

        TxtApodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtApodoActionPerformed(evt);
            }
        });

        jLabel5.setText("Asignar Apodo");

        TxtTiempo.setEditable(false);
        TxtTiempo.setText("0");
        TxtTiempo.setToolTipText("");
        TxtTiempo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TxtTiempo.setName("TxtMonedas"); // NOI18N
        TxtTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTiempoActionPerformed(evt);
            }
        });
        TxtTiempo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                TxtTiempoPropertyChange(evt);
            }
        });

        jLabel4.setText("Tiempo");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Estado del Pokemon");

        Numeros.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                NumerosItemStateChanged(evt);
            }
        });
        Numeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumerosActionPerformed(evt);
            }
        });

        Comidas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComidasItemStateChanged(evt);
            }
        });
        Comidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComidasActionPerformed(evt);
            }
        });

        Numeros2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Numeros2ItemStateChanged(evt);
            }
        });
        Numeros2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numeros2ActionPerformed(evt);
            }
        });

        ComprarComida.setText("Comprar");
        ComprarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarComidaActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Restaurante");

        ComprarCura.setText("Comprar");
        ComprarCura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarCuraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(Numeros, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JSpinerNo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BtnPokemons, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtApodo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(BtnComprar))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(42, 42, 42)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(41, 41, 41))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Comidas, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(ComprarComida)
                                .addGap(42, 42, 42)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(ComprarCura))
                            .addComponent(BtnFarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Numeros2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtMonedas, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(TxtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(Numeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BtnPokemons)
                                    .addComponent(BtnFarmacia)))
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Comidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Numeros2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtApodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ComprarComida)
                                .addComponent(ComprarCura)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JSpinerNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnComprar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(TxtMonedas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtMonedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtMonedasActionPerformed
     
    }//GEN-LAST:event_TxtMonedasActionPerformed
    
    private void BtnPokemonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPokemonsActionPerformed
      activarPokemon();
    }//GEN-LAST:event_BtnPokemonsActionPerformed
    public void tiempoJuego(int a){
        TxtTiempo.setText(String.valueOf(a));
         this.repaint();
    }
    public void desactivarPokemon(){
     JSpinerNo.setEnabled(false);
     LabelImagen.setEnabled(false);
     TxtApodo.setEnabled(false);
     BtnComprar.setEnabled(false);
     ComprarComida.setEnabled(false);
     Comidas.setEnabled(false);
    }
    public void activarPokemon(){
     JSpinerNo.setEnabled(true);
     LabelImagen.setEnabled(true);
     TxtApodo.setEnabled(true);
     BtnComprar.setEnabled(true);
     ComprarComida.setEnabled(true);
    }
    private void BtnFarmaciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFarmaciaActionPerformed
       
    }//GEN-LAST:event_BtnFarmaciaActionPerformed

    private void JSpinerNoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_JSpinerNoStateChanged
        AjustarImagen ir = new AjustarImagen();
        int noPokemon = Integer.parseInt(JSpinerNo.getValue().toString());
        ir.ajustar(LabelImagen,ir.Imagen(noPokemon));
        this.repaint();
    }//GEN-LAST:event_JSpinerNoStateChanged

    private void BtnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnComprarActionPerformed
        BaseMascotas go  = new BaseMascotas();
        Numeros.setEnabled(true);
        BtnPasear.setEnabled(true);
        BtnLimpiar.setEnabled(true);
        ComprarComida.setEnabled(true);
        Comidas.setEnabled(true);
        int respuesta=2;
        int noPokemon = Integer.parseInt(JSpinerNo.getValue().toString());
        
        String apodoPokemon = TxtApodo.getText();
        
        if( TxtApodo.getText()==null){
            apodoPokemon="Sin Apodo";
        }
        respuesta = go.TeamMascotas(noPokemon, apodoPokemon, 1);
        if(respuesta==1){
            JOptionPane.showMessageDialog(  this,
                "Mascota Comprada",
                "Tienda de Mascotas",
                JOptionPane.INFORMATION_MESSAGE );
        }
    
        listaDesplegable( go.misMascotas);
        desactivarPokemon();
        
    }//GEN-LAST:event_BtnComprarActionPerformed

    private void TxtApodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtApodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtApodoActionPerformed

    private void TxtTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTiempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTiempoActionPerformed

    private void jTxtPeticionDefecarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtPeticionDefecarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtPeticionDefecarActionPerformed

    private void NumerosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_NumerosItemStateChanged
     
       BaseMascotas conectar = new  BaseMascotas();
       AjustarImagen conectar2 = new AjustarImagen();
       if( Numeros.getSelectedItem()!=null){
           no = Integer.valueOf(Numeros.getSelectedItem().toString());
          for(Mascotas ir: conectar.misMascotas){
            if(ir!=null){
             if(no==ir.obtenerNo() ){
              jTxtApodo1.setText(ir.obtenerApodo());
              jTxtNivel.setText(String.valueOf( ir.obtenerNivel()) );
              conectar2.ajustar(LabelEstadoPokemon, conectar2.Imagen(no));
             }
           }
          }
       }
    }//GEN-LAST:event_NumerosItemStateChanged
   
    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
     
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BtnPasearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPasearActionPerformed
        
        
       if(pasear==true){
           pasear=false;
           BtnPasear.setText("Pasear");
           desactivarPokemon();
          
       }
       else{ 
           pasear=true; 
           BtnPasear.setText("Dejar de Pasear");
           activarPokemon();
           Tiempo=a;
           
       }
      
    }//GEN-LAST:event_BtnPasearActionPerformed

    private void TxtTiempoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_TxtTiempoPropertyChange
   
    }//GEN-LAST:event_TxtTiempoPropertyChange

    private void NumerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumerosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumerosActionPerformed
    public void listaDesplegable1(){
      Comida conectar = new Comida();
     
          for(String ir: conectar.nombreComida){
            if(ir!=null){
            Comidas.addItem(ir);
            this.repaint();
           }
          }
       
    }   
    private void ComidasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComidasItemStateChanged
         
    }//GEN-LAST:event_ComidasItemStateChanged

    private void ComidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComidasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComidasActionPerformed

    private void Numeros2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Numeros2ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_Numeros2ItemStateChanged

    private void Numeros2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numeros2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Numeros2ActionPerformed

    private void ComprarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarComidaActionPerformed
     contadorComprarComida++;
     if(contadorComprarComida==2){
         
     }
    }//GEN-LAST:event_ComprarComidaActionPerformed

    private void ComprarCuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarCuraActionPerformed
     contadorComprarCura++;
    }//GEN-LAST:event_ComprarCuraActionPerformed
    public void irAPelear(){
        int nivel;
        nivel=Integer.valueOf(jTxtNivel.getText());
        PeleaDatos conectar = new PeleaDatos(nivel);
        Pelea ir = new Pelea();
        ir.CrearLabels( conectar.noParejas(conectar.nivelEnemigo(conectar.probabilidadNivelEnemigo())));
        ir.setVisible(true);
        
    }
   
    public void listaDesplegable(Mascotas[] misMascotas){
      String[] aux;
      Numeros.removeAllItems();
    
      int x=0;
      for(Mascotas ir: misMascotas){
            if(ir!=null){
              Numero[x]=String.valueOf(ir.obtenerNo()) ;
              x++;
            }
        }
      aux=Numero;
      for(int i=0;i<x;i++){
          Numeros.addItem(aux[i]);
      }
     
    }
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
            java.util.logging.Logger.getLogger(MascotaVirtuaF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MascotaVirtuaF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MascotaVirtuaF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MascotaVirtuaF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MascotaVirtuaF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnComprar;
    private javax.swing.JButton BtnFarmacia;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton BtnPasear;
    private javax.swing.JButton BtnPokemons;
    private javax.swing.JComboBox<String> Comidas;
    private javax.swing.JButton ComprarComida;
    private javax.swing.JButton ComprarCura;
    private javax.swing.JSpinner JSpinerNo;
    private javax.swing.JLabel LabelApodo;
    private javax.swing.JLabel LabelEstadoPokemon;
    private javax.swing.JLabel LabelImagen;
    private javax.swing.JLabel LabelNivel;
    private javax.swing.JLabel LabelPeticionComida;
    private javax.swing.JLabel LabelPeticionDefecar;
    private javax.swing.JLabel LabelPeticionPasear;
    private javax.swing.JComboBox<String> Numeros;
    private javax.swing.JComboBox<String> Numeros2;
    private javax.swing.JTextField TxtApodo;
    private javax.swing.JTextField TxtMonedas;
    private javax.swing.JTextField TxtTiempo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTxtApodo1;
    private javax.swing.JTextField jTxtNivel;
    private javax.swing.JTextField jTxtPeticionComida1;
    private javax.swing.JTextField jTxtPeticionDefecar;
    private javax.swing.JTextField jTxtPeticionPasear;
    // End of variables declaration//GEN-END:variables
}
