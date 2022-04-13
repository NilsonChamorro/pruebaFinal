/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.GaseosaControl;
import control.MarcasControl;
import datos.MarcasDAO;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.gaseosa;
import modelo.marcas;

/**
 *
 * @author juand
 */
public class FrmGaseosa extends javax.swing.JFrame {

    MarcasControl marcasControl = new MarcasControl();
    GaseosaControl gaseosasControl = new GaseosaControl();
    marcas marcasObj;
    gaseosa gaseosasObj;
    ArrayList<marcas> listaMarcas = new ArrayList<>();
    ArrayList<gaseosa> listagaseosas = new ArrayList<>();

    public FrmGaseosa() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.refrescar();
        additemMarcas();
    }

    public void refrescar() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("SABOR");
        modelo.addColumn("LITROS");
        modelo.addColumn("ENVASE");
        modelo.addColumn("PRECIO");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("MARCA");

        listagaseosas = gaseosasControl.listar("");
        Object[] fila = new Object[7];

        for (int i = 0; i < listagaseosas.size(); i++) {
            gaseosasObj = listagaseosas.get(i);
            fila[0] = gaseosasObj.getID();
            fila[1] = gaseosasObj.getSabor();
            fila[2] = gaseosasObj.getLitros();
            fila[3] = gaseosasObj.getEnvase();
            fila[4] = gaseosasObj.getPrecio();
            fila[5] = gaseosasObj.getCantidad();
            fila[6] = gaseosasObj.getMarck();

            modelo.addRow(fila);
        }
        tblBotas.setModel(modelo);
        txtSabor.setText("");
        txtLibros.setText("");
        txtEnvase.setText("");
        txtPrecio.setText("");
        txtCantidad.setText("");
        btnGrabar.setText("Grabar");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBotas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSabor = new javax.swing.JTextField();
        txtLibros = new javax.swing.JTextField();
        txtEnvase = new javax.swing.JTextField();
        CmbMarcas = new javax.swing.JComboBox();
        btnGrabar = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiModificar = new javax.swing.JMenuItem();
        jmiEliminar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Botas");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado"));

        tblBotas.setModel(new javax.swing.table.DefaultTableModel(
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
        tblBotas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblBotas);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel1.setText("sabor");

        jLabel2.setText("litros");

        jLabel3.setText("envase");

        jLabel4.setText("marca");

        btnGrabar.setText("Grabar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        lblId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setText("precio");

        jLabel6.setText("cantidad");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(txtEnvase)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtCantidad)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGrabar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSabor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(303, 303, 303))
                        .addComponent(txtLibros))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(CmbMarcas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLibros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEnvase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addComponent(CmbMarcas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGrabar))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)))
                .addGap(9, 9, 9))
        );

        jMenu1.setText("File");

        jmiModificar.setText("Modificar");
        jmiModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiModificarActionPerformed(evt);
            }
        });
        jMenu1.add(jmiModificar);

        jmiEliminar.setText("Eliminar");
        jmiEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEliminarActionPerformed(evt);
            }
        });
        jMenu1.add(jmiEliminar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        //Integer opc = CmbMarcas.getSelectedIndex();
        // if (opc != 0) {
        if (campos_completos()) {
            Integer id = null;

            if (lblId.getText() != null && lblId.getText() != "") {
                id = Integer.parseInt(lblId.getText());
            }

            String sabor = txtSabor.getText();
            int litros = Integer.parseInt(txtLibros.getText());
            String envase = txtEnvase.getText();
            int precio = Integer.parseInt(txtPrecio.getText());
            int cantidad = Integer.parseInt(txtCantidad.getText());
            marcas marca = ((marcas) CmbMarcas.getSelectedItem());

            //opc -= 1;
            //marcasObj = listaMarcas.get(opc);
            gaseosasObj = new gaseosa(id, sabor, litros, envase, precio, cantidad, marca);

            if (id == null) {
                gaseosasControl.insertar(gaseosasObj);
                JOptionPane.showMessageDialog(null, " creado..");
            } else {
                gaseosasControl.modificar(gaseosasObj);
                JOptionPane.showMessageDialog(null, " modificado ..");
            }
            this.refrescar();
        }
        //} else {
        //    JOptionPane.showMessageDialog(null, "Seleccione  ");
        //}
     }//GEN-LAST:event_btnGrabarActionPerformed

    private void jmiModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiModificarActionPerformed
        Integer filaNum = tblBotas.getSelectedRow();
        System.out.println("" + filaNum);

        if (filaNum < 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar");
        } else {
            DefaultTableModel modelo = (DefaultTableModel) tblBotas.getModel();
            Integer id = Integer.parseInt(modelo.getValueAt(filaNum, 0).toString());
            String whereTmp = " where g.id=" + id + " ";
            listagaseosas = gaseosasControl.listar(whereTmp);
            gaseosasObj = listagaseosas.get(0);

            //CmbMarcas.setSelectedItem(modelo.getValueAt(filaNum, 4));
            lblId.setText(gaseosasObj.getID().toString());
            txtSabor.setText(gaseosasObj.getSabor());
            txtLibros.setText(gaseosasObj.getLitros().toString());
            txtEnvase.setText(gaseosasObj.getEnvase());
            txtPrecio.setText(gaseosasObj.getPrecio().toString());
            txtCantidad.setText(gaseosasObj.getCantidad().toString());
            btnGrabar.setText("Modificar");
        }
    }//GEN-LAST:event_jmiModificarActionPerformed

    private void jmiEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEliminarActionPerformed
        Integer filaNum = tblBotas.getSelectedRow();
        if (filaNum < 0) {
            JOptionPane.showMessageDialog(null, "Seleccione... ");

        } else {
            DefaultTableModel modelo = (DefaultTableModel) tblBotas.getModel();
            Integer id = (Integer) modelo.getValueAt(filaNum, 0);
            Integer seguro = JOptionPane.showConfirmDialog(null, "quiere eliminar?  ");
            if (seguro == 0) {
                gaseosasObj = new gaseosa();
                gaseosasObj.setID(id);
                gaseosasControl.eliminar(gaseosasObj);
                this.refrescar();
            }
            JOptionPane.showMessageDialog(null, "eliminado.");
        }
    }//GEN-LAST:event_jmiEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmGaseosa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGaseosa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGaseosa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGaseosa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGaseosa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CmbMarcas;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem jmiEliminar;
    private javax.swing.JMenuItem jmiModificar;
    private javax.swing.JLabel lblId;
    private javax.swing.JTable tblBotas;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtEnvase;
    private javax.swing.JTextField txtLibros;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtSabor;
    // End of variables declaration//GEN-END:variables

    private void additemMarcas() {
        CmbMarcas.removeAllItems();
        CmbMarcas.addItem("Sin Marca");
        ArrayList<marcas> listar = marcasControl.listar("");
        for (marcas m : listar) {
            CmbMarcas.addItem(m);
        }
    }

    private boolean campos_completos() {
        boolean ok = false;
        if (!txtSabor.getText().trim().equals("")) {
            if (!txtLibros.getText().trim().equals("")) {
                if (!txtEnvase.getText().trim().equals("")) {
                    if (!txtPrecio.getText().trim().equals("")) {
                        if (!txtCantidad.getText().trim().equals("")) {
                            if (CmbMarcas.getSelectedIndex() > 0) {
                                ok = true;
                            } else {
                                JOptionPane.showMessageDialog(this, "FAVOR SELECCIONE LA MARCA");
                                CmbMarcas.requestFocus();
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "FAVOR CARGAR CAMPO CANTIDAD");
                            txtCantidad.requestFocus();
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "FAVOR CARGAR CAMPO PRECIO");
                        txtPrecio.requestFocus();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "FAVOR CARGAR CAMPO ENVASE");
                    txtEnvase.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(this, "FAVOR CARGAR CAMPO LITROS");
                txtLibros.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(this, "FAVOR CARGAR CAMPO SABOR");
            txtSabor.requestFocus();
        }
        return ok;
    }
}
