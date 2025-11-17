package vistas;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import modelo.Instalacion;
import persistencia.Conexion;
import persistencia.InstalacionData;

/**
 *
 * @author Maxi
 */
public class ListadoInstalaciones extends javax.swing.JInternalFrame {

    private DefaultTableModel modeloTablaInstalacion;
    Conexion con = new Conexion();
    InstalacionData operacionesInstalaciones = new InstalacionData(con);

    public ListadoInstalaciones() {
        initComponents();
        modeloTablaInstalacion = new DefaultTableModel();
        

        cargarColumnasTablasInstalacion();
        cargarListadoInstalacion();
       
    }
        private void borrarFilaTablaInstalacion() {

        int indice = modeloTablaInstalacion.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {

            modeloTablaInstalacion.removeRow(i);

        }

    }
            private void cargarListadoInstalacion() {

        borrarFilaTablaInstalacion();




        ArrayList<Instalacion> listaI = (ArrayList<Instalacion>) operacionesInstalaciones.listarInstalacion();

        for (Instalacion instalacion : listaI) {

            modeloTablaInstalacion.addRow(new Object[]{
                instalacion.getCodInstal(),
                instalacion.getNombre(),
                instalacion.getDetalleUso(),
                instalacion.getPrecio30m()

            });

        }

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
        jTable1.setModel(modeloTablaInstalacion);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("LISTADO DE INSTALACIONES ");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(189, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(155, 155, 155))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                .addContainerGap())
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
