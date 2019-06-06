import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManEquipos extends javax.swing.JDialog {
    
    private List<Equipo> listaEquipos;

    public List<Equipo> getListaEquipos() {
        return listaEquipos;
    }

    public void setListaEquipos(List<Equipo> listaEquipos) {
        this.listaEquipos = listaEquipos;
        jbtn_Buscar_ActionPerformed(null);
    }
    
    
    public ManEquipos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        listaEquipos = new ArrayList<>();
        tfl0.requestFocus();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfl0 = new javax.swing.JTextField();
        jbtn_Buscar_ = new javax.swing.JButton();
        jbtn_Agregar_ = new javax.swing.JButton();
        jbtn_Borrar_ = new javax.swing.JButton();
        jbtn_Cerrar_ = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mantenimiento Equipos");

        jLabel1.setText("Numero");

        jbtn_Buscar_.setText("Buscar");
        jbtn_Buscar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_Buscar_ActionPerformed(evt);
            }
        });

        jbtn_Agregar_.setText("Agregar");
        jbtn_Agregar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_Agregar_ActionPerformed(evt);
            }
        });

        jbtn_Borrar_.setText("Borrar");
        jbtn_Borrar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_Borrar_ActionPerformed(evt);
            }
        });

        jbtn_Cerrar_.setText("Cerrar");
        jbtn_Cerrar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_Cerrar_ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(tfl0, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn_Agregar_)
                                .addGap(18, 18, 18)
                                .addComponent(jbtn_Borrar_)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jbtn_Cerrar_))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtn_Buscar_)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfl0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_Buscar_))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_Agregar_)
                    .addComponent(jbtn_Borrar_)
                    .addComponent(jbtn_Cerrar_))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_Buscar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_Buscar_ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (Equipo m : listaEquipos){
            if (m.getNumero().contains(tfl0.getText())){
                Object[] ob = new Object[1];
                ob[0] = m.getNumero();
                model.addRow(ob);
            }
        }
    }//GEN-LAST:event_jbtn_Buscar_ActionPerformed

    private void jbtn_Agregar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_Agregar_ActionPerformed
        String num = JOptionPane.showInputDialog("Ingrese Numero del Equipo");      
        if(num != null){
            Equipo e = new Equipo(num);
            listaEquipos.add(e);

            jbtn_Buscar_ActionPerformed(null);
        }   
    }//GEN-LAST:event_jbtn_Agregar_ActionPerformed

    private void jbtn_Borrar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_Borrar_ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();       
        int numFila = jTable1.getSelectedRow();
        if (numFila >= 0){
            Equipo equ = new Equipo((String) model.getValueAt(numFila, 0));
            
            int resp = JOptionPane.showConfirmDialog(null, "Desea Borrar este elemento de la Lista?", "CONFIRMACION", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if(resp == JOptionPane.YES_OPTION){
                ListIterator<Equipo> iter = listaEquipos.listIterator();
                while(iter.hasNext()){
                    Equipo e = iter.next();
                    if (e.equals(equ)){
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

    private void jbtn_Cerrar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_Cerrar_ActionPerformed
        this.setVisible(false);      
    }//GEN-LAST:event_jbtn_Cerrar_ActionPerformed

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
            java.util.logging.Logger.getLogger(ManEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ManEquipos dialog = new ManEquipos(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    private javax.swing.JButton jbtn_Agregar_;
    private javax.swing.JButton jbtn_Borrar_;
    private javax.swing.JButton jbtn_Buscar_;
    private javax.swing.JButton jbtn_Cerrar_;
    private javax.swing.JTextField tfl0;
    // End of variables declaration//GEN-END:variables
}
