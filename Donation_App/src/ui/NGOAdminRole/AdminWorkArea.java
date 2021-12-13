/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.NGOAdminRole;

import Business.DB4OUtil.DB4OUtil;
import Business.Ecosystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author sarveshzeke
 */
public class AdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form AdminWorkArea
     */
    JPanel container;
    Ecosystem ecosystem;
    UserAccount userAccount;
    DB4OUtil db = DB4OUtil.getInstance();
    
    public AdminWorkArea(JPanel container, UserAccount ua,Ecosystem ecosystem) {
        initComponents();
        this.ecosystem = ecosystem;
        this.container = container;
        this.userAccount = ua;
        jButton4.setIcon(new ImageIcon(new ImageIcon("src/Business/Icon/back.jpeg").getImage().getScaledInstance(100, 50, Image.SCALE_DEFAULT)));
        jLabel1.setIcon(new ImageIcon(new ImageIcon("src/Business/Icon/admin.jpeg").getImage().getScaledInstance(708, 487, Image.SCALE_DEFAULT)));
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
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(0, 0, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Icon/back.png"))); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 60));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Admin Work ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, 30));

        jButton5.setText("Manage Company Requests");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, 60));

        jButton1.setText("Manage Schedules");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 230, 60));

        jButton6.setText("Manage Donations");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 210, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Icon/admin.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 670, 320));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.first(container);
        db.storeSystem(ecosystem);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         CompanyRequestPanel cr = new CompanyRequestPanel(container,ecosystem);
            container.add("CompanyRequest",cr);
            CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.show(container,"CompanyRequest");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ManageSchedulePanel ms = new ManageSchedulePanel(container,ecosystem);
        container.add("manageSchedule",ms);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.show(container,"manageSchedule");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         ManageDonationsPanel md = new ManageDonationsPanel(container,ecosystem);
        container.add("manageDonation",md);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.show(container,"manageDonation");
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
