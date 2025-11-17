/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.DiaDeSpa;
import modelo.Instalacion;
import modelo.Tratamiento;
import persistencia.Conexion;
import persistencia.DiaDeSpaData;
import persistencia.InstalacionData;
import persistencia.MasajistaData;
import persistencia.SesionData;
import persistencia.TratamientoData;

/**
 *
 * @author Rickert
 */
public class Estadisticas extends javax.swing.JInternalFrame {

    private DefaultTableModel modeloTablaInstalacion;
    private DefaultTableModel modeloTablaTratamiento;

    Conexion con = new Conexion();

    DiaDeSpaData operacionesDiaSpa = new DiaDeSpaData(con);
    TratamientoData operacionesTratamiento = new TratamientoData(con);
    MasajistaData operacionesMasajista = new MasajistaData(con);
    InstalacionData operacionesInstalaciones = new InstalacionData(con);
    SesionData operacionesSesion = new SesionData(con);

    private ArrayList<Instalacion> listaI;
    private ArrayList<Tratamiento> listaT;

    public Estadisticas() {
        initComponents();

        modeloTablaInstalacion = new DefaultTableModel();
        modeloTablaTratamiento = new DefaultTableModel();

        cargarColumnasTablasInstalacion();
        cargarColumnasTablasTratamiento();

    }

    private void cargarColumnasTablasInstalacion() {

        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("Codigo Instalacion");
        filaCabecera.add("Nombre");
        filaCabecera.add("Detalle");
        filaCabecera.add("Precio x hora");
        for (Object it : filaCabecera) {
            modeloTablaInstalacion.addColumn(it);
        }
        tbl_instalacionesSolicitadas.setModel(modeloTablaInstalacion);

    }

    private void cargarColumnasTablasTratamiento() {

        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("Codigo Tratamiento");
        filaCabecera.add("Nombre");
        filaCabecera.add("Tipo");
        filaCabecera.add("Detalle");
        filaCabecera.add("Duracion");
        filaCabecera.add("Costo");
        for (Object it : filaCabecera) {
            modeloTablaTratamiento.addColumn(it);
        }
        tbl_tratamientosSolicitados.setModel(modeloTablaTratamiento);

    }

    private void borrarFilaTablaInstalacion() {

        int indice = modeloTablaInstalacion.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {

            modeloTablaInstalacion.removeRow(i);

        }

    }

    private void borrarFilaTablaTratamiento() {

        int indice = modeloTablaTratamiento.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {

            modeloTablaTratamiento.removeRow(i);

        }

    }

    private void cargarListadoInstalacion() {

        borrarFilaTablaInstalacion();

        Date fechaSesionInicio = jdc_primerafechaInstalacion.getDate();
        Date fechaSesionFin = jdc_segundafechaInstalacion.getDate();

        LocalDate fechaCasteadaInicio = fechaSesionInicio.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaCasteadaFin = fechaSesionFin.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        listaI = (ArrayList<Instalacion>) operacionesSesion.instalacionesMassolicitadas(fechaCasteadaInicio, fechaCasteadaFin);

        for (Instalacion instalacion : listaI) {

            modeloTablaInstalacion.addRow(new Object[]{
                instalacion.getCodInstal(),
                instalacion.getNombre(),
                instalacion.getDetalleUso(),
                instalacion.getPrecio30m()

            });

        }

    }

