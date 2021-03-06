/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import clases.Persona;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author rmorales1
 */
public class Agregar extends javax.swing.JDialog {

    /**
     * Creates new form Agregar
     */
    String ruta;
    ObjectOutputStream salida;
    ArrayList<Persona> personas;
    int aux = 0;

    public Agregar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        try {
            initComponents();
            ruta = "src/datos/personas.txt";
            personas = Helper.traerDatos(ruta);
            salida = new ObjectOutputStream(new FileOutputStream(ruta));
            Helper.volcado(salida, personas);
            Helper.limpiarTabla(tblPersonas);
            Helper.llenadoTabla(tblPersonas, ruta);
            JButton botonesH[] = {cmdBuscar, cmdCancelar};
            JButton botonesD[] = {cmdAgregar, cmdEliminar};
            Helper.habilitarBotones(botonesH);
            Helper.deshabilitarBotones(botonesD);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbSexo = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        cmdAgregar = new javax.swing.JButton();
        cmdEliminar = new javax.swing.JButton();
        cmdCancelar = new javax.swing.JButton();
        cmdBuscar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersonas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AGREGAR PERSONAS");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Cédula:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
        jPanel2.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 110, -1));

        jLabel2.setText("Nombre:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 110, -1));

        jLabel3.setText("Apellido:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));
        jPanel2.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 110, -1));

        jLabel4.setText("Sexo:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Indefinido" }));
        jPanel2.add(cmbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 110, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 240, 150));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdAgregar.setText("Guardar");
        cmdAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAgregarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 100, -1));

        cmdEliminar.setText("Eliminar");
        cmdEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEliminarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 100, -1));

        cmdCancelar.setText("Cancelar");
        cmdCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 100, -1));

        cmdBuscar.setText("Buscar");
        cmdBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 100, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 130, 150));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Personas"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Cédula", "Nombre", "Apellido", "Sexo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPersonasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPersonas);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 400, 180));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 440, 230));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(531, 488));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAgregarActionPerformed

        try {
            String cedula, nombre, apellido, sexo;
            cedula = txtCedula.getText();
            nombre = txtNombre.getText();
            apellido = txtApellido.getText();
            sexo = cmbSexo.getSelectedItem().toString();
            ArrayList<Persona> personasActualizado;

            if (aux == 0) {

                Persona p = new Persona(cedula, nombre, apellido, sexo);
                p.guardar(salida);
                Helper.llenadoTabla(tblPersonas, ruta);
                txtNombre.setText("");
                txtCedula.setText("");
                txtApellido.setText("");
                txtCedula.requestFocusInWindow();

            } else {
                personasActualizado = Helper.actualizarPersona(ruta, cedula, nombre, apellido, sexo);
                salida = new ObjectOutputStream(new FileOutputStream(ruta));
                Helper.volcado(salida, personasActualizado);
                Helper.llenadoTabla(tblPersonas, ruta);
                Helper.mensaje(this, "Datos actulizados exitosamente", "Correcto!", 1);

                limpiar();

            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
            JButton botonesH[] = {cmdBuscar, cmdCancelar};
            JButton botonesD[] = {cmdAgregar, cmdEliminar};
            Helper.habilitarBotones(botonesH);
            Helper.deshabilitarBotones(botonesD);

    }//GEN-LAST:event_cmdAgregarActionPerformed

    private void cmdCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelarActionPerformed
        limpiar();
            JButton botonesH[] = {cmdBuscar, cmdCancelar};
            JButton botonesD[] = {cmdAgregar, cmdEliminar};
            Helper.habilitarBotones(botonesH);
            Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdCancelarActionPerformed

    private void tblPersonasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPersonasMouseClicked
        Persona p;
        int i;
        personas = Helper.traerDatos(ruta);
        i = tblPersonas.getSelectedRow();
        p = personas.get(i);

        txtCedula.setText(p.getCedula());
        txtNombre.setText(p.getNombre());
        txtApellido.setText(p.getApellido());
        cmbSexo.setSelectedItem(p.getSexo());
        aux = 1;
         JButton botonesH[] = {cmdEliminar, cmdAgregar, cmdCancelar};
            JButton botonesD[] = {cmdBuscar};
            Helper.habilitarBotones(botonesH);
            Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_tblPersonasMouseClicked

    private void cmdEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEliminarActionPerformed
        int i, op;
       
        op = JOptionPane.showConfirmDialog(this, "¿Seguro que desea eliminar?", "Eliminar", JOptionPane.YES_NO_OPTION);

        if (op == JOptionPane.YES_OPTION) {

            try {
                i = tblPersonas.getSelectedRow();
                personas.remove(i);
                salida = new ObjectOutputStream(new FileOutputStream(ruta));
                Helper.volcado(salida, personas);
                Helper.llenadoTabla(tblPersonas, ruta);
                txtNombre.setText("");
                txtCedula.setText("");
                txtApellido.setText("");
                txtCedula.requestFocusInWindow();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Agregar.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Agregar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

            JButton botonesH[] = {cmdBuscar, cmdCancelar};
            JButton botonesD[] = {cmdAgregar, cmdEliminar};
            Helper.habilitarBotones(botonesH);
            Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdEliminarActionPerformed

    private void cmdBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarActionPerformed
        String cedula;
        cedula = txtCedula.getText();
       
        
        if (Helper.buscarPorCedula(cedula, ruta)) {
            Persona p = Helper.traerPersona(cedula, ruta);
            txtNombre.setText(p.getNombre());
            txtApellido.setText(p.getApellido());
            cmbSexo.setSelectedItem(p.getSexo());
            aux = 1;
           
        } else {
            txtNombre.requestFocusInWindow();
            aux = 0;
           
        }
        
            JButton botonesH[] = {cmdAgregar, cmdCancelar};
            JButton botonesD[] = {cmdBuscar, cmdEliminar};
            Helper.habilitarBotones(botonesH);
            Helper.deshabilitarBotones(botonesD);
        
    }//GEN-LAST:event_cmdBuscarActionPerformed

    public void limpiar() {
        txtNombre.setText("");
        txtCedula.setText("");
        txtApellido.setText("");
        cmbSexo.setSelectedIndex(0);
        txtCedula.requestFocusInWindow();
        aux = 0;
    }

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
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Agregar dialog = new Agregar(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JButton cmdAgregar;
    private javax.swing.JButton cmdBuscar;
    private javax.swing.JButton cmdCancelar;
    private javax.swing.JButton cmdEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPersonas;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
