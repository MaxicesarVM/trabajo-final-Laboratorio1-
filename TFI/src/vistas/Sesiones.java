/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Masajista;

/**
 *
 * @author Maxi
 */
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
        jcombo_cliente = new javax.swing.JComboBox<>();
        jL_codCli = new javax.swing.JLabel();
        jl_masajista = new javax.swing.JLabel();
        jl_tratamiento = new javax.swing.JLabel();
        jc_diaTratamiento = new com.toedter.calendar.JCalendar();
        jcombo_masajista = new javax.swing.JComboBox<>();
        jcombo_tratamiento = new javax.swing.JComboBox<>();
        jtable_horarios = new javax.swing.JScrollPane();
        tbl_horarios = new javax.swing.JTable();
        jcl_fechas = new javax.swing.JLabel();
        btm_guardarReserva = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        jl_titulo = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jL_codCli.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jL_codCli.setForeground(new java.awt.Color(0, 0, 0));
        jL_codCli.setText("Cliente");

        jl_masajista.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jl_masajista.setForeground(new java.awt.Color(0, 0, 0));
        jl_masajista.setText("Masajista");

        jl_tratamiento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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

        jcl_fechas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jc_diaTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcl_fechas))
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btm_guardarReserva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_actualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_limpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jtable_horarios, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcombo_tratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jL_codCli)
                                .addGap(29, 29, 29)
                                .addComponent(jcombo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jcombo_masajista, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jl_masajista)
                            .addComponent(jl_tratamiento))
                        .addGap(410, 410, 410)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jl_titulo)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcombo_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_codCli))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_tratamiento)
                    .addComponent(jcombo_tratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_masajista)
                    .addComponent(jcombo_masajista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(jcl_fechas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jc_diaTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(btn_actualizar)
                        .addGap(60, 60, 60)
                        .addComponent(btn_limpiar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(319, 319, 319)
                .addComponent(btm_guardarReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(207, 207, 207))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtable_horarios, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private javax.swing.JLabel jL_codCli;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JCalendar jc_diaTratamiento;
    private javax.swing.JLabel jcl_fechas;
    private javax.swing.JComboBox<String> jcombo_cliente;
    private javax.swing.JComboBox<String> jcombo_masajista;
    private javax.swing.JComboBox<String> jcombo_tratamiento;
    private javax.swing.JLabel jl_masajista;
    private javax.swing.JLabel jl_titulo;
    private javax.swing.JLabel jl_tratamiento;
    private javax.swing.JScrollPane jtable_horarios;
    private javax.swing.JTable tbl_horarios;
    // End of variables declaration//GEN-END:variables
}