    private void cargarListadoTratamiento() {

        borrarFilaTablaTratamiento();

        Date fechaSesionInicio = jdc_primeraFechaTratamientos.getDate();
        Date fechaSesionFin = jdc_segundaFechaTratamientos.getDate();

        LocalDate fechaCasteadaInicio = fechaSesionInicio.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaCasteadaFin = fechaSesionFin.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        listaT = (ArrayList<Tratamiento>) operacionesSesion.tratamientoMasSolicitados(fechaCasteadaInicio, fechaCasteadaFin);

        for (Tratamiento tratamiento : listaT) {

            modeloTablaTratamiento.addRow(new Object[]{
                tratamiento.getCodTratam(),
                tratamiento.getNombre(),
                tratamiento.getTipo(),
                tratamiento.getDetalle(),
                tratamiento.getDuracion(),
                tratamiento.getCosto()

            });

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_InstalacionesSolicitadas = new javax.swing.JLabel();
        jdc_primerafechaInstalacion = new com.toedter.calendar.JDateChooser();
        jdc_segundafechaInstalacion = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_instalacionesSolicitadas = new javax.swing.JTable();
        lbl_tratamientosSolicitados = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_tratamientosSolicitados = new javax.swing.JTable();
        jdc_primeraFechaTratamientos = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jdc_segundaFechaTratamientos = new com.toedter.calendar.JDateChooser();
        btn_instalaciones = new javax.swing.JButton();
        btn_tratamientos = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        lbl_InstalacionesSolicitadas.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl_InstalacionesSolicitadas.setText("Ranking Instalaciones Solicitadas Entre Fechas");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Entre");

        tbl_instalacionesSolicitadas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_instalacionesSolicitadas);

        lbl_tratamientosSolicitados.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl_tratamientosSolicitados.setText("Tratamientos mas Solicitados entre fechas");

        tbl_tratamientosSolicitados.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbl_tratamientosSolicitados);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Entre");

        btn_instalaciones.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_instalaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busqueda_1.png"))); // NOI18N
        btn_instalaciones.setText("Buscar Instalaciones");
        btn_instalaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_instalacionesActionPerformed(evt);
            }
        });

        btn_tratamientos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_tratamientos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busqueda_1.png"))); // NOI18N
        btn_tratamientos.setText("Buscar Tratamientos");
        btn_tratamientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tratamientosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(384, 384, 384)
                .addComponent(jdc_primeraFechaTratamientos, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(jLabel4)
                .addGap(106, 106, 106)
                .addComponent(jdc_segundaFechaTratamientos, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(388, 388, 388)
                .addComponent(jdc_primerafechaInstalacion, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118)
                .addComponent(jLabel2)
                .addGap(113, 113, 113)
                .addComponent(jdc_segundafechaInstalacion, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_tratamientos)
                        .addGap(554, 554, 554))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_instalaciones)
                        .addGap(547, 547, 547))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_tratamientosSolicitados)
                        .addGap(308, 308, 308))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_InstalacionesSolicitadas)
                        .addGap(263, 263, 263))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1233, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(32, 32, 32))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbl_InstalacionesSolicitadas)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jdc_primerafechaInstalacion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jdc_segundafechaInstalacion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addComponent(btn_instalaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_tratamientosSolicitados)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdc_primeraFechaTratamientos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdc_segundaFechaTratamientos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(29, 29, 29)
                .addComponent(btn_tratamientos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_instalacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_instalacionesActionPerformed
        try {
            cargarListadoInstalacion();
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "Error: El código de sesión seleccionado no es un número válido.",
                    "Error de Formato", JOptionPane.ERROR_MESSAGE);

        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Error: eliga una fecha valida", "Error de Fecha", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, "Error: eliga una fecha valida", "Error de Fecha", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_instalacionesActionPerformed

    private void btn_tratamientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tratamientosActionPerformed
        try {
            cargarListadoTratamiento();
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "Error: El código de sesión seleccionado no es un número válido.",
                    "Error de Formato", JOptionPane.ERROR_MESSAGE);

        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Error: eliga una fecha valida", "Error de Fecha", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, "Error: eliga una fecha valida", "Error de Fecha", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_tratamientosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_instalaciones;
    private javax.swing.JButton btn_tratamientos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser jdc_primeraFechaTratamientos;
    private com.toedter.calendar.JDateChooser jdc_primerafechaInstalacion;
    private com.toedter.calendar.JDateChooser jdc_segundaFechaTratamientos;
    private com.toedter.calendar.JDateChooser jdc_segundafechaInstalacion;
    private javax.swing.JLabel lbl_InstalacionesSolicitadas;
    private javax.swing.JLabel lbl_tratamientosSolicitados;
    private javax.swing.JTable tbl_instalacionesSolicitadas;
    private javax.swing.JTable tbl_tratamientosSolicitados;
    // End of variables declaration//GEN-END:variables
}
