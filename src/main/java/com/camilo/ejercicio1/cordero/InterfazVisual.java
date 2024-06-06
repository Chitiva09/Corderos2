package com.camilo.ejercicio1.cordero;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */



import java.util.ArrayList;
import java.util.List;

public class InterfazVisual extends javax.swing.JFrame{
   
    List<Cordero> corderos = new ArrayList<>();
    int [] serieArreglo = new int [corderos.length()];
    
    public InterfazVisual() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrameDatos = new javax.swing.JFrame();
        textFieldEdad1 = new javax.swing.JTextField();
        textFieldSexo1 = new javax.swing.JTextField();
        textFieldNumSer1 = new javax.swing.JTextField();
        textFieldPeso1 = new javax.swing.JTextField();
        labelSerie1 = new javax.swing.JLabel();
        labelEdad1 = new javax.swing.JLabel();
        labelSexo1 = new javax.swing.JLabel();
        labePeso1 = new javax.swing.JLabel();
        buttonFin1 = new javax.swing.JButton();
        buttonGua = new javax.swing.JButton();
        labelNumCor1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textFieldNumCor1 = new javax.swing.JTextField();
        jFrameResuL = new javax.swing.JFrame();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldObesas = new javax.swing.JTextField();
        jButtonFina = new javax.swing.JButton();
        jTextTotal = new javax.swing.JTextField();
        textFieldEdad = new javax.swing.JTextField();
        textFieldSexo = new javax.swing.JTextField();
        textFieldNumSer = new javax.swing.JTextField();
        textFieldPeso = new javax.swing.JTextField();
        labelSerie = new javax.swing.JLabel();
        labelEdad = new javax.swing.JLabel();
        labelSexo = new javax.swing.JLabel();
        labePeso = new javax.swing.JLabel();
        buttonFin = new javax.swing.JButton();
        buttonSig = new javax.swing.JButton();
        labelNumCor = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        numCor = new javax.swing.JLabel();

        jFrameDatos.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrameDatos.setBackground(new java.awt.Color(51, 204, 255));

