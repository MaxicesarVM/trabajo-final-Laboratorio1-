/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import persistencia.MasajistaData;
import modelo.Masajista;
import persistencia.Conexion;
/**
 *
 * @author Asus X515EA
 */
public class ContratoMasajista extends javax.swing.JInternalFrame {

    /**
     * Creates new form ContratoMasajista
     */
    public ContratoMasajista() {
        initComponents();
    }

      Conexion con = new Conexion();
      MasajistaData operacionesMasajista = new MasajistaData(con);
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        lbl_matricula = new javax.swing.JLabel();
        lbl_nombreCompleto = new javax.swing.JLabel();
        lbl_telefono = new javax.swing.JLabel();
        lbl_especialidad = new javax.swing.JLabel();
        lbl_activo = new javax.swing.JLabel();
        txt_matricula = new javax.swing.JTextField();
        txt_nombreCompleto = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_especialidad = new javax.swing.JTextField();
        btn_buscarMasajista = new javax.swing.JButton();
        btn_guardarMasajista = new javax.swing.JButton();
        btn_borrarMasajista = new javax.swing.JButton();
        btn_actualizarMasajista = new javax.swing.JButton();
        btn_limpiarMasajista = new javax.swing.JButton();
        btn_bajaLogicaMasajista = new javax.swing.JButton();
        btn_altaLogicaMasajista = new javax.swing.JButton();
        check_ActivoMas = new javax.swing.JCheckBox();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        lbl_titulo.setBackground(new java.awt.Color(0, 204, 204));
        lbl_titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_titulo.setText("  Contratación de masajista");
        lbl_titulo.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 102, 102)));

        lbl_matricula.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_matricula.setText("Matricula:");

        lbl_nombreCompleto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_nombreCompleto.setText("Nombre completo:");

        lbl_telefono.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_telefono.setText("Teléfono:");

        lbl_especialidad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_especialidad.setText("Especialidad:");

        lbl_activo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_activo.setText("Activo");

        btn_buscarMasajista.setBackground(new java.awt.Color(0, 102, 102));
        btn_buscarMasajista.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        btn_buscarMasajista.setText("Buscar");
        btn_buscarMasajista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarMasajistaActionPerformed(evt);
            }
        });

        btn_guardarMasajista.setBackground(new java.awt.Color(0, 102, 102));
        btn_guardarMasajista.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        btn_guardarMasajista.setText("Guardar");
        btn_guardarMasajista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarMasajistaActionPerformed(evt);
            }
        });

        btn_borrarMasajista.setBackground(new java.awt.Color(0, 102, 102));
        btn_borrarMasajista.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        btn_borrarMasajista.setText("Borrar");
        btn_borrarMasajista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarMasajistaActionPerformed(evt);
            }
        });

        btn_actualizarMasajista.setBackground(new java.awt.Color(0, 102, 102));
        btn_actualizarMasajista.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        btn_actualizarMasajista.setText("Actualizar");
        btn_actualizarMasajista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarMasajistaActionPerformed(evt);
            }
        });

        btn_limpiarMasajista.setBackground(new java.awt.Color(0, 102, 102));
        btn_limpiarMasajista.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        btn_limpiarMasajista.setText("Limpiar");
        btn_limpiarMasajista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarMasajistaActionPerformed(evt);
            }
        });

        btn_bajaLogicaMasajista.setBackground(new java.awt.Color(0, 102, 102));
        btn_bajaLogicaMasajista.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        btn_bajaLogicaMasajista.setText("Baja Lógica");
        btn_bajaLogicaMasajista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bajaLogicaMasajistaActionPerformed(evt);
            }
        });

        btn_altaLogicaMasajista.setBackground(new java.awt.Color(0, 102, 102));
        btn_altaLogicaMasajista.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        btn_altaLogicaMasajista.setText("Alta Lógica");
        btn_altaLogicaMasajista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_altaLogicaMasajistaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_activo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(check_ActivoMas))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_nombreCompleto)
                                .addGap(18, 18, 18)
                                .addComponent(txt_nombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_matricula)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(btn_buscarMasajista))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_telefono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_especialidad)
                                    .addComponent(btn_guardarMasajista))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_especialidad)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_borrarMasajista)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(52, 52, 52)
                                                .addComponent(btn_altaLogicaMasajista)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(btn_actualizarMasajista)
                                                .addGap(26, 26, 26)
                                                .addComponent(btn_limpiarMasajista))))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(btn_bajaLogicaMasajista)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lbl_titulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_matricula)
                    .addComponent(txt_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscarMasajista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombreCompleto)
                    .addComponent(txt_nombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_telefono)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_especialidad)
                    .addComponent(txt_especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_activo)
                    .addComponent(check_ActivoMas))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardarMasajista)
                    .addComponent(btn_borrarMasajista)
                    .addComponent(btn_actualizarMasajista)
                    .addComponent(btn_limpiarMasajista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_bajaLogicaMasajista)
                    .addComponent(btn_altaLogicaMasajista))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarMasajistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarMasajistaActionPerformed
        int seleccion = Integer.parseInt(txt_matricula.getText().trim());
        txt_matricula.setText(String.valueOf(operacionesMasajista.buscarMasajista(seleccion).getMatricula()));
        txt_nombreCompleto.setText(operacionesMasajista.buscarMasajista(seleccion).getNombre_completo());
        txt_telefono.setText(String.valueOf(operacionesMasajista.buscarMasajista(seleccion).getTelefono()));
        txt_especialidad.setText(operacionesMasajista.buscarMasajista(seleccion).getEspecialidad());
        check_ActivoMas.setSelected(operacionesMasajista.buscarMasajista(seleccion).isEstado());
        
       


    }//GEN-LAST:event_btn_buscarMasajistaActionPerformed

    private void btn_guardarMasajistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarMasajistaActionPerformed

        int seleccionMatricula = Integer.parseInt(txt_matricula.getText());
        String seleccionNombreCompleto = txt_nombreCompleto.getText();
        String seleccionTelefono = txt_telefono.getText();
        String seleccionEspecialidad = txt_especialidad.getText();
        boolean seleccionEstado = check_ActivoMas.isSelected();
        
        Masajista masajistaCreado = new Masajista(seleccionMatricula, seleccionNombreCompleto, Long.valueOf(seleccionTelefono), seleccionEspecialidad, seleccionEstado);
        operacionesMasajista.agregarMasajista(masajistaCreado);
        JOptionPane.showMessageDialog(this, "Se agrego el masajista: " + seleccionNombreCompleto + " correctamente");

      
    }//GEN-LAST:event_btn_guardarMasajistaActionPerformed

    private void btn_borrarMasajistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarMasajistaActionPerformed
         int seleccionMatricula = Integer.parseInt(txt_matricula.getText());
        
        operacionesMasajista.eliminarMasajista(seleccionMatricula);
        JOptionPane.showMessageDialog(this, "Se elimino el masajista correctamente");



    }//GEN-LAST:event_btn_borrarMasajistaActionPerformed

    private void btn_actualizarMasajistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarMasajistaActionPerformed
        
        int seleccionMatricula = Integer.parseInt(txt_matricula.getText());
        String seleccionNombreCompleto = txt_nombreCompleto.getText();
        String seleccionTelefono = txt_telefono.getText();
        String seleccionEspecialidad = txt_especialidad.getText();
        boolean seleccionEstado = check_ActivoMas.isSelected();
        
        Masajista masajistaActualizado = new Masajista(seleccionMatricula,seleccionNombreCompleto, Long.valueOf(seleccionTelefono), seleccionEspecialidad, seleccionEstado);
        operacionesMasajista.actualizarMasajista(masajistaActualizado);
        JOptionPane.showMessageDialog(this, "Se actualizó el masajista correctamente");
        

    
    }//GEN-LAST:event_btn_actualizarMasajistaActionPerformed

    private void btn_limpiarMasajistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarMasajistaActionPerformed

         txt_matricula.setText("");
        txt_nombreCompleto.setText("");
        txt_telefono.setText("");
        txt_especialidad.setText("");
        check_ActivoMas.setSelected(false);

       
    }//GEN-LAST:event_btn_limpiarMasajistaActionPerformed

    private void btn_bajaLogicaMasajistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bajaLogicaMasajistaActionPerformed

        int seleccionMatricula = Integer.parseInt(txt_matricula.getText());
         String seleccionNombreCompleto = txt_nombreCompleto.getText();
        String seleccionTelefono = txt_telefono.getText();
        String seleccionEspecialidad = txt_especialidad.getText();
        boolean seleccionEstado = check_ActivoMas.isSelected();
        
        Masajista masajistaBaja = new Masajista(seleccionMatricula,seleccionNombreCompleto, Long.valueOf(seleccionTelefono), seleccionEspecialidad, seleccionEstado);
        operacionesMasajista.bajaLogica(masajistaBaja);
        JOptionPane.showMessageDialog(this, "Se dio de baja al masajista correctamente");

       
    }//GEN-LAST:event_btn_bajaLogicaMasajistaActionPerformed

    private void btn_altaLogicaMasajistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_altaLogicaMasajistaActionPerformed

        int seleccionMatricula = Integer.parseInt(txt_matricula.getText());
        String seleccionNombreCompleto = txt_nombreCompleto.getText();
        String seleccionTelefono = txt_telefono.getText();
        String seleccionEspecialidad = txt_especialidad.getText();
        boolean seleccionEstado = check_ActivoMas.isSelected();
        
        Masajista masajistaAlta = new Masajista(seleccionMatricula,seleccionNombreCompleto, Long.valueOf(seleccionTelefono), seleccionEspecialidad, seleccionEstado);
        operacionesMasajista.altaLogica(masajistaAlta);
        JOptionPane.showMessageDialog(this, "Se dio de alta al masajista correctamente");



       
    }//GEN-LAST:event_btn_altaLogicaMasajistaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizarMasajista;
    private javax.swing.JButton btn_altaLogicaMasajista;
    private javax.swing.JButton btn_bajaLogicaMasajista;
    private javax.swing.JButton btn_borrarMasajista;
    private javax.swing.JButton btn_buscarMasajista;
    private javax.swing.JButton btn_guardarMasajista;
    private javax.swing.JButton btn_limpiarMasajista;
    private javax.swing.JCheckBox check_ActivoMas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_activo;
    private javax.swing.JLabel lbl_especialidad;
    private javax.swing.JLabel lbl_matricula;
    private javax.swing.JLabel lbl_nombreCompleto;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JTextField txt_especialidad;
    private javax.swing.JTextField txt_matricula;
    private javax.swing.JTextField txt_nombreCompleto;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
