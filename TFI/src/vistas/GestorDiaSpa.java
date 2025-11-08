/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.DiaDeSpa;
import persistencia.ClienteData;
import persistencia.Conexion;
import persistencia.DiaDeSpaData;

/**
 *
 * @author Rickert
 */
public class GestorDiaSpa extends javax.swing.JInternalFrame {

    
    Conexion con = new Conexion();
    
    DiaDeSpaData operacionesDiaSpa = new DiaDeSpaData(con);
    ClienteData operacionesClientes = new ClienteData(con);
    
    ArrayList<Cliente> listac = (ArrayList<Cliente>) operacionesClientes.listarClientes();
    
    
    public GestorDiaSpa() {
        initComponents();
        cargarClientes();
     
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_gestorDiaSpa = new javax.swing.JPanel();
        lbl_codPack = new javax.swing.JLabel();
        txt_codPack = new javax.swing.JTextField();
        lbl_titulo = new javax.swing.JLabel();
        lbl_fecha = new javax.swing.JLabel();
        dt_fecha = new com.toedter.calendar.JDateChooser();
        lbl_preferencias = new javax.swing.JLabel();
        lbl_codigoCliente = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn_reservarDia = new javax.swing.JButton();
        btn_borrarDia = new javax.swing.JButton();
        jcb_codCliente = new javax.swing.JComboBox<>();
        btn_buscarCod = new javax.swing.JButton();
        txt_preferencias = new javax.swing.JTextField();
        lbl_codigoCliente1 = new javax.swing.JLabel();
        btn_limpiarCampos = new javax.swing.JButton();

        setClosable(true);

        pnl_gestorDiaSpa.setBackground(new java.awt.Color(0, 153, 153));

        lbl_codPack.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_codPack.setText("Codigo Pack:");

        lbl_titulo.setBackground(new java.awt.Color(0, 204, 204));
        lbl_titulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_titulo.setText("Gestor Dia de Spa");
        lbl_titulo.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 102, 102)));

        lbl_fecha.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_fecha.setText("Fecha:");

        lbl_preferencias.setBackground(new java.awt.Color(0, 153, 153));
        lbl_preferencias.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_preferencias.setText("Preferencias:");

        lbl_codigoCliente.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_codigoCliente.setText("Codigo Cliente:");

        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        btn_reservarDia.setBackground(new java.awt.Color(0, 102, 102));
        btn_reservarDia.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        btn_reservarDia.setText("Reservar Dia de Spa");
        btn_reservarDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reservarDiaActionPerformed(evt);
            }
        });

        btn_borrarDia.setBackground(new java.awt.Color(0, 102, 102));
        btn_borrarDia.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        btn_borrarDia.setText("Borrar Dia de Spa");
        btn_borrarDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarDiaActionPerformed(evt);
            }
        });

        jcb_codCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_codClienteActionPerformed(evt);
            }
        });

        btn_buscarCod.setBackground(new java.awt.Color(0, 102, 102));
        btn_buscarCod.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        btn_buscarCod.setText("Buscar Codigo Pack");
        btn_buscarCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarCodActionPerformed(evt);
            }
        });

        txt_preferencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_preferenciasActionPerformed(evt);
            }
        });

        lbl_codigoCliente1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_codigoCliente1.setText("Nombre:");

        btn_limpiarCampos.setBackground(new java.awt.Color(0, 102, 102));
        btn_limpiarCampos.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        btn_limpiarCampos.setText("Limpiar Campos");
        btn_limpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarCamposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_gestorDiaSpaLayout = new javax.swing.GroupLayout(pnl_gestorDiaSpa);
        pnl_gestorDiaSpa.setLayout(pnl_gestorDiaSpaLayout);
        pnl_gestorDiaSpaLayout.setHorizontalGroup(
            pnl_gestorDiaSpaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_gestorDiaSpaLayout.createSequentialGroup()
                .addGroup(pnl_gestorDiaSpaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_gestorDiaSpaLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(lbl_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_buscarCod, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_gestorDiaSpaLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(pnl_gestorDiaSpaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_gestorDiaSpaLayout.createSequentialGroup()
                                .addGroup(pnl_gestorDiaSpaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_codigoCliente)
                                    .addGroup(pnl_gestorDiaSpaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl_preferencias)
                                        .addComponent(lbl_codPack, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnl_gestorDiaSpaLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_codigoCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)))
                                .addGap(18, 18, 18)
                                .addGroup(pnl_gestorDiaSpaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_gestorDiaSpaLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btn_reservarDia, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnl_gestorDiaSpaLayout.createSequentialGroup()
                                        .addGroup(pnl_gestorDiaSpaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnl_gestorDiaSpaLayout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(txt_codPack, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(pnl_gestorDiaSpaLayout.createSequentialGroup()
                                        .addComponent(dt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 301, Short.MAX_VALUE)
                                        .addComponent(btn_borrarDia, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnl_gestorDiaSpaLayout.createSequentialGroup()
                                        .addComponent(jcb_codCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_limpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(pnl_gestorDiaSpaLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(173, 173, 173))
            .addGroup(pnl_gestorDiaSpaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_gestorDiaSpaLayout.createSequentialGroup()
                    .addGap(220, 220, 220)
                    .addComponent(txt_preferencias, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(632, Short.MAX_VALUE)))
        );
        pnl_gestorDiaSpaLayout.setVerticalGroup(
            pnl_gestorDiaSpaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_gestorDiaSpaLayout.createSequentialGroup()
                .addGroup(pnl_gestorDiaSpaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_gestorDiaSpaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_titulo)
                        .addGap(25, 25, 25)
                        .addGroup(pnl_gestorDiaSpaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_codPack, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_codPack, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(lbl_preferencias, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addGroup(pnl_gestorDiaSpaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_gestorDiaSpaLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(btn_buscarCod, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btn_reservarDia, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_borrarDia, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addGroup(pnl_gestorDiaSpaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codigoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcb_codCliente)
                    .addComponent(btn_limpiarCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnl_gestorDiaSpaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_gestorDiaSpaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                    .addGroup(pnl_gestorDiaSpaLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(pnl_gestorDiaSpaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_codigoCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_nombre))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pnl_gestorDiaSpaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_gestorDiaSpaLayout.createSequentialGroup()
                    .addGap(187, 187, 187)
                    .addComponent(txt_preferencias, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(434, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_gestorDiaSpa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_gestorDiaSpa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarClientes(){
        
        for(Cliente cliente: listac){
            
                
                jcb_codCliente.addItem(cliente);
                
            
        }
        
        
        
    }
    
    
    private void btn_buscarCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarCodActionPerformed
        
        int seleccion = Integer.parseInt(txt_codPack.getText());
        
        DiaDeSpa diaEncontrado = operacionesDiaSpa.buscarDia(seleccion);
        
        txt_codPack.setText(String.valueOf(operacionesDiaSpa.buscarDia(seleccion).getCodPack()));
        txt_preferencias.setText(operacionesDiaSpa.buscarDia(seleccion).getPreferencias());
        
        LocalDate fechaDia = operacionesDiaSpa.buscarDia(seleccion).getFecha();
        
        // esto para casteo
        java.util.Date fechaCasteada = java.util.Date.from(fechaDia.atStartOfDay(java.time.ZoneId.systemDefault()).toInstant());
        
        dt_fecha.setDate(fechaCasteada);
        
        //
        
        int codClienteBuscar = diaEncontrado.getCliente().getCodCli();
        
        Cliente clienteParaSeleccionar = null;
        
        for (int i = 0; i < jcb_codCliente.getItemCount(); i++) {
            Cliente itemCliente = jcb_codCliente.getItemAt(i);
            
            if (itemCliente.getCodCli() == codClienteBuscar) {
                clienteParaSeleccionar = itemCliente;
                break; 
            }
        }
        
        jcb_codCliente.setSelectedItem(clienteParaSeleccionar);
        
        
        
        //
        
        Cliente clienteSeleccionado = (Cliente) jcb_codCliente.getSelectedItem();
        
        txt_nombre.setText(clienteSeleccionado.getNombreCompleto());
        
        
    }//GEN-LAST:event_btn_buscarCodActionPerformed

    private void btn_reservarDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reservarDiaActionPerformed
        
        Date fechaSeleccionada = dt_fecha.getDate();
        String preferenciasSeleccionadas = txt_preferencias.getText();
        Cliente clienteSeleccionado = (Cliente) jcb_codCliente.getSelectedItem();
        
        // esto para casteo
        java.time.LocalDate fechaCasteada = fechaSeleccionada.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        
        
        DiaDeSpa diaCreado = new DiaDeSpa(fechaCasteada, preferenciasSeleccionadas, clienteSeleccionado, true, 0);
        
        operacionesDiaSpa.agregarDiaSpa(diaCreado);
        
        
        Sesiones vistaSesiones = new Sesiones();
        vistaSesiones.setVisible(true);
        
        
        pnl_gestorDiaSpa.add(vistaSesiones);
        pnl_gestorDiaSpa.setComponentZOrder(vistaSesiones, 0);
        
        
    }//GEN-LAST:event_btn_reservarDiaActionPerformed

    private void btn_borrarDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarDiaActionPerformed
        
        int seleccion = Integer.parseInt(txt_codPack.getText());
        
        operacionesDiaSpa.eliminarDiadeSpa(seleccion);
        
        JOptionPane.showMessageDialog(this, "Se elimino el dia de spa correctamente");
        
        
    }//GEN-LAST:event_btn_borrarDiaActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_preferenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_preferenciasActionPerformed
        
    }//GEN-LAST:event_txt_preferenciasActionPerformed

    private void jcb_codClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_codClienteActionPerformed
        
        Cliente clienteSeleccionado = (Cliente) jcb_codCliente.getSelectedItem();
        
        txt_nombre.setText(clienteSeleccionado.getNombreCompleto());
        
        
        
    }//GEN-LAST:event_jcb_codClienteActionPerformed

    private void btn_limpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarCamposActionPerformed
        
        txt_codPack.setText("");
        txt_preferencias.setText("");      
        dt_fecha.setDate(null);
        txt_nombre.setText("");  
        
        
        
        
    }//GEN-LAST:event_btn_limpiarCamposActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_borrarDia;
    private javax.swing.JButton btn_buscarCod;
    private javax.swing.JButton btn_limpiarCampos;
    private javax.swing.JButton btn_reservarDia;
    private com.toedter.calendar.JDateChooser dt_fecha;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<Cliente> jcb_codCliente;
    private javax.swing.JLabel lbl_codPack;
    private javax.swing.JLabel lbl_codigoCliente;
    private javax.swing.JLabel lbl_codigoCliente1;
    private javax.swing.JLabel lbl_fecha;
    private javax.swing.JLabel lbl_preferencias;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JPanel pnl_gestorDiaSpa;
    private javax.swing.JTextField txt_codPack;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_preferencias;
    // End of variables declaration//GEN-END:variables
}