        textFieldEdad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEdad1ActionPerformed(evt);
            }
        });

        textFieldSexo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldSexo1ActionPerformed(evt);
            }
        });

        labelSerie1.setText("NUMERO DE SERIE:");

        labelEdad1.setText("EDAD: ");

        labelSexo1.setText("SEXO:");

        labePeso1.setText("PESO:");

        buttonFin1.setText("FINALIZAR");
        buttonFin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFin1ActionPerformed(evt);
            }
        });

        buttonGua.setText("GUARDAR");
        buttonGua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGuaActionPerformed(evt);
            }
        });

        labelNumCor1.setText("Cordero Numero: ");

        jLabel7.setText("Rango de 1 a 10 años");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setText("Macho (M) Hembra (H)");

        jLabel4.setText("Kg");

        javax.swing.GroupLayout jFrameDatosLayout = new javax.swing.GroupLayout(jFrameDatos.getContentPane());
        jFrameDatos.getContentPane().setLayout(jFrameDatosLayout);
        jFrameDatosLayout.setHorizontalGroup(
            jFrameDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameDatosLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(labelNumCor1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldNumCor1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrameDatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jFrameDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrameDatosLayout.createSequentialGroup()
                        .addGroup(jFrameDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelSerie1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelEdad1)
                            .addComponent(labelSexo1)
                            .addComponent(labePeso1))
                        .addGap(61, 61, 61)
                        .addGroup(jFrameDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textFieldNumSer1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(textFieldEdad1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldSexo1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldPeso1))
                        .addGroup(jFrameDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFrameDatosLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel7))
                            .addGroup(jFrameDatosLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jFrameDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(buttonFin1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrameDatosLayout.createSequentialGroup()
                        .addComponent(buttonGua)
                        .addGap(171, 171, 171))))
        );
        jFrameDatosLayout.setVerticalGroup(
            jFrameDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameDatosLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jFrameDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelNumCor1)
                    .addComponent(textFieldNumCor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jFrameDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldNumSer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSerie1))
                .addGap(30, 30, 30)
                .addGroup(jFrameDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldEdad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEdad1)
                    .addComponent(jLabel7))
                .addGap(30, 30, 30)
                .addGroup(jFrameDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldSexo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSexo1)
                    .addComponent(jLabel3))
                .addGap(30, 30, 30)
                .addGroup(jFrameDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldPeso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labePeso1)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addGroup(jFrameDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonGua, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonFin1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jLabel9.setText("se ingresaron un total de ");

        jLabel10.setText("Las corderas obesas son:");

        jButtonFina.setText("FINALIZAR");
        jButtonFina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrameResuLLayout = new javax.swing.GroupLayout(jFrameResuL.getContentPane());
        jFrameResuL.getContentPane().setLayout(jFrameResuLLayout);
        jFrameResuLLayout.setHorizontalGroup(
            jFrameResuLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrameResuLLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonFina, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jFrameResuLLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jFrameResuLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldObesas)
                    .addGroup(jFrameResuLLayout.createSequentialGroup()
                        .addGroup(jFrameResuLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jTextTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        jFrameResuLLayout.setVerticalGroup(
            jFrameResuLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameResuLLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jFrameResuLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldObesas, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButtonFina, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ventanaDatos");
        setBackground(new java.awt.Color(51, 204, 255));

        textFieldEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEdadActionPerformed(evt);
            }
        });

        textFieldSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldSexoActionPerformed(evt);
            }
        });

        labelSerie.setText("NUMERO DE SERIE:");

        labelEdad.setText("EDAD: ");

        labelSexo.setText("SEXO:");

        labePeso.setText("PESO:");

        buttonFin.setText("FINALIZAR");
        buttonFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFinActionPerformed(evt);
            }
        });

        buttonSig.setText("SIGUIENTE");
        buttonSig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSigActionPerformed(evt);
            }
        });

        labelNumCor.setText("Cordero Numero: ");

        jLabel6.setText("Rango de 1 a 10 años");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Macho (M) Hembra (H)");

        jLabel2.setText("Kg");

        numCor.setText("# ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(labelNumCor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numCor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelSerie, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelEdad)
                            .addComponent(labelSexo)
                            .addComponent(labePeso))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textFieldNumSer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(textFieldEdad, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldSexo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldPeso))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(buttonFin, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buttonSig)
                        .addGap(171, 171, 171))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumCor)
                    .addComponent(jLabel5)
                    .addComponent(numCor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldNumSer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSerie))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEdad)
                    .addComponent(jLabel6))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSexo)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labePeso)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSig, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonFin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldSexoActionPerformed

    private void textFieldEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEdadActionPerformed

    private void buttonFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFinActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_buttonFinActionPerformed

    private void buttonSigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSigActionPerformed
        // TODO add your handling code here:

        Cordero cordero = new Cordero();

        cordero.setEdad(Integer.parseInt(textFieldEdad.getText()));
        cordero.setSexo(textFieldSexo.getText());
        cordero.setPeso(Integer.parseInt(textFieldPeso.getText()));
        cordero.setNumSerie(Integer.parseInt(textFieldNumSer.getText()));

        corderos.add(cordero);
        
        textFieldEdad.setText("");
        textFieldSexo.setText("");
        textFieldPeso.setText("");
        textFieldNumSer.setText("");
        
        int contador=0; 
                
           contador++;
           textFieldNumCor1.setText(String.valueOf(contador));
           
           if((textFieldSexo.getText()=="H")&&(Integer.parseInt(textFieldSexo.getText())>40)){
              serieArreglo.setserieArreglo(Integer.parseInt(textFieldNumSer.getText()));
           }

    }//GEN-LAST:event_buttonSigActionPerformed

    private void textFieldEdad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEdad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEdad1ActionPerformed

    private void textFieldSexo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldSexo1ActionPerformed
        
        if((textFieldSexo1.getText()!= "M")&&( textFieldSexo1.getText()!="H")){
            textFieldSexo1.setText("Ingrese parámetro válido");
            
        }
        
    }//GEN-LAST:event_textFieldSexo1ActionPerformed

    private void buttonFin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonFin1ActionPerformed

    private void buttonGuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGuaActionPerformed

    private void jButtonFinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonFinaActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazVisual().setVisible(true);
            }
        });// estas van?
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonFin;
    private javax.swing.JButton buttonFin1;
    private javax.swing.JButton buttonGua;
    private javax.swing.JButton buttonSig;
    private javax.swing.JButton jButtonFina;
    private javax.swing.JFrame jFrameDatos;
    private javax.swing.JFrame jFrameResuL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextFieldObesas;
    private javax.swing.JTextField jTextTotal;
    private javax.swing.JLabel labePeso;
    private javax.swing.JLabel labePeso1;
    private javax.swing.JLabel labelEdad;
    private javax.swing.JLabel labelEdad1;
    private javax.swing.JLabel labelNumCor;
    private javax.swing.JLabel labelNumCor1;
    private javax.swing.JLabel labelSerie;
    private javax.swing.JLabel labelSerie1;
    private javax.swing.JLabel labelSexo;
    private javax.swing.JLabel labelSexo1;
    private javax.swing.JLabel numCor;
    private javax.swing.JTextField textFieldEdad;
    private javax.swing.JTextField textFieldEdad1;
    private javax.swing.JTextField textFieldNumCor1;
    private javax.swing.JTextField textFieldNumSer;
    private javax.swing.JTextField textFieldNumSer1;
    private javax.swing.JTextField textFieldPeso;
    private javax.swing.JTextField textFieldPeso1;
    private javax.swing.JTextField textFieldSexo;
    private javax.swing.JTextField textFieldSexo1;
    // End of variables declaration//GEN-END:variables
}
