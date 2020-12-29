/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UI_Stegano_Kripto;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class Dekripsi extends javax.swing.JFrame {
    private String coverpath;
    private EkstrakStegano ekstrak;

    
    public Dekripsi() {
        initComponents();
    }
    
     private File pilihfile(){
        
        JFileChooser pilih = new JFileChooser();
        int dapat = pilih.showDialog(null, null);
        if (dapat == JFileChooser.APPROVE_OPTION) {
            File direktori = pilih.getSelectedFile();
            return direktori;
        }
        return null;
    }
     private void dekrip(){
            String isitext = Thiden.getText();
            char k = (char)(isitext.charAt(0));
            String key = "",out = "";
            int jumkey = Integer.parseInt(String.valueOf(k))-1;

            for(int i = 1; i <= jumkey; i++){
            int index = isitext.charAt(i);
            char s = (char)(index-1);
            key = key + String.valueOf(s);
            }
            if (key.equals(TKeykrip.getText())){
                for(int i = (jumkey+1); i < isitext.length(); i++){
                int index = isitext.charAt(i);
                char s = (char)(index-1);
                out = out + String.valueOf(s);
            }
            Tpesan.setText(out);
            }else{
                for (int j = (jumkey+2); j < isitext.length(); j++) {
                int index = isitext.charAt(j);
                char a = (char)(index-0);
                out = out + String.valueOf(a);
                }
                Tpesan.setText(out);
            }
     }
     
     private void bersih(){
         Talamatfile.setText("");
         Thiden.setText("");
         lcover.setIcon(null);
         TKeykrip.setText("");
         Tpesan.setText("");
     }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Exit = new javax.swing.JLabel();
        MinimSize = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lcover = new javax.swing.JLabel();
        Bfilechoser = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        Breset = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Tpesan = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        TKeykrip = new javax.swing.JPasswordField();
        Bdecode = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Thiden = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        Talamatfile = new javax.swing.JTextField();
        Bdecryp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setForeground(new java.awt.Color(0, 51, 102));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        Exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Exit.setText("X");
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });

        MinimSize.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MinimSize.setForeground(new java.awt.Color(255, 255, 255));
        MinimSize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MinimSize.setText("-");
        MinimSize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimSizeMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Menu Decrypt");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 338, Short.MAX_VALUE)
                .addComponent(MinimSize, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addComponent(MinimSize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        jLabel4.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Masukan Stegano Image");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        lcover.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(lcover, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 500, 190));

        Bfilechoser.setBackground(new java.awt.Color(0, 51, 102));
        Bfilechoser.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        Bfilechoser.setForeground(new java.awt.Color(255, 255, 255));
        Bfilechoser.setText("Browse");
        Bfilechoser.setBorder(null);
        Bfilechoser.setContentAreaFilled(false);
        Bfilechoser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bfilechoser.setOpaque(true);
        Bfilechoser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BfilechoserActionPerformed(evt);
            }
        });
        jPanel2.add(Bfilechoser, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 90, 20));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Hiden Text");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 51, 153));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 500, 20));

        jSeparator3.setForeground(new java.awt.Color(0, 51, 153));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 500, 10));

        Breset.setBackground(new java.awt.Color(0, 51, 102));
        Breset.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        Breset.setForeground(new java.awt.Color(255, 255, 255));
        Breset.setText("Reset");
        Breset.setBorder(null);
        Breset.setContentAreaFilled(false);
        Breset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Breset.setOpaque(true);
        Breset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BresetActionPerformed(evt);
            }
        });
        jPanel2.add(Breset, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 500, 30));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Isi Pesan");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        Tpesan.setEditable(false);
        Tpesan.setBackground(new java.awt.Color(0, 51, 102));
        Tpesan.setForeground(new java.awt.Color(255, 255, 255));
        Tpesan.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Tpesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TpesanActionPerformed(evt);
            }
        });
        jPanel2.add(Tpesan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 500, 40));

        jSeparator4.setForeground(new java.awt.Color(0, 51, 153));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 500, 10));

        TKeykrip.setBackground(new java.awt.Color(0, 51, 102));
        TKeykrip.setForeground(new java.awt.Color(255, 255, 255));
        TKeykrip.setBorder(null);
        jPanel2.add(TKeykrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 500, -1));

        Bdecode.setBackground(new java.awt.Color(0, 51, 102));
        Bdecode.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        Bdecode.setForeground(new java.awt.Color(255, 255, 255));
        Bdecode.setText("Decode");
        Bdecode.setBorder(null);
        Bdecode.setContentAreaFilled(false);
        Bdecode.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bdecode.setOpaque(true);
        Bdecode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdecodeActionPerformed(evt);
            }
        });
        jPanel2.add(Bdecode, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 500, 30));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Masukan Key");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        Thiden.setEditable(false);
        Thiden.setBackground(new java.awt.Color(0, 51, 102));
        Thiden.setForeground(new java.awt.Color(255, 255, 255));
        Thiden.setBorder(null);
        Thiden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThidenActionPerformed(evt);
            }
        });
        jPanel2.add(Thiden, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 500, 40));

        jSeparator6.setForeground(new java.awt.Color(0, 51, 153));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 500, 10));

        Talamatfile.setEditable(false);
        Talamatfile.setBackground(new java.awt.Color(0, 51, 102));
        Talamatfile.setForeground(new java.awt.Color(255, 255, 255));
        Talamatfile.setBorder(null);
        jPanel2.add(Talamatfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 420, -1));

        Bdecryp.setBackground(new java.awt.Color(0, 51, 102));
        Bdecryp.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        Bdecryp.setForeground(new java.awt.Color(255, 255, 255));
        Bdecryp.setText("Decrypt");
        Bdecryp.setBorder(null);
        Bdecryp.setContentAreaFilled(false);
        Bdecryp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bdecryp.setOpaque(true);
        Bdecryp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdecrypActionPerformed(evt);
            }
        });
        jPanel2.add(Bdecryp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 500, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 690));

        setSize(new java.awt.Dimension(520, 644));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        // TODO add your handling code here:
        Menu_Utama utama = new Menu_Utama();
        utama.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ExitMouseClicked

    private void MinimSizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimSizeMouseClicked
        // TODO add your handling code here:
        this.setState(1);
    }//GEN-LAST:event_MinimSizeMouseClicked
