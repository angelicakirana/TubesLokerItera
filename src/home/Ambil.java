/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import tubeslokeritera.koneksi;

/**
 *
 * @author asus
 */
public class Ambil extends javax.swing.JFrame {
    Connection connect = koneksi.getKoneksi();
    ResultSet r = null;
    PreparedStatement pre = null;
    
    
    /**
     * Creates new form Ambil
     */
    public Ambil() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        masukid = new javax.swing.JTextField();
        inputpw = new javax.swing.JPasswordField();
        Ambilbutton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lokeritera = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        bckutama = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        masukid.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        masukid.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel1.add(masukid, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 320, 40));

        inputpw.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        inputpw.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel1.add(inputpw, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 320, 40));

        Ambilbutton.setBackground(new java.awt.Color(102, 255, 255));
        Ambilbutton.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        Ambilbutton.setText("Ambil");
        Ambilbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ambilbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AmbilbuttonMouseClicked(evt);
            }
        });
        Ambilbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmbilbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(Ambilbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lokeritera.setFont(new java.awt.Font("Bookman Old Style", 1, 48)); // NOI18N
        lokeritera.setText("LOKER ITERA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(lokeritera)
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lokeritera)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 400, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/id.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/passwd.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, -1, -1));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/back.png"))); // NOI18N
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, -1));

        bckutama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/sewa (2).jpg"))); // NOI18N
        jPanel1.add(bckutama, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(600, 565));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AmbilbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AmbilbuttonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AmbilbuttonMouseClicked

    private void AmbilbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmbilbuttonActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(masukid.getText());
        idkeharga i = new idkeharga(id);
        
        ArrayList<Integer> nums = new ArrayList<>();
        String cari = "SELECT id from ambil";
        try{
           
    pre = koneksi.getKoneksi().prepareStatement(cari);
            r = pre.executeQuery();

            while(r.next()){
                int num = r.getInt ("id");
               
                nums.add(num);
            }   
        }
        catch (SQLException ex) {
            Logger.getLogger(Ambil.class.getName()).log(Level.SEVERE, null, ex);
        }        
        
        if(nums.contains(id)){
            JOptionPane.showMessageDialog(null, "ID Sudah Expired.");
        }
        
        /*
        String cekambil ="SELECT * FROM ambil where id=?";
        
        try {
            pre= koneksi.getKoneksi().prepareStatement(cekambil);
            
            pre.setInt(1, id);
             r=pre.executeQuery();
             
             
            if(r.next()){
                JOptionPane.showMessageDialog(null, "ID Sudah Expired.");
                Home hm = new Home();
                hm.setVisible(true);
                dispose();
            }else{
        */
                
                String cekidpw = "SELECT * FROM sewa where id=? AND password=?";
            r=null;
        try {
            pre= koneksi.getKoneksi().prepareStatement(cekidpw);
   
            pre.setInt(1, id);
            pre.setString(2, String.valueOf(inputpw.getPassword()));
            r=pre.executeQuery();
             
            if(r.next()){
                java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
                String sql = "INSERT INTO ambil values(?,?,?)";
                
            pre= koneksi.getKoneksi().prepareStatement(sql);
            pre.setInt(1, id);
            pre.setDate(2,sqlDate);
            int harga=5000;
            
            pre.setInt(3, harga);        
            pre.execute();
                 
                JOptionPane.showMessageDialog(null, "Berhasil.");
                Harga hg = new Harga();
                hg.setVisible(true);
                dispose();
            
                
            }
               
            //}
             
        } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Data Gagal Dimasukkan.");
            JOptionPane.showMessageDialog(null, ex);
        }
        
       
        
        
    }//GEN-LAST:event_AmbilbuttonActionPerformed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        Home nu = new Home();
        nu.setVisible(true);
        dispose();
    }//GEN-LAST:event_closeMouseClicked

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
            java.util.logging.Logger.getLogger(Ambil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ambil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ambil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ambil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Ambil am = new Ambil();
                am.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ambilbutton;
    private javax.swing.JLabel bckutama;
    private javax.swing.JLabel close;
    private javax.swing.JPasswordField inputpw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lokeritera;
    private javax.swing.JTextField masukid;
    // End of variables declaration//GEN-END:variables
}
