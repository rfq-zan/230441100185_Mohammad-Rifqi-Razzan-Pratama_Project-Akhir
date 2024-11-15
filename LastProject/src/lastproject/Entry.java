/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lastproject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDateTime;
import java.sql.Timestamp;

/**
 *
 * @author ZAN
 */
public class Entry extends javax.swing.JFrame {
    Connection conn;
    private  DefaultTableModel model1;
    private int idPesanan;
    /**
     * Creates new form Entry
     */
    public Entry() {
        initComponents();
        conn = Koneksi.getConnection();
        
        model1 = new DefaultTableModel();
        tblOrg.setModel(model1);
        
        model1.addColumn("URUTAN PEMESANAN");
        model1.addColumn("NAMA PEMESAN");
        model1.addColumn("NOMOR MEJA");
        model1.addColumn("STATUS");
        model1.addColumn("WAKTU");
        
        tblOrg.getColumnModel().getColumn(2).setPreferredWidth(50);
        
        loadDataP();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPesan = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Title = new javax.swing.JPanel();
        Title1 = new javax.swing.JLabel();
        tfNama = new javax.swing.JTextField();
        tfNo = new javax.swing.JTextField();
        rbDine = new javax.swing.JRadioButton();
        rbTake = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrg = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnPesan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnKemb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 5));

        Title.setBackground(new java.awt.Color(255, 255, 153));
        Title.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));

        Title1.setFont(new java.awt.Font("Showcard Gothic", 2, 24)); // NOI18N
        Title1.setForeground(new java.awt.Color(0, 0, 0));
        Title1.setText("SILAHKAN MASUKKAN DATA PEMESANAN");

        javax.swing.GroupLayout TitleLayout = new javax.swing.GroupLayout(Title);
        Title.setLayout(TitleLayout);
        TitleLayout.setHorizontalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitleLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(Title1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TitleLayout.setVerticalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitleLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(Title1))
        );

        tfNama.setEnabled(false);

        tfNo.setEnabled(false);
        tfNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNoActionPerformed(evt);
            }
        });
        tfNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfNoKeyReleased(evt);
            }
        });

        bgPesan.add(rbDine);
        rbDine.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        rbDine.setForeground(new java.awt.Color(0, 0, 0));
        rbDine.setText("MAKAN DI TEMPAT");
        rbDine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDineActionPerformed(evt);
            }
        });

        bgPesan.add(rbTake);
        rbTake.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        rbTake.setForeground(new java.awt.Color(0, 0, 0));
        rbTake.setText("BUNGKUS");
        rbTake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTakeActionPerformed(evt);
            }
        });

        tblOrg.setModel(new javax.swing.table.DefaultTableModel(
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
        tblOrg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrgMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblOrg);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("No. MEJA =");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("NAMA       =");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("DAFTAR PEMESAN :");

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));
        jPanel2.setLayout(new java.awt.GridLayout(3, 1));

        btnPesan.setBackground(new java.awt.Color(102, 255, 204));
        btnPesan.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnPesan.setForeground(new java.awt.Color(255, 255, 255));
        btnPesan.setText("PESAN");
        btnPesan.setEnabled(false);
        btnPesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesanActionPerformed(evt);
            }
        });
        jPanel2.add(btnPesan);

        btnUbah.setBackground(new java.awt.Color(102, 255, 204));
        btnUbah.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnUbah.setForeground(new java.awt.Color(255, 255, 255));
        btnUbah.setText("UBAH");
        btnUbah.setEnabled(false);
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });
        jPanel2.add(btnUbah);

        btnKemb.setBackground(new java.awt.Color(102, 255, 204));
        btnKemb.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnKemb.setForeground(new java.awt.Color(255, 255, 255));
        btnKemb.setText("KEMBALI");
        btnKemb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembActionPerformed(evt);
            }
        });
        jPanel2.add(btnKemb);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(rbDine)
                        .addGap(74, 74, 74)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(rbTake, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbDine)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(rbTake))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfNo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(5, 5, 5)
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 381));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void loadDataP() {
        model1.setRowCount(0);
        
        try {
            String sql = "SELECT * FROM orang";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                model1.addRow(new Object[]{
                    rs.getInt("id"),
                    rs.getString("nama_pemesan"),
                    rs.getString("no_meja"),
                    rs.getString("status"),
                    rs.getString("tanggal")
                });
            }
        } catch (SQLException e) {
            System.out.println("Error Save Data" + e.getMessage());
        }
    }
    
    private void rbDineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDineActionPerformed
    tfNama.setEnabled(true);
    tfNo.setEnabled(true);
    btnPesan.setEnabled(true);
    }//GEN-LAST:event_rbDineActionPerformed

    private void rbTakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTakeActionPerformed
    tfNama.setEnabled(true);
    tfNo.setEnabled(false);    
    tfNo.setText("");
    btnPesan.setEnabled(true);
    }//GEN-LAST:event_rbTakeActionPerformed

    private void btnPesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesanActionPerformed
    String nama = tfNama.getText();
    String noMeja = tfNo.getText().trim(); // Trim whitespace
    String status;
    ImageIcon konf = new ImageIcon(getClass().getResource("img/cheff.png"));
    LocalDateTime waktu = LocalDateTime.now();

    try {
        if (rbDine.isSelected()) {
            // Validate non-empty and numeric `noMeja`
            if (noMeja.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nomor Meja harus diisi untuk makan di tempat.", "Peringatan", JOptionPane.WARNING_MESSAGE);
                return; // Exit the method early
            }

            int nomor = Integer.parseInt(noMeja); // Parsing noMeja here after checking it is non-empty
            if (nomor > 10) {
                JOptionPane.showMessageDialog(null, "Nomor Meja tidak boleh lebih dari 10", "Peringatan", JOptionPane.WARNING_MESSAGE);
                tfNo.setText("");
                return; 
            }

            // Check if noMeja already exists
            String sqlCheck = "SELECT COUNT(*) FROM orang WHERE no_meja = ?";
            PreparedStatement psCheck = conn.prepareStatement(sqlCheck);
            psCheck.setString(1, noMeja);
            ResultSet rsCheck = psCheck.executeQuery();
            if (rsCheck.next() && rsCheck.getInt(1) > 0) {
                JOptionPane.showMessageDialog(null, "Nomor Meja sudah ada, silakan pilih nomor lain", "Peringatan", JOptionPane.WARNING_MESSAGE);
                tfNo.setText("");
                return;
            }

            // Insert for "Makan di Tempat"
            status = "Makan di Tempat";
            String sqlInsert = "INSERT INTO orang (nama_pemesan, no_meja, status, tanggal) VALUES (?, ?, ?, ?)";
            PreparedStatement psInsert = conn.prepareStatement(sqlInsert);
            psInsert.setString(1, nama);
            psInsert.setString(2, noMeja); 
            psInsert.setString(3, status);
            psInsert.setTimestamp(4, Timestamp.valueOf(waktu));
            psInsert.executeUpdate();
            
        loadDataP();
        rbDine.setSelected(false);
        rbTake.setSelected(false);
        tfNama.setText("");
        tfNo.setText("");
        btnPesan.setEnabled(false);

        int opsi = JOptionPane.showConfirmDialog(this, "Anda yakin data sudah benar ?", "KONFIRMASI", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, konf);

        if (opsi == JOptionPane.YES_OPTION) {
            rbDine.setSelected(false);
            rbTake.setSelected(false);
            tfNama.setText("");
            tfNo.setText("");
            this.dispose();
            JOptionPane.showMessageDialog(this, "Silahkan duduk sesuai nomor meja anda\nNomor meja anda(" + noMeja + ")", "SELAMAT DATANG", JOptionPane.INFORMATION_MESSAGE, konf);
            CULINARY frame = new CULINARY();
            frame.setVisible(true);
        }

        } else if (rbTake.isSelected()) {
            // Insert for "Bungkus" with empty `noMeja` - only 3 parameters
            status = "Bungkus";
            String sqlInsert = "INSERT INTO orang (nama_pemesan, status, tanggal) VALUES (?, ?, ?)";
            PreparedStatement psInsert = conn.prepareStatement(sqlInsert);
            psInsert.setString(1, nama);
            psInsert.setString(2, status);
            psInsert.setTimestamp(3, Timestamp.valueOf(waktu));
            psInsert.executeUpdate();
                    loadDataP();
        rbDine.setSelected(false);
        rbTake.setSelected(false);
        tfNama.setText("");
        tfNo.setText("");
        btnPesan.setEnabled(false);

        int opsi = JOptionPane.showConfirmDialog(this, "Anda yakin data sudah benar ?", "KONFIRMASI", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, konf);

        if (opsi == JOptionPane.YES_OPTION) {
            rbDine.setSelected(false);
            rbTake.setSelected(false);
            tfNama.setText("");
            tfNo.setText("");
            this.dispose();
            JOptionPane.showMessageDialog(this, "Silahkan menunggu pesanan di tempat tunggu, Terimakasih.", "SELAMAT DATANG", JOptionPane.INFORMATION_MESSAGE, konf);
            CULINARY frame = new CULINARY();
            frame.setVisible(true);
        }
        }

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Nomor Meja harus berupa angka.", "Peringatan", JOptionPane.WARNING_MESSAGE);
    } catch (SQLException e) {
        System.out.println("Error Saving Data: " + e.getMessage());
    }
    }//GEN-LAST:event_btnPesanActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
   int ubah = tblOrg.getSelectedRow();
    
    if (ubah == -1) {
        JOptionPane.showMessageDialog(null, "Silakan pilih data yang ingin diubah.", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }

    if (!rbDine.isSelected() && !rbTake.isSelected()) {
        JOptionPane.showMessageDialog(null, "Silakan pilih antara 'Makan di Tempat' atau 'Bungkus'", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }

    int id = (int) model1.getValueAt(ubah, 0);
    String nama = tfNama.getText();
    String status = rbDine.isSelected() ? "Makan di Tempat" : "Bungkus";
    ImageIcon konf = new ImageIcon(getClass().getResource("img/cheff.png"));
    
    if (rbTake.isSelected()) {
        tfNo.setText(""); 
    } else if (rbDine.isSelected() && tfNo.getText().trim().isEmpty()) {
        tfNo.setText(""); 
    }

    try {

        int noMeja = rbDine.isSelected() ? Integer.parseInt(tfNo.getText()) : 0;

        if (noMeja > 10) {
            JOptionPane.showMessageDialog(null, "Nomor Meja tidak boleh lebih dari 10", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(rbDine.isSelected()){
        String sqlcek = "SELECT COUNT(*) FROM orang WHERE no_meja = ? AND id != ?";
        PreparedStatement pscek = conn.prepareStatement(sqlcek);
        pscek.setInt(1, noMeja);
        pscek.setInt(2, id);

        ResultSet rs = pscek.executeQuery();
        if (rs.next() || rs.getInt(1) > 0) { 
            JOptionPane.showMessageDialog(null, "Nomor Meja sudah ada, silakan pilih nomor lain", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String upsql = "UPDATE orang SET nama_pemesan = ?, no_meja = ?, status = ? WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(upsql);
        ps.setString(1, nama);
        ps.setInt(2, noMeja);
        ps.setString(3, status);
        ps.setInt(4, id);
        ps.executeUpdate();
        loadDataP();
        }else if(rbTake.isSelected()){
        String upsql = "UPDATE orang SET nama_pemesan = ?, no_meja = ?, status = ? WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(upsql);
        ps.setString(1, nama);
        ps.setString(2, "");
        ps.setString(3, status);
        ps.setInt(4, id);
        ps.executeUpdate();
        loadDataP();  
        }
        rbDine.setSelected(false);
        rbTake.setSelected(false);
        tfNama.setText("");
        tfNo.setText("");
        tblOrg.clearSelection();
        
        int opsi = JOptionPane.showConfirmDialog(this, "ANDA YAKIN DATA PEMESANAN SUDAH BENAR ?", "KONFIRMASI", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, konf);
        if (opsi == JOptionPane.YES_OPTION) {
            CULINARY frame = new CULINARY();
            frame.setVisible(true);
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat mengubah data pemesanan", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Nomor Meja harus berupa angka.", "Peringatan", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnKembActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembActionPerformed
    ImageIcon konf = new ImageIcon(getClass().getResource("img/cheff.png"));
    
    int opsi = JOptionPane.showConfirmDialog(this, "Anda yakin ingin kembali ke menu awal ?", "KONFIRMASI", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, konf);
     
     if(opsi == JOptionPane.YES_OPTION){
        Form frame = new Form();
        frame.setVisible(true); 
        this.dispose();
     }
    }//GEN-LAST:event_btnKembActionPerformed

    private void tfNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNoKeyReleased
//    try {
//
//     } catch (NumberFormatException e) {
//        tfNo.setText("");
//        JOptionPane.showMessageDialog(null, "Silakan masukkan nomor meja yang valid", "Peringatan", JOptionPane.WARNING_MESSAGE);
//    }catch (SQLException e) {
//        JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat memeriksa nomor meja", "Peringatan", JOptionPane.ERROR_MESSAGE);
//    }
    }//GEN-LAST:event_tfNoKeyReleased

    private void tblOrgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrgMouseClicked
    int selectRow = tblOrg.getSelectedRow();

    if (selectRow != -1) { 
        tfNama.setText((String) model1.getValueAt(selectRow, 1));
        tfNo.setText((String) model1.getValueAt(selectRow, 2));

        boolean tf = !tfNama.getText().trim().isEmpty();
        boolean rb = rbDine.isSelected() || rbTake.isSelected();

        btnUbah.setEnabled(tf && rb);
    } else {
        btnUbah.setEnabled(false);
    }
//    btnUbah.setEnabled(true);
//    btnPesan.setEnabled(false);
    }//GEN-LAST:event_tblOrgMouseClicked

    private void tfNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNoActionPerformed

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
            java.util.logging.Logger.getLogger(Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Title;
    private javax.swing.JLabel Title1;
    private javax.swing.ButtonGroup bgPesan;
    private javax.swing.JButton btnKemb;
    private javax.swing.JButton btnPesan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbDine;
    private javax.swing.JRadioButton rbTake;
    private javax.swing.JTable tblOrg;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfNo;
    // End of variables declaration//GEN-END:variables
}