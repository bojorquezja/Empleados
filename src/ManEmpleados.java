import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManEmpleados extends javax.swing.JFrame {
    private List<Empleado> listaEmpleado;

    public ManEmpleados() {
        initComponents();
        listaEmpleado = new ArrayList<>();
        //oculta columna de Entidad
        jTable1.getColumnModel().getColumn(0).setMinWidth(0);
        jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(0).setWidth(0);
        this.setLocationRelativeTo(null);   //locacion del Frame
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfl0 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfl1 = new javax.swing.JTextField();
        jbtn_Buscar_ = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbtn_Agregar_ = new javax.swing.JButton();
        jbtn_Editar_ = new javax.swing.JButton();
        jbtn_Borrar_ = new javax.swing.JButton();
        jbtn_Equipos_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mantenimiento Empleados");

        jLabel1.setText("Nombre");

        jLabel2.setText("Sueldo");

        jbtn_Buscar_.setText("Buscar");
        jbtn_Buscar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_Buscar_ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ent", "Nombres", "DNI", "Sueldo", "Direccion", "Equipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jbtn_Agregar_.setText("Agregar");
        jbtn_Agregar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_Agregar_ActionPerformed(evt);
            }
        });

        jbtn_Editar_.setText("Editar");
        jbtn_Editar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_Editar_ActionPerformed(evt);
            }
        });

        jbtn_Borrar_.setText("Borrar");
        jbtn_Borrar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_Borrar_ActionPerformed(evt);
            }
        });

        jbtn_Equipos_.setText("Equipos");
        jbtn_Equipos_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_Equipos_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtn_Agregar_)
                        .addGap(36, 36, 36)
                        .addComponent(jbtn_Editar_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtn_Borrar_)
                        .addGap(37, 37, 37)
                        .addComponent(jbtn_Equipos_))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(tfl0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfl1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtn_Buscar_))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfl0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(tfl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_Buscar_))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_Agregar_)
                    .addComponent(jbtn_Editar_)
                    .addComponent(jbtn_Borrar_)
                    .addComponent(jbtn_Equipos_))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_Buscar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_Buscar_ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);   
        
        for (Empleado m : listaEmpleado) {
            double sueldo = ( tfl1.getText().isEmpty() ? 0.0 : Double.valueOf(tfl1.getText()) );
            if ( m.getNombres().contains(tfl0.getText()) && m.getSueldo() >= sueldo ) {
                Object[] ob = new Object[model.getColumnCount()];
                ob[0] = m;
                ob[1] = m.getNombres();
                ob[2] = m.getDni();
                ob[3] = m.getSueldo();
                ob[4] = m.getDireccion();
                ob[5] = m.getEquipos().size();
                model.addRow(ob);
            }
        }
        
    }//GEN-LAST:event_jbtn_Buscar_ActionPerformed

    private void jbtn_Agregar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_Agregar_ActionPerformed
        EdiEmpleado dialog = new EdiEmpleado(new javax.swing.JFrame(), true);
        dialog.setTitle("Agrega Empleado");
        dialog.setVisible(true);          
        
        if(dialog.isAceptado()){
            listaEmpleado.add(dialog.getEmpleado());
            ListIterator<Empleado> iter = listaEmpleado.listIterator();
            jbtn_Buscar_ActionPerformed(null);
        }
    }//GEN-LAST:event_jbtn_Agregar_ActionPerformed

    private void jbtn_Editar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_Editar_ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();       
        int numFila = jTable1.getSelectedRow();
        if (numFila >= 0){
            Empleado emp = (Empleado) model.getValueAt(numFila, 0);
            
            EdiEmpleado dialog = new EdiEmpleado(new javax.swing.JFrame(), true);
            dialog.setTitle("Edita Empleado");
            dialog.setEmpleado(emp);
            dialog.setVisible(true);          

            if(dialog.isAceptado()){
                ListIterator<Empleado> iter = listaEmpleado.listIterator();
                while(iter.hasNext()){
                    Empleado e = iter.next();
                    if (e.equals(emp)){
                        //asigna datos modificados 
                        emp.setNombres(dialog.getEmpleado().getNombres());
                        emp.setDni(dialog.getEmpleado().getDni());
                        emp.setSueldo(dialog.getEmpleado().getSueldo());
                        emp.setDireccion(dialog.getEmpleado().getDireccion());
                        iter.set(emp);
                    }
                }
                jbtn_Buscar_ActionPerformed(null);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Seleccione registro valido");
        }
    }//GEN-LAST:event_jbtn_Editar_ActionPerformed

    private void jbtn_Borrar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_Borrar_ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int numFila = jTable1.getSelectedRow();
        if (numFila >= 0){
            Empleado emp = (Empleado) model.getValueAt(numFila, 0);
            
            int resp = JOptionPane.showConfirmDialog(null, "Desea Borrar este elemento de la Lista?", "CONFIRMACION", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if(resp == JOptionPane.YES_OPTION){
                ListIterator<Empleado> iter = listaEmpleado.listIterator();
                while(iter.hasNext()){
                    Empleado e = iter.next();
                    if (e.equals(emp)){
                        iter.remove();  //borra en modo seguro
                    }
                }
                
                jbtn_Buscar_ActionPerformed(null);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Seleccione registro valido");
        }
        
    }//GEN-LAST:event_jbtn_Borrar_ActionPerformed

    private void jbtn_Equipos_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_Equipos_ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int numFila = jTable1.getSelectedRow();
        if (numFila >= 0){
            Empleado emp = (Empleado) model.getValueAt(numFila, 0);
            
            ManEquipos dialog = new ManEquipos(new javax.swing.JFrame(), true);

            dialog.setListaEquipos(emp.getEquipos());
            dialog.setVisible(true);                

            ListIterator<Empleado> iter = listaEmpleado.listIterator();
            while(iter.hasNext()){
                Empleado e = iter.next();
                if (e.equals(emp)){
                    //asigna datos modificados 
                    emp.setEquipos(dialog.getListaEquipos());
                    iter.set(emp);
                }
            }

            jbtn_Buscar_ActionPerformed(null);
                
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione registro valido");
        }
    }//GEN-LAST:event_jbtn_Equipos_ActionPerformed

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
            java.util.logging.Logger.getLogger(ManEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    private javax.swing.JButton jbtn_Agregar_;
    private javax.swing.JButton jbtn_Borrar_;
    private javax.swing.JButton jbtn_Buscar_;
    private javax.swing.JButton jbtn_Editar_;
    private javax.swing.JButton jbtn_Equipos_;
    private javax.swing.JTextField tfl0;
    private javax.swing.JTextField tfl1;
    // End of variables declaration//GEN-END:variables
}