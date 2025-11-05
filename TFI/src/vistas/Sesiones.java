/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Masajista;


public class Sesiones extends javax.swing.JInternalFrame {

    
    private DefaultTableModel modeloTabla;
    
    
    
    
    
    
    public Sesiones() {
        initComponents();
        modeloTabla = new DefaultTableModel();
        
        cargarColumnasTablas();
        generarHorariosSesion();
    }

    
    
     private void cargarColumnasTablas(){
        
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("Hora inicio");
        filaCabecera.add("Hora fin");
        for(Object it: filaCabecera){
            modeloTabla.addColumn(it);
        }
        tbl_horarios.setModel(modeloTabla);
        
    }
    
    private void borrarFilaTabla(){
        
        int indice = modeloTabla.getRowCount() - 1;
        for(int i = indice; i >= 0 ; i-- ){
        
            modeloTabla.removeRow(i);
            
        
        }
         
    }
     
    
    private void generarHorariosSesion(){
        
        String[] horariosInicio = {
            "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", 
            "11:00", "11:30", "12:00", "12:30", "13:00", "13:30"
        };
        String[] horariosFin = {
            
            "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", 
            "11:30", "12:00", "12:30", "13:00", "13:30", "14:00"
            
        };
        
        for(int i = 0; i < horariosInicio.length; i++){
            
            modeloTabla.addRow(new Object[]{
                horariosInicio[i],
                horariosFin[i]
                   
                
                
            });
                
            
        }
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jL_codSesion = new javax.swing.JLabel();
        jl_masajista = new javax.swing.JLabel();
        jl_tratamiento = new javax.swing.JLabel();
        jcombo_masajista = new javax.swing.JComboBox<>();
        jcombo_tratamiento = new javax.swing.JComboBox<>();
        jtable_horarios = new javax.swing.JScrollPane();
        tbl_horarios = new javax.swing.JTable();
        jcl_fechas = new javax.swing.JLabel();
        btm_guardarReserva = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        jl_titulo = new javax.swing.JLabel();
        txt_productoTitulo = new javax.swing.JLabel();
        jcb_producto = new javax.swing.JComboBox<>();
        jdc_fecha = new com.toedter.calendar.JDateChooser();
        txt_codSesion = new javax.swing.JTextField();
        lbl_codPack = new javax.swing.JLabel();
        lbl_horariosLista = new javax.swing.JLabel();
        jcb_codPack = new javax.swing.JComboBox<>();
        lbl_instalacion = new javax.swing.JLabel();
        jcb_instalacion = new javax.swing.JComboBox<>();
        lbl_duracion = new javax.swing.JLabel();
        jcb_duracionInstalacion = new javax.swing.JComboBox<>();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jL_codSesion.setFont(new java.awt.Font("Alef", 1, 18)); // NOI18N
        jL_codSesion.setForeground(new java.awt.Color(0, 0, 0));
        jL_codSesion.setText("Codigo Sesion");

        jl_masajista.setFont(new java.awt.Font("Alef", 1, 18)); // NOI18N
        jl_masajista.setForeground(new java.awt.Color(0, 0, 0));
        jl_masajista.setText("Masajista");

        jl_tratamiento.setFont(new java.awt.Font("Alef", 1, 18)); // NOI18N
        jl_tratamiento.setForeground(new java.awt.Color(0, 0, 0));
        jl_tratamiento.setText("Tratamiento");

        tbl_horarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtable_horarios.setViewportView(tbl_horarios);

        jcl_fechas.setFont(new java.awt.Font("Alef", 1, 18)); // NOI18N
        jcl_fechas.setForeground(new java.awt.Color(0, 0, 0));
        jcl_fechas.setText("Fecha");

        btm_guardarReserva.setText("Reservar");
        btm_guardarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_guardarReservaActionPerformed(evt);
            }
        });

        btn_actualizar.setText("Modificar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_limpiar.setText("Limpiar Campos");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        jl_titulo.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jl_titulo.setForeground(new java.awt.Color(0, 0, 0));
        jl_titulo.setText("Gestor de reserva tratamiento ");

        txt_productoTitulo.setFont(new java.awt.Font("Alef", 1, 18)); // NOI18N
        txt_productoTitulo.setForeground(new java.awt.Color(0, 0, 0));
        txt_productoTitulo.setText("Producto");

        lbl_codPack.setFont(new java.awt.Font("Alef", 1, 18)); // NOI18N
        lbl_codPack.setForeground(new java.awt.Color(0, 0, 0));
        lbl_codPack.setText("Asignar a pack:");

        lbl_horariosLista.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_horariosLista.setForeground(new java.awt.Color(0, 0, 0));
        lbl_horariosLista.setText("Horarios");

        lbl_instalacion.setFont(new java.awt.Font("Alef", 1, 18)); // NOI18N
        lbl_instalacion.setForeground(new java.awt.Color(0, 0, 0));
        lbl_instalacion.setText("Instalacion");

        lbl_duracion.setFont(new java.awt.Font("Alef", 1, 18)); // NOI18N
        lbl_duracion.setForeground(new java.awt.Color(0, 0, 0));
        lbl_duracion.setText("Duracion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 381, Short.MAX_VALUE)
                                .addComponent(lbl_horariosLista))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_instalacion)
                                    .addComponent(lbl_duracion)
                                    .addComponent(jcl_fechas)
                                    .addComponent(lbl_codPack))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jcb_codPack, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jdc_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jcb_duracionInstalacion, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_productoTitulo)
                                    .addComponent(jl_masajista)
                                    .addComponent(jl_tratamiento)
                                    .addComponent(jL_codSesion))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jcombo_masajista, 0, 336, Short.MAX_VALUE)
                                        .addComponent(jcb_producto, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jcombo_tratamiento, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txt_codSesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jcb_instalacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(173, 173, 173))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btm_guardarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jtable_horarios, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jl_titulo)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_horariosLista)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jL_codSesion)
                            .addComponent(txt_codSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_tratamiento)
                            .addComponent(jcombo_tratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_productoTitulo)
                            .addComponent(jcb_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_masajista)
                            .addComponent(jcombo_masajista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_instalacion)
                            .addComponent(jcb_instalacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_duracion)
                            .addComponent(jcb_duracionInstalacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcl_fechas)
                            .addComponent(jdc_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_codPack)
                            .addComponent(jcb_codPack, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jtable_horarios, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(149, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btm_guardarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btn_limpiar)
                .addGap(18, 18, 18)
                .addComponent(btn_actualizar)
                .addGap(138, 138, 138))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btm_guardarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_guardarReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btm_guardarReservaActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_limpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btm_guardarReserva;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JLabel jL_codSesion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcb_codPack;
    private javax.swing.JComboBox<String> jcb_duracionInstalacion;
    private javax.swing.JComboBox<String> jcb_instalacion;
    private javax.swing.JComboBox<String> jcb_producto;
    private javax.swing.JLabel jcl_fechas;
    private javax.swing.JComboBox<String> jcombo_masajista;
    private javax.swing.JComboBox<String> jcombo_tratamiento;
    private com.toedter.calendar.JDateChooser jdc_fecha;
    private javax.swing.JLabel jl_masajista;
    private javax.swing.JLabel jl_titulo;
    private javax.swing.JLabel jl_tratamiento;
    private javax.swing.JScrollPane jtable_horarios;
    private javax.swing.JLabel lbl_codPack;
    private javax.swing.JLabel lbl_duracion;
    private javax.swing.JLabel lbl_horariosLista;
    private javax.swing.JLabel lbl_instalacion;
    private javax.swing.JTable tbl_horarios;
    private javax.swing.JTextField txt_codSesion;
    private javax.swing.JLabel txt_productoTitulo;
    // End of variables declaration//GEN-END:variables
}