int x,y;
    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
         int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        this.setLocation(xx-x, yy-y);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void BfilechoserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BfilechoserActionPerformed
        // TODO add your handling code here:
         try {
            File file = pilihfile();
            lcover.setIcon(new ImageIcon(ImageIO.read(new File(file.getPath()))));
            coverpath = file.getPath();
            this.Talamatfile.setText(coverpath);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            
        }
    }//GEN-LAST:event_BfilechoserActionPerformed

    private void BresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BresetActionPerformed
        // TODO add your handling code here:
        bersih();
    }//GEN-LAST:event_BresetActionPerformed

    private void BdecodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdecodeActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            String teksAlamatStego = this.Talamatfile.getText();
            BufferedImage stegoFile = ImageIO.read(new File(teksAlamatStego));
            this.ekstrak = new EkstrakStegano(stegoFile);
            this.Thiden.setText(this.ekstrak.ekstrakPesan());
        } catch (IOException ex) {
            Logger.getLogger(Dekripsi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BdecodeActionPerformed

    private void ThidenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThidenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ThidenActionPerformed

    private void TpesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TpesanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TpesanActionPerformed

    private void BdecrypActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdecrypActionPerformed
        // TODO add your handling code here:
        dekrip();
    }//GEN-LAST:event_BdecrypActionPerformed

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
            java.util.logging.Logger.getLogger(Dekripsi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dekripsi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dekripsi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dekripsi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dekripsi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bdecode;
    private javax.swing.JButton Bdecryp;
    private javax.swing.JButton Bfilechoser;
    private javax.swing.JButton Breset;
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel MinimSize;
    private javax.swing.JPasswordField TKeykrip;
    private javax.swing.JTextField Talamatfile;
    private javax.swing.JTextField Thiden;
    private javax.swing.JTextField Tpesan;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lcover;
    // End of variables declaration//GEN-END:variables
}