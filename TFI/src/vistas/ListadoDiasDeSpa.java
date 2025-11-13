/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import modelo.DiaDeSpa;
import modelo.Sesion;
import persistencia.Conexion;
import persistencia.DiaDeSpaData;
import persistencia.InstalacionData;
import persistencia.MasajistaData;
import persistencia.SesionData;
import persistencia.TratamientoData;


public class ListadoDiasDeSpa extends javax.swing.JInternalFrame {

    private DefaultTableModel modeloTabla;
    
    Conexion con = new Conexion();
    
    DiaDeSpaData operacionesDiaSpa = new DiaDeSpaData(con);
    TratamientoData operacionesTratamiento = new TratamientoData(con);
    MasajistaData operacionesMasajista = new MasajistaData(con);
    InstalacionData operacionesInstalaciones = new InstalacionData(con);
    SesionData operacionesSesion = new SesionData(con);
    
    private ArrayList<DiaDeSpa> listaD;
    
    
    
    public ListadoDiasDeSpa() {
        initComponents();
        
        modeloTabla = new DefaultTableModel();
        
        cargarColumnasTablas();
        
        
    }

    
    private void cargarColumnasTablas(){
        
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("Codigo Dia Spa");
        filaCabecera.add("Preferencias Cliente");
        filaCabecera.add("Nombre Cliente");
        for(Object it: filaCabecera){
            modeloTabla.addColumn(it);
        }
        table_diasDeSpa.setModel(modeloTabla);
        
    }    
    
    
    
    private void borrarFilaTabla(){
        
        int indice = modeloTabla.getRowCount() - 1;
        for(int i = indice; i >= 0 ; i-- ){
        
            modeloTabla.removeRow(i);
            
        
        }
         
    }
    
    private void cargarListadoDiaSpa(){
    
        borrarFilaTabla();
        
        Date fechaSesion = jdc_diaElegido.getDate();
        
        LocalDate fechaCasteada = fechaSesion.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        
        listaD = (ArrayList<DiaDeSpa>) operacionesDiaSpa.listarDiaSpaPorFecha(fechaCasteada);
        
        for(DiaDeSpa diaspa: listaD){
            
            modeloTabla.addRow(new Object[]{
            
            diaspa.getCodPack(),
            diaspa.getPreferencias(),
            diaspa.getCliente().getNombreCompleto()
             
            
            });
            
            
            
        }
        
        
    
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_fechaDias = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_diasDeSpa = new javax.swing.JTable();
        jdc_diaElegido = new com.toedter.calendar.JDateChooser();
        btn_buscarDia = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        lbl_fechaDias.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_fechaDias.setText("Elija una fecha para ver los Dias de Spa asociados ");

        table_diasDeSpa.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table_diasDeSpa);

        btn_buscarDia.setText("Buscar Dias de Spa");
        btn_buscarDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarDiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_fechaDias))
                .addGap(106, 106, 106))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(jdc_diaElegido, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btn_buscarDia, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lbl_fechaDias)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jdc_diaElegido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_buscarDia, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarDiaActionPerformed
        
        cargarListadoDiaSpa();
        
        
        
        
        
        
    }//GEN-LAST:event_btn_buscarDiaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscarDia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdc_diaElegido;
    private javax.swing.JLabel lbl_fechaDias;
    private javax.swing.JTable table_diasDeSpa;
    // End of variables declaration//GEN-END:variables
}
