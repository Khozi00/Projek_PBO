/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khozi.view;
import khozi.controller.MahasiswaController;

public class FormMahasiswa extends javax.swing.JFrame {

    /**
     * Creates new form FormMahasiswa
     */
    MahasiswaController controller;
    public FormMahasiswa() {
        initComponents();
        controller = new MahasiswaController(this);
        controller.bersihForm();
        controller.tampilData();
    }
    
    public javax.swing.JTextField getTxtNobp(){
        return txtNobp;
    }
    
    public javax.swing.JTextField getTxtNama(){
        return txtNama;
    }
    
    public javax.swing.JTextField getTxtAlamat(){
        return txtAlamat;
    }
    
    public javax.swing.JTextField getTxtJenkel(){
        return txtJenkel;
    }

    
    public javax.swing.JTable getTblMahasiswa(){
        return tblMahasiswa;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAlamat = new javax.swing.JTextField();
        txtNobp = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMahasiswa = new javax.swing.JTable();
        txtJenkel = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Nama");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 70, 41, 20);

        jLabel2.setText("Alamat");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 110, 50, 20);

        jLabel3.setText("Jenis Kelamin");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 150, 120, 20);

        jLabel4.setText("NOBP");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 30, 41, 20);

        txtAlamat.setText("jTextField1");
        getContentPane().add(txtAlamat);
        txtAlamat.setBounds(180, 110, 260, 26);

        txtNobp.setText("jTextField1");
        txtNobp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNobpActionPerformed(evt);
            }
        });
        getContentPane().add(txtNobp);
        txtNobp.setBounds(180, 30, 260, 26);

        txtNama.setText("jTextField1");
        getContentPane().add(txtNama);
        txtNama.setBounds(180, 70, 260, 26);

        btnCancel.setText("Cancel");
        getContentPane().add(btnCancel);
        btnCancel.setBounds(370, 210, 90, 29);

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert);
        btnInsert.setBounds(40, 210, 90, 29);

        btnUpdate.setText("Update");
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(150, 210, 90, 29);

        btnDelete.setText("Delete");
        getContentPane().add(btnDelete);
        btnDelete.setBounds(260, 210, 90, 29);

        tblMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NOBP", "Nama", "Alamat", "Jenis Kelamin"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMahasiswa.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblMahasiswa);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(12, 260, 460, 260);

        txtJenkel.setText("jTextField1");
        getContentPane().add(txtJenkel);
        txtJenkel.setBounds(180, 150, 260, 26);

        setBounds(0, 0, 505, 589);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNobpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNobpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNobpActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        controller.save();
        controller.tampilData();
        controller.bersihForm();
    }//GEN-LAST:event_btnInsertActionPerformed

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
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMahasiswa;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtJenkel;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNobp;
    // End of variables declaration//GEN-END:variables
}
