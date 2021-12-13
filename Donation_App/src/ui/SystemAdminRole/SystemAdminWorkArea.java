/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemAdminRole;

import Business.DB4OUtil.DB4OUtil;
import Business.Ecosystem;
import java.awt.CardLayout;
import java.awt.Container;

import java.awt.Image;
import javax.swing.ImageIcon;

import javax.swing.JPanel;

/**
 *
 * @author sarveshzeke
 */
public class SystemAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkArea
     */
    DB4OUtil db4outil = DB4OUtil.getInstance();
    Ecosystem ecosystem;
    JPanel container;
    public SystemAdminWorkArea(JPanel container, Ecosystem ecosystem) {
        initComponents();
        this.ecosystem = ecosystem;
        this.container = container;

        jLabel1.setIcon(new ImageIcon(new ImageIcon("src/Business/Icon/man.png").getImage().getScaledInstance(254, 210, Image.SCALE_DEFAULT)));


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
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Icon/man.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, 210));

        jButton4.setText("Manage Users");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, 50));

        jButton5.setText("Manage NGOs");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, -1, 50));

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 0, 51));
        jButton6.setText("Logout");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 120, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        ManageUsersPanel mp = new ManageUsersPanel(container, ecosystem);
            container.add("manageUsers",mp);
            CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.show(container,"manageUsers");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         ManageNGOsPanel mn = new ManageNGOsPanel(container, ecosystem);
            container.add("manageNGOs",mn);
            CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.show(container,"manageNGOs");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        // TODO add your handling code here:
        db4outil.storeSystem(ecosystem);
         
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.first(container);

    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;

    // End of variables declaration//GEN-END:variables
}